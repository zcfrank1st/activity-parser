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
        String list = "AND { QUANTITY >= 5 -> TOTAL_PRICE -10 QUANTITY >= 10 -> TOTAL_PRICE -10 TOTAL_PRICE >= 10000 -> ITEM 1,2,4}";

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

        String[] parts = content.split("\\|");

        List<Rule> rules = new ArrayList<>();
        Activity activity = new Activity();
        String type = parts[0];

        activity.setType(type);

        for (int i=0; i< (parts.length - 1) / 5; i++) {
            Rule rule = new Rule();
            rule.setLabel(parts[i * 5 + 1]);
            rule.setOpt(parts[i * 5 + 2]);
            rule.setThreshold(parts[i * 5 + 3]);
            rule.setSide(parts[i * 5 + 4]);
            rule.setEffect(parts[i * 5 + 5]);
            rules.add(rule);
        }

        activity.setRules(rules);

        Gson gson = new Gson();
        System.out.println(gson.toJson(activity));
    }
}
