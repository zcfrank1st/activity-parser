import grammar.generated.ActivityBaseVisitor;
import grammar.generated.ActivityParser;

/**
 * Created by zcfrank1st on 1/6/16.
 */
public class ActivityVisitor extends ActivityBaseVisitor {
    private String content = "";
    @Override
    public Object visitType(ActivityParser.TypeContext ctx) {
        combiner(ctx.getText());
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitName(ActivityParser.NameContext ctx) {
        combiner(ctx.getText());
        return super.visitName(ctx);
    }

    @Override
    public Object visitLabel(ActivityParser.LabelContext ctx) {
        combiner(ctx.getText());
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitOpt(ActivityParser.OptContext ctx) {
        combiner(ctx.getText());
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitThreshold(ActivityParser.ThresholdContext ctx) {
        combiner(ctx.getText());
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitHost(ActivityParser.HostContext ctx) {
        combiner(ctx.getText());
        return super.visitChildren(ctx);
    }

    @Override
    public Object visitEffect(ActivityParser.EffectContext ctx) {
        combiner(ctx.getText());
        return super.visitChildren(ctx);
    }

    private String combiner(String s) {
        return content += s + "@";
    }

    public String getContent() {
        return content;
    }
}
