public class SmartWatch extends SmartDevice{

    // 1. Atributos

    String caseMaterial;
    boolean nfc;
    boolean supportsApplePay;
    boolean supportsStrapReplacement;
    boolean electrocardiogramSensor;
    boolean bloodPreasureSensor;

    // 2. Constructores

    public SmartWatch(){

    }

    public SmartWatch(String brand, String model, int batteryMah, int buttonsNumbers, double bluetoothVer, double screenSize, boolean touchScreen, boolean screenProtector, boolean allowMakeCalls, String caseMaterial, boolean nfc, boolean supportsApplePay, boolean supportsStrapReplacement, boolean electrocardiogramSensor, boolean bloodPreasureSensor) {
        super(brand, model, batteryMah, buttonsNumbers, bluetoothVer, screenSize, touchScreen, screenProtector, allowMakeCalls);
        this.caseMaterial = caseMaterial;
        this.nfc = nfc;
        this.supportsApplePay = supportsApplePay;
        this.supportsStrapReplacement = supportsStrapReplacement;
        this.electrocardiogramSensor = electrocardiogramSensor;
        this.bloodPreasureSensor = bloodPreasureSensor;
    }


    // 3. Métodos


    @Override
    public String toString() {
        return "SmartWatch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batteryMah=" + batteryMah +
                ", buttonsNumbers=" + buttonsNumbers +
                ", bluetoothVer=" + bluetoothVer +
                ", screenSize=" + screenSize +
                ", touchScreen=" + touchScreen +
                ", screenProtector=" + screenProtector +
                ", allowMakeCalls=" + allowMakeCalls +
                ", caseMaterial='" + caseMaterial + '\'' +
                ", nfc=" + nfc +
                ", supportsApplePay=" + supportsApplePay +
                ", supportsStrapReplacement=" + supportsStrapReplacement +
                ", electrocardiogramSensor=" + electrocardiogramSensor +
                ", bloodPreasureSensor=" + bloodPreasureSensor +
                '}';
    }
}
