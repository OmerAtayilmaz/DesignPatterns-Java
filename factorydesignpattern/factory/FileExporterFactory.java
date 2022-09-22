package factorydesignpattern.factory;

public class FileExporterFactory {
    
    public static FileExporter getInstance(FileType FileType){
       switch(FileType){
        case PDF:
            return new PDFExporter();
        case EXCEL:
            return new ExcelExporter();
        default:
             throw new UnsupportedOperationException("File type not supported");
       }
    }
    public enum FileType{
        PDF,EXCEL
    }
}
