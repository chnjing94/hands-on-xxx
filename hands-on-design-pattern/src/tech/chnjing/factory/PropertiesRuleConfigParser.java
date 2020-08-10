package tech.chnjing.factory;

public class PropertiesRuleConfigParser implements RuleConfigParser {
    @Override
    public RuleConfig parse(String filePath) {
        return new RuleConfig("Properties");
    }
}
