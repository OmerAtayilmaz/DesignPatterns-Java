package factoryreview;

public class ImagesToPdf implements FileConverter{

    @Override
    public String convert(String file){
        return "Converted Image " + file + " to PDF";
    }
    
}