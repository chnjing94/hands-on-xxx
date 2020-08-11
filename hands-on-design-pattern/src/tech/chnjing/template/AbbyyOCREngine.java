package tech.chnjing.template;

public class AbbyyOCREngine extends OCREngine {
    @Override
    void detectTextRegion() {
        System.out.println("Do detectTextRegion by Abbyy");
    }

    @Override
    void transcribeTextRegion() {
        System.out.println("Do transcribeTextRegion by Abbyy");
    }

    @Override
    void extractForm() {
        System.out.println("Do extractForm by Abbyy");
    }

    @Override
    void extractTable() {
        System.out.println("Do extractTable by Abbyy");
    }

    @Override
    void generateOutput() {
        System.out.println("Do generateOutput by Abbyy");
    }
}
