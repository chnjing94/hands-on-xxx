package tech.chnjing.factory.method;

import tech.chnjing.factory.RuleConfigParser;
import tech.chnjing.factory.XmlRuleConfigParser;

public class XmlRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
