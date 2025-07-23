public class Cars1 {
    private String brand;
    private String color;
    private int mileage;

    public static int warrantyYears;
    static {
        System.out.println("static block in Cars1");
        warrantyYears = 5;
    }
    {
        System.out.println("non static block in Cars1");
        warrantyYears = 3;
    }

    public void setbrand(String carBrand) {
        brand = carBrand;
    }

    public void setcolor(String carColor) {
        color = carColor;
    }

    public void setmileage(int carMileage) {
        mileage = carMileage;
    }

    public String getbrand() {
        return brand;
    }

    public String getcolor() {
        return color;
    }

    public int getmileage() {
        return mileage;
    }
}
