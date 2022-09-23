package factoryreview;

import java.security.InvalidParameterException;

public class FileConverterFactory {
    public enum Converter{
        PDF,IMAGE
    };
    
    public static FileConverter getInstance(Converter converter){
        switch(converter){
            case PDF:
                return new ImagesToPdf();
            case IMAGE:
                return new PdfToImage();
            default:
                throw new InvalidParameterException("Invalid parametre girildi");   
        }
    }
}