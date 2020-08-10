package tech.chnjing.factory;

public class XmlRuleConfigParser implements RuleConfigParser {
    @Override
    public RuleConfig parse(String filePath) {
        return new RuleConfig("Xml");
    }
}
