package singleton;

class BillPughSingleton {

    public BillPughSingleton(){}
    public void singletonTest(){
        System.out.println("HELLO FROM BBILL PUGH SINGLETON");
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    /*
     * bu classa ne zaman ihtiyaç olursa o zaman JVM'e yüklenir.
    */
    public static class SingletonHelper{
        private static final BillPughSingleton INSTANCE=new BillPughSingleton();
    }
}