package facade;

public class EncryptorFacade {
 
    private AESEncryptor aesEncryptor=new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncrptor shaEncrptor=new SHAEncrptor();

    public void encrypt(String text,EncType encType){
        switch(encType){
            case AES: aesEncryptor.encrypt(text); break;
            case MD5: md5Encryptor.encrypt(text, "KEY"); break;
            case SHA: shaEncrptor.encrypt(text, "key", true);
            default:
            throw new IllegalArgumentException(encType.toString()+" is an invalid type");
        }
    }

    public enum EncType{
        SHA,MD5,AES
    }
}