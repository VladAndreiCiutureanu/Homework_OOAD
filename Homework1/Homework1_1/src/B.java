import java.util.Scanner;

public class B extends A{
    protected String s;
    public B(){
        super(0);
    }
    public void readS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter B.s:");
        s = sc.nextLine();
    }

    @Override
    public void displayX() {
        System.out.println("B.x = " + getX());
    }
}
