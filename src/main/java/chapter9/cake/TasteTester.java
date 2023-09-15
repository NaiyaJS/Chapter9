package chapter9.cake;

public class TasteTester {

    public static void main(String[] args){
        BirthdayCake bdayCake = new BirthdayCake();
        bdayCake.setPrice(37.99);
        System.out.println("Birthday Cake Flavor: " + bdayCake.getFlavor());
        System.out.println("Birthday Cake Price: " + bdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Strawberry");
        System.out.println("Wedding Cake Flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding Cake Price: " + weddingCake.getPrice());

        Cake cake = new Cake("Carmel");
        cake.setPrice(25.35);
        System.out.println("Cake Flavor: " + cake.getFlavor());
        System.out.println("Cake Price: " + cake.getPrice());
    }
}
