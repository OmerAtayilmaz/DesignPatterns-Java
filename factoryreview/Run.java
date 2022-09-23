package factoryreview;

import factoryreview.FileConverterFactory.Converter;

public class Run {
    public static void main(String[] args) {
        String result=FileConverterFactory.getInstance(Converter.PDF).convert("IMAGE_PATH");
        System.out.println(result);
    }
}
