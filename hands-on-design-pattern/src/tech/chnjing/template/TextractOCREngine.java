package tech.chnjing.template;

public class TextractOCREngine extends OCREngine {
    @Override
    void detectTextRegion() {
        System.out.println("Do detectTextRegion by Textract");
    }

    @Override
    void transcribeTextRegion() {
        System.out.println("Do transcribeTextRegion by Textract");
    }

    @Override
    void extractForm() {
        System.out.println("Do extractForm by Textract");
    }

    @Override
    void extractTable() {
        System.out.println("Do extractTable by Textract");
    }

    @Override
    void generateOutput() {
        System.out.println("Do generateOutput by Textract");
    }
}
