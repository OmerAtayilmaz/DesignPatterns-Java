# Singleton

    - Eager initialization
    - Static Block initialization
    - Lazy initialization
    - ThreadSafe singleton
    - Bill Pugh Singleton



    - ProductDao productDao=new ProductDao(); 
    !! each instance occupy a place on memory !!

    Let's assume:

    we've 1 millions request at once, and each request takes 1KB

    it'll take 1.000.000 KB place on the server
    don't forget each dao opens a connection to "DB" each connection has its own expense.

    1.000.000 KB approxiametly 1 GB !
    1.000.000 Connection

    For Instance, PGSQL only accept 100 connection from "single" user. So
    how we can handle this problem? with Singletion.

    JVM içerisinde/RAM'de 1 instance ile bütün işimizi görme işlemi "Singleton Design Pattern" ile sağlanır.
    Oluşturulan instance heap memoryde kullanıma hazır halde bekler.

    ## Eager Singleton
    - disadvantage: you cannot use try-catch 
    - disadvantage: its create an instance automaticly, it doesn't matter you need or not!

    ## StaticBlock Singleton
    - disadvantage: its creates an instance auto, wheather you need or not 


    ## Lazy Singleton
    - disadvantage: the object which created is not "thread-safe". So 2 service/user can try to access at the same time and it might return exception.

    ## Threadsafe singleton
    - disadvantage: while checking if the object is already using by someone/something, it costs extra expense.

    ## BillPugh Singleton
        - load time kazandırır.
        - thread-safe ayarlanabilir fakat load-time kazandırmaz.
        - inner class sayesinde iki taraflı erişimle INSTANCE oluştururuz.


# 