public class Application {
    public static void main(String[] args) {
        Coefficients coefficients = new Coefficients();
        coefficients.readFromConsole();
        Equation equation = new Equation(coefficients);
        Solution solution = equation.solve();
        WriteToJson.write(solution);
    }
}
