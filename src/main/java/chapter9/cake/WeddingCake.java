package chapter9.cake;

public class WeddingCake extends Cake{


    public int tiers;

    public WeddingCake() {
        super("vanilla");
    }


    public int getTiers(){
        return tiers;
    }
    public void setTiers(int tiers){
        this.tiers =tiers;
    }

}
