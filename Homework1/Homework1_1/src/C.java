import java.util.Scanner;

public class C extends B {
    protected float y;

    public void readY(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C.y:");
        y = sc.nextFloat();
    }

    public void readX(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C.x:");
        x = sc.nextInt();
    }

    public void displayXYS(){
        System.out.println("x = " + getX());
        System.out.println("y = " + y);
        System.out.println("s = " + s);
    }
}
