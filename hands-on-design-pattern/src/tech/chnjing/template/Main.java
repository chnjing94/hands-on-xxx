package tech.chnjing.template;

public class Main {
    public static void main(String[] args) {
        OCREngine engine = new GoogleVisionOCREngine();
        engine.execute("test");
    }
}
