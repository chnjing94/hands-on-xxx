package tech.chnjing.factory;

public class YamlRuleConfigParser implements RuleConfigParser {
    @Override
    public RuleConfig parse(String filePath) {
        return new RuleConfig("Yaml");
    }
}
