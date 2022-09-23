package facade;

class MD5Encryptor {
    public String encrypt(String text,String key){
        return "<MD5>"+text+key+"</MD5>";
    }
}
