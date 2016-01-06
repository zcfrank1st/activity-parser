import grammar.generated.ActivityBaseListener;
import grammar.generated.ActivityParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by zcfrank1st on 1/5/16.
 */
public class Activity extends ActivityBaseListener {
    @Override
    public void enterMain(ActivityParser.MainContext ctx) {
        String type = ctx.getChild(0).getChild(0).getText(); // type
        System.out.println(type);

        ParseTree expressionList = ctx.getChild(2);

        for (int i=0; i< expressionList.getChildCount(); i++) {
            ParseTree expression = expressionList.getChild(i); // expression

            System.out.println(expression.getChild(0).getText());
            System.out.println(expression.getChild(1).getText());
            System.out.println(expression.getChild(2).getText());

            System.out.println(expression.getChild(4).getChild(0).getText());
            System.out.println(expression.getChild(4).getChild(1).getText());
        }
    }
}
