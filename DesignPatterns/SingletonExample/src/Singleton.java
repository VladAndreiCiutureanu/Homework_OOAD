import java.util.Random;

public class Singleton {
    private static Singleton instance;
    private int value;
    private Singleton(){
        Random rand = new Random();
        value = rand.nextInt(1000);
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public int getValue(){
        return value;
    }
}
