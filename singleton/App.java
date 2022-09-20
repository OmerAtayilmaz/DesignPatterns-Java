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
        singleton.StaticBlockInitialization .getBlockInitialization().singletonTest();

        /*
         * EagerInitialization & StaticBlockInitialization yöntemlerinin dez avantajı kullanılmasa bile heap'de hazır bekleyen instance oluşturmasıdır.
        */
    }

}
