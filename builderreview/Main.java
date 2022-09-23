package builderreview;
import builderreview.*;


public class Main {
    public static void main(String[] args) {
        User u=new User
        .UserBuilder()
        .id(5L)
        .name("Ahmet")
        .password("D4EÇ10XDSAD")
        .build();   
        System.out.println(u);
    }
 
}
