import bean.Activity;
import bean.Rule;
import com.google.common.base.Splitter;
import com.google.gson.Gson;
import grammar.generated.ActivityBaseVisitor;
import grammar.generated.ActivityLexer;
import grammar.generated.ActivityParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;

/**
 * Created by zcfrank1st on 1/5/16.
 */
public class Parser {
    public static void main(String[] args) {
        String list = "AND { 满五减十 @ QUANTITY >= 5 -> TOTAL_PRICE -10 满五减十 @ QUANTITY >= 10 -> TOTAL_PRICE -10 满五减十 @ TOTAL_PRICE >= 10000 -> ITEM 1,2,4}";

        ActivityLexer lexer = new ActivityLexer(new ANTLRInputStream(list));

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ActivityParser parser = new ActivityParser(tokens);

        ParseTree tree = parser.main();

//        ParseTreeWalker walker = new ParseTreeWalker();
//
//        walker.walk(new ActivityProcessor(), tree);

        ActivityVisitor activityVisitor = new ActivityVisitor();
        activityVisitor.visit(tree);

        String content = activityVisitor.getContent();
        String[] parts = content.split("@");

        List<Rule> rules = new ArrayList<>();
        Activity activity = new Activity();
        String type = parts[0];

        activity.setType(type);

        for (int i=0; i< (parts.length - 1) / 6; i++) {
            Rule rule = new Rule();
            rule.setName(parts[i * 6 + 1]);
            rule.setLabel(parts[i * 6 + 2]);
            rule.setOpt(parts[i * 6 + 3]);
            rule.setThreshold(parts[i * 6 + 4]);
            rule.setSide(parts[i * 6 + 5]);
            rule.setEffect(parts[i * 6 + 6]);
            rules.add(rule);
        }

        activity.setRules(rules);

        Gson gson = new Gson();
        System.out.println(gson.toJson(activity));
    }
}
