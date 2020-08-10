package tech.chnjing.factory;

public class JsonRuleConfigParser implements RuleConfigParser {
    @Override
    public RuleConfig parse(String filePath) {
        return new RuleConfig("Json");
    }
}
