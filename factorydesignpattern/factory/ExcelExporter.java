package factorydesignpattern.factory;

class ExcelExporter implements FileExporter {
        
        @Override
        public String export(String content) {
            return "EXCEL FILE -> "+content;
        }
        
    
}
