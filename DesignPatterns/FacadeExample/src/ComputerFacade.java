public class ComputerFacade implements Start{
    private Bios bios;
    private CPU cpu;
    private RAM ram;
    private PowerSupply powerSupply;
    private OperatingSystem operatingSystem;


    public ComputerFacade() {
        bios = new Bios();
        cpu = new CPU();
        ram = new RAM();
        powerSupply = new PowerSupply();
        operatingSystem = new OperatingSystem();
    }

    @Override
    public void start() {
        powerSupply.activate();
        bios.runPOST();
        cpu.activate();
        ram.activate();
        operatingSystem.load();
    }
}
