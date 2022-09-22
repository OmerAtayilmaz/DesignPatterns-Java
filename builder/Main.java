package builder;

public class Main {
    public static void main(String[] args) {

        //BUILDER KULLANIMI
        Product product=new Product.ProductBuilder()
        .name("MYNAME")
        .size("large")
        .category("WEARABLE TECHS")
        .deliveryCost("FREE")
        .brand("KEKKO")
        .color("PING")
        .deliveryTime("5 DAYS")
        .image("URI1")
        .image2("URI2")
        .image3("URI3")
        .build();
        System.out.println(product);
    }
}
