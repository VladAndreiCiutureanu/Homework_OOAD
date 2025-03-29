public class PhoneDisplay implements Observer {
    private double value;


    @Override
    public void update(double value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Phone Display Value: " + value);
    }
}
