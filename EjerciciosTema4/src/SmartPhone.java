public class SmartPhone extends SmartDevice{

    // 1. Atributos

    String carrier;
    boolean camera;
    int cameraMpx;
    int ramSize;
    int storageSize;

    // 2. Constructores

    public SmartPhone(){

    }

    public SmartPhone(String brand, String model, int batteryMah, int buttonsNumbers, double bluetoothVer, double screenSize, boolean touchScreen, boolean screenProtector, boolean allowMakeCalls, String carrier, boolean camera, int cameraMpx, int ramSize, int storageSize) {
        super(brand, model, batteryMah, buttonsNumbers, bluetoothVer, screenSize, touchScreen, screenProtector, allowMakeCalls);
        this.carrier = carrier;
        this.camera = camera;
        this.cameraMpx = cameraMpx;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }


    // 3. Métodos


    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batteryMah=" + batteryMah +
                ", buttonsNumbers=" + buttonsNumbers +
                ", bluetoothVer=" + bluetoothVer +
                ", screenSize=" + screenSize +
                ", touchScreen=" + touchScreen +
                ", screenProtector=" + screenProtector +
                ", allowMakeCalls=" + allowMakeCalls +
                ", carrier='" + carrier + '\'' +
                ", camera=" + camera +
                ", cameraMpx=" + cameraMpx +
                ", ramSize=" + ramSize +
                ", storageSize=" + storageSize +
                '}';
    }
}
