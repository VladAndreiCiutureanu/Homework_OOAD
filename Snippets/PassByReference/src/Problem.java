public class Problem {

    public static void function(int x){
        x = 3;
    }

    public static void main(String[] args) {
        int x = 2;
        function(x);
        System.out.println(x);
    }
}
