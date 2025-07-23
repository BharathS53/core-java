public class Phone {
    private String brand;
    private String os;
    private int storage;

    public static int warranty;
    static {
        System.out.println("static block in Phone");
        warranty = 1;
    }
    {
        System.out.println("non static block in phone");
        warranty = 2;
    }

    public void setbrand(String phoneBrand) {
        brand = phoneBrand;
    }

    public void setos(String phoneOs) {
        os = phoneOs;
    }

    public void setstorage(int phoneStorage) {
        storage = phoneStorage;
    }

    public String getbrand() {
        return brand;
    }

    public String getos() {
        return os;
    }

    public int getstorage() {
        return storage;
    }
}
