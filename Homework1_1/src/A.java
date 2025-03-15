public class A {
    protected int x;
    public A(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void displayX(){
        System.out.println("A.x = " + getX());
    }
}
