package tech.chnjing.factory;

public class PropertiesSystemConfigParser implements SystemConfigParser {
    @Override
    public SystemConfig parse(String filePath) {
        return new SystemConfig("Properties");
    }
}
