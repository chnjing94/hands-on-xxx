package tech.chnjing.factory.factorymethod;

import tech.chnjing.factory.RuleConfigParser;
import tech.chnjing.factory.XmlRuleConfigParser;

public class XmlRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
