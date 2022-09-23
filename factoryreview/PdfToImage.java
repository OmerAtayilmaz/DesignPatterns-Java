package factoryreview;

public class PdfToImage implements FileConverter{
    @Override
    public String convert(String file){
        return "Converted PDF " + file + "to Image";
    }
}