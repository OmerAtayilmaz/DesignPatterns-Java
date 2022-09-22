package factory;

public class Run{
    public static void main(String[] args) {
        String result=FileExporterFactory
        .getInstance(FileExporterFactory.FileType.PDF)
        .export("myContent");
        System.out.println(result);

    }
}