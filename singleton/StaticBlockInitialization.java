package singleton;


public class StaticBlockInitialization {
    
    private static StaticBlockInitialization staticBlockInitialization;

    //static initialization, instance yaratılmadan önce çalışır.
    static{
        try{
            staticBlockInitialization=new StaticBlockInitialization();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private StaticBlockInitialization(){

    }

    //bu classa erişmenin tek yolu
    public static StaticBlockInitialization getBlockInitialization(){
        return staticBlockInitialization;
    }

    public void singletonTest(){
        System.out.println("HELLO FROM STATIC BLOCK INITIALIZATION");
    }
}