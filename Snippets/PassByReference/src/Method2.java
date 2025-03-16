public class Method2 {

    public static void function(int[] x){
        x[0] = 3;
    }

    public static void main(String[] args) {
        int[] x = new int[]{2};
        function(x);
        System.out.println(x[0]);
    }

}
