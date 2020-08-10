package tech.chnjing.factory.method;

import tech.chnjing.factory.PropertiesRuleConfigParser;
import tech.chnjing.factory.RuleConfigParser;

public class PropertiesRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
