package singletonreview;
import singletonreview.StaticBlockSingleton;
import singletonreview.LazySingleton;
public class App {
    public static void main(String[] args) {
        singletonreview.EagerSingleton.getInstance().getProducts();
        StaticBlockSingleton.getInstance().getProducts();
        LazySingleton.getInstance().getProducts();
        ThreadSafeSingleton.getInstance().getProducts();
        BillPughSingleton.getInstance().getProducts();
    }
    
}
