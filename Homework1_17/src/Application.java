public class Application {
    public static void main(String[] args) {
        Equation eq = new Equation(1, 2, 3);
        System.out.println(eq);
        Solution sol = eq.solution();
        if(sol != null) {
            sol.printSolution();
        }
    }


}