package singletonreview;

public class LazySingleton {
   private LazySingleton(){}
   private static LazySingleton lazySingleton; 
   public static LazySingleton getInstance(){
    if(lazySingleton==null)
        lazySingleton=new LazySingleton();
    return lazySingleton;
   }
   public void getProducts(){
    System.out.println("LAZY SINGLETON");
   }
}
