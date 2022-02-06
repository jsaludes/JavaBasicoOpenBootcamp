public class SmartDevice {

    // 1. Atributos

    String brand;
    String model;
    int batteryMah;
    int buttonsNumbers;
    double bluetoothVer;
    double screenSize;
    boolean touchScreen;
    boolean screenProtector;
    boolean allowMakeCalls;

    // 2. Constructores

    public SmartDevice(){

    }

    public SmartDevice(String brand, String model, int batteryMah, int buttonsNumbers, double bluetoothVer, double screenSize, boolean touchScreen, boolean screenProtector, boolean allowMakeCalls) {
        this.brand = brand;
        this.model = model;
        this.batteryMah = batteryMah;
        this.buttonsNumbers = buttonsNumbers;
        this.bluetoothVer = bluetoothVer;
        this.screenSize = screenSize;
        this.touchScreen = touchScreen;
        this.screenProtector = screenProtector;
        this.allowMakeCalls = allowMakeCalls;
    }

    // 3. Métodos

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batteryMah=" + batteryMah +
                ", buttonsNumbers=" + buttonsNumbers +
                ", bluetoothVer=" + bluetoothVer +
                ", screenSize=" + screenSize +
                ", touchScreen=" + touchScreen +
                ", screenProtector=" + screenProtector +
                ", allowMakeCalls=" + allowMakeCalls +
                '}';
    }
}

