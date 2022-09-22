package factory;

class PDFExporter implements FileExporter{ 
    
        @Override
        public String export(String content) {
            return "PDF FILE -> "+content;
        }
        
    
}
