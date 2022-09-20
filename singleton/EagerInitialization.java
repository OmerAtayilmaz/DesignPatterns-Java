package singleton;

class EagerInitialization{
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    private EagerInitialization(){

    }

    public static EagerInitialization getInstance(){
        return INSTANCE;
    }

    public void singletonTest(){
        System.out.println("Singleton Method çalıştı");
    }
}