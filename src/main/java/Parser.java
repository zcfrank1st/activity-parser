import grammar.generated.ActivityLexer;
import grammar.generated.ActivityParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new Activity(), tree);
    }
}
