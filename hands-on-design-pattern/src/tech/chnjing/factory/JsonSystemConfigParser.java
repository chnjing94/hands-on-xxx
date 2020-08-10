package tech.chnjing.factory;

public class JsonSystemConfigParser implements SystemConfigParser {
    @Override
    public SystemConfig parse(String filePath) {
        return new SystemConfig("Json");
    }
}
