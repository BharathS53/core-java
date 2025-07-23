public class Laptop1 {
    private String model;
    private String processor;
    private int ram;

    public static int batteryLife;
    static {
        System.out.println("static block in Laptop1");
        batteryLife = 10;
    }
    {
        System.out.println("non static block in laptop1");
        batteryLife = 8;
    }

    public void setmodel(String laptopModel) {
        model = laptopModel;
    }

    public void setprocessor(String laptopProcessor) {
        processor = laptopProcessor;
    }

    public void setram(int laptopRam) {
        ram = laptopRam;
    }

    public String getmodel() {
        return model;
    }

    public String getprocessor() {
        return processor;
    }

    public int getram() {
        return ram;
    }
}
