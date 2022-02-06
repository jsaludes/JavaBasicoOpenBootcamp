public class Main {

    public static void main(String[] args) {

        SmartDevice genericDeviceNoParams = new SmartDevice();
        SmartDevice genericDeviceWithParams = new SmartDevice("noBrand", "noModel", 4500, 1, 4, 5, true, false, true);

        SmartPhone iphone12NoParams = new SmartPhone();
        SmartPhone iphone12WithParams = new SmartPhone("Apple", "iPhone 12", 3000, 3, 5.0d, 5, true, false, true, "InventFone", true, 12,4, 128);

        SmartWatch galaxyWatch4NoParams = new SmartWatch();
        SmartWatch galaxyWatch4WithParams = new SmartWatch("Samsung", "Galaxy Watch 4", 350, 2, 5.0, 3.5d, true, false, true, "metal", true, false, true, true, true);

        System.out.println("Esto son los smartdevices genéricos sin y con parámetros:");
        System.out.println(genericDeviceNoParams);
        System.out.println(genericDeviceWithParams);
        System.out.println();
        System.out.println("Esto son los smartphones sin y con parámetros:");
        System.out.println(iphone12NoParams);
        System.out.println(iphone12WithParams);
        System.out.println();
        System.out.println("Esto son los smartwatches sin y con parámetros:");
        System.out.println(galaxyWatch4NoParams);
        System.out.println(galaxyWatch4WithParams);
        System.out.println();
    }
}
