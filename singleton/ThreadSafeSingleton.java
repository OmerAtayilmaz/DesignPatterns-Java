package singleton;

class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;
    private ThreadSafeSingleton(){}

    
    /*
     * sychronoized: eger bır thread calısırken baska bır ıstek gelırse sıraya girer ve ilk threadin bitmesini bekler.
     * Dezavantaj: her sync işleminde tekrar thread kullanılıyor mu kontrolü yapılacağından bunun için extra bir maliyeti olmaktadır.
    */
    public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
        if(threadSafeSingleton==null)
            threadSafeSingleton=new ThreadSafeSingleton();
        return threadSafeSingleton;
    }


    public void singletonTest(){
        System.out.println("HELLO FROM THREAD SAFE SINGLETON");
    }
}