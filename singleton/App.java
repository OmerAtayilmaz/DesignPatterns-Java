package singleton;

class App{
    public static void main(String[] args) {
        /* 
         * EagerInitialization Dezavantajı Uygualama her çalıştığında EagerInitialization classı çalışacağında otomatik olarak instance oluşturur.
         * EagerInitialization Dezavantajı Class içeriisinde exception handling yapmamıza olanak sağlamaz.
        */
        singleton.EagerInitialization.getInstance().singletonTest();

        /*
         * Dezavantajı: her çalıştığında boşta bekleyen instancelerinin olmasıdır. Yani kullanılmasa bile instance oluşturulur.
        */
        singleton.StaticBlockInitialization.getBlockInitialization().singletonTest();

        /*
         * EagerInitialization & StaticBlockInitialization yöntemlerinin dez avantajı kullanılmasa bile heap'de hazır bekleyen instance oluşturmasıdır.
        */

        singleton.LazySingleton.getLazySingleton().singletonTest();
        /*
         * LazySingleton Dezavantajı: LazySingleton threads safe degildir! 2 kişi/servis eşzamanlı bu nesneye erişmeye çalışırsa runtime exception vs. tarzı hata alırız
         * 
        */

        singleton.ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();
        /*
         * ThreadSafeSingleton Dezavantajı: threadin kullanılıp kullanılmadığını kontrol etmek için extra maliyet harcamaktadır.
        */

        singleton.BillPughSingleton.getInstance().singletonTest();

        /*
         * load-time'dan kazandırır. thread-safe için sync yaparsak kazandırmaz :))
         * inner class sayesinde iki taraflı erişimle INSTANCE oluştururuz.
        */
    }

}
