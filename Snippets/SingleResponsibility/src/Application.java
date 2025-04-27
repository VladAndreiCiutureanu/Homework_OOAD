public class Application {
    public static void main(String[] args) {
        Coefficients coefficients = new Coefficients();
        coefficients.readFromKeyboard();
        Equation equation = new Equation(coefficients);
        Solution solution = equation.solve();
        DisplaySolution.displaySolution(solution);
    }
}
