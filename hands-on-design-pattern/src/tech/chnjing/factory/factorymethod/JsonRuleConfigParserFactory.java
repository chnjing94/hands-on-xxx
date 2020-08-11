package tech.chnjing.factory.factorymethod;

import tech.chnjing.factory.JsonRuleConfigParser;
import tech.chnjing.factory.RuleConfigParser;

public class JsonRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
