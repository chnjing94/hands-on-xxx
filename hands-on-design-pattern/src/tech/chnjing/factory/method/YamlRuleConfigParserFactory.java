package tech.chnjing.factory.method;

import tech.chnjing.factory.RuleConfigParser;
import tech.chnjing.factory.YamlRuleConfigParser;

public class YamlRuleConfigParserFactory implements RuleConfigParserFactory {
    @Override
    public RuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
