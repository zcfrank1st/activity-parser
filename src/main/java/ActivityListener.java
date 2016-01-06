import bean.Activity;
import bean.Rule;
import grammar.generated.ActivityBaseListener;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zcfrank1st on 1/5/16.
 */
public class ActivityListener extends ActivityBaseListener {
    @Override
    public void enterMain(grammar.generated.ActivityParser.MainContext ctx) {
//        Activity activity = new Activity();
//        List<Rule> rules = new ArrayList<>();
//
//        activity.setType(ctx.getChild(0).getChild(0).getText()); // type
//
//        ParseTree expressionList = ctx.getChild(2);
//        for (int i=0; i< expressionList.getChildCount(); i++) {
//            ParseTree expression = expressionList.getChild(i); // expression
//
//            Rule rule = new Rule();
//            rule.setLabel(expression.getChild(0).getText());
//            rule.setOpt(expression.getChild(1).getText());
//            rule.setThreshold(expression.getChild(2).getText());
//
//            rule.setSide(expression.getChild(4).getChild(0).getText());
//            rule.setEffect(expression.getChild(4).getChild(1).getText());
//
//            rules.add(rule);
//        }
//        activity.setRules(rules);
    }
}
