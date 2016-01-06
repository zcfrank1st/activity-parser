package bean;

import java.util.List;

/**
 * Created by zcfrank1st on 1/6/16.
 */
public class Activity {
    private String type;
    private List<Rule> rules;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }
}
