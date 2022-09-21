package singletonreview;

public class StaticBlockSingleton {
    private static StaticBlockSingleton staticBlockSingleton;
    //static initialization
    static{
        try{
            staticBlockSingleton=new StaticBlockSingleton();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private StaticBlockSingleton(){

    }
    public static StaticBlockSingleton getInstance(){
        return staticBlockSingleton;
    }
    public void getProducts(){
        System.out.println("Static Block Singleton");
    }
}
