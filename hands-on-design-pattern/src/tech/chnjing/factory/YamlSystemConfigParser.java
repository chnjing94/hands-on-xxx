package tech.chnjing.factory;

public class YamlSystemConfigParser implements SystemConfigParser {
    @Override
    public SystemConfig parse(String filePath) {
        return new SystemConfig("Yaml");
    }
}
