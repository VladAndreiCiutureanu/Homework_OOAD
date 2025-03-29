public class USBAdapter implements USBC {
    private USBA usba;

    public USBAdapter() {
        this.usba = new USBA();
    }


    @Override
    public void connect() {
        usba.connectUSBA();
    }
}
