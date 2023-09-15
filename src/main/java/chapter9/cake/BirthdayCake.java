package chapter9.cake;

public class BirthdayCake extends Cake {
    public int candles;

    public BirthdayCake(){
        super("vanilla");
    }
    public int getCandles(){
        return candles;
    }
    public void setCandles(int candles){
        this.candles = candles;
    }
}
