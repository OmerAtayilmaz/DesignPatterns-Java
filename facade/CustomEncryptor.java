package facade;

public class CustomEncryptor {
    public static void main(String[] args) {
        String text="Content";

        AESEncryptor aesEncryptor=new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor=new MD5Encryptor();
        md5Encryptor.encrypt(text,"KEY");

        SHAEncrptor shaEncryptor=new SHAEncrptor();
        shaEncryptor.encrypt(text, "KEY", true);


        //facade
         EncryptorFacade  encryptorFacade=new EncryptorFacade();
         encryptorFacade.encrypt(text, EncryptorFacade.EncType.SHA);
    }
}
