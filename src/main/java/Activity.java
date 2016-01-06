import grammar.generated.ActivityBaseListener;
import grammar.generated.ActivityParser;

/**
 * Created by zcfrank1st on 1/5/16.
 */
public class Activity extends ActivityBaseListener {
    @Override
    public void enterMain(ActivityParser.MainContext ctx) {
        System.out.println(ctx.getText());
    }
}
