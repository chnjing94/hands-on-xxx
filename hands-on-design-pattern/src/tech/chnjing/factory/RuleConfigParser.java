package tech.chnjing.factory;

import tech.chnjing.factory.RuleConfig;

public interface RuleConfigParser {
    RuleConfig parse(String filePath);
}
