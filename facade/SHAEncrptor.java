package facade;

class SHAEncrptor {
    public String encrypt(String text,String key, Boolean tip){
        if(tip)
            return "<SHA>"+text+key +"</SHA>";
        else
            return "<SHA>"+key+text +"</SHA>";
    }
}