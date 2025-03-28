import java.util.InputMismatchException;

public class Test {
    public static void main(String[] args) {
        App app = new App();
        Integer nr, sum=0;
        boolean flag = false;
        while(true){
            try{
                nr = app.readNumber();
                sum += nr;
                if(flag){
                    break;
                }
                else{
                    flag = true;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter an int number.");
            }
        }
        System.out.println("Sum: " + sum);
    }
}
