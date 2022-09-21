package singletonreview;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton(){}
    private static ThreadSafeSingleton threadSafeSingleton;
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(threadSafeSingleton==null)
            threadSafeSingleton=new ThreadSafeSingleton();
        return threadSafeSingleton;
    }
    public void getProducts(){
        System.out.println("Threadd safe singleton");
    }
}
