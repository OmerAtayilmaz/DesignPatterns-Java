package singletonreview;

public class BillPughSingleton {
    private BillPughSingleton(){}

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    public void getProducts(){
        System.out.println("Bill Pugh Sİngleton");
    }
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE=new BillPughSingleton();
    }
}
