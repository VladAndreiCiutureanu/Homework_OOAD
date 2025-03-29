public class Application {
    public static void main(String[] args) {
        USBC usb = new USBAdapter();
        usb.connect();
    }
}
