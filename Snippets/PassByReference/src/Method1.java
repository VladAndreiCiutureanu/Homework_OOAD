import java.util.concurrent.atomic.AtomicInteger;

public class Method1 {

    public static void function(AtomicInteger x){
        x.set(3);
    }

    public static void main(String[] args) {
        AtomicInteger x = new AtomicInteger(2);
        function(x);
        System.out.println(x);
    }
}
