class Mobile {
    String brand;
    float cost;
    int memory;
    String specs;
    float screenSize;

    public static void main(String args[]) {
        Mobile mobile0 = new Mobile();
        mobile0.setBrand("Samsung");
        mobile0.setCost(32000.5f);
        mobile0.setMemory(128);
        mobile0.setSpecs("5G, AMOLED Display");
        mobile0.setScreenSize(6.5f);
        System.out.println(mobile0.brand);
        System.out.println(mobile0.cost);
        System.out.println(mobile0.memory);
        System.out.println(mobile0.specs);
        System.out.println(mobile0.screenSize);

        Mobile mobile1 = new Mobile();
        mobile1.setBrand("iPhone");
        mobile1.setCost(89000.0f);
        mobile1.setMemory(256);
        mobile1.setSpecs("Face ID, 5G");
        mobile1.setScreenSize(6.1f);
        System.out.println(mobile1.brand);
        System.out.println(mobile1.cost);
        System.out.println(mobile1.memory);
        System.out.println(mobile1.specs);
        System.out.println(mobile1.screenSize);

        Mobile mobile2 = new Mobile();
        mobile2.setBrand("OnePlus");
        mobile2.setCost(49999.9f);
        mobile2.setMemory(128);
        mobile2.setSpecs("Warp Charge, AMOLED");
        mobile2.setScreenSize(6.7f);
        System.out.println(mobile2.brand);
        System.out.println(mobile2.cost);
        System.out.println(mobile2.memory);
        System.out.println(mobile2.specs);
        System.out.println(mobile2.screenSize);

        Mobile mobile3 = new Mobile();
        mobile3.setBrand("Realme");
        mobile3.setCost(18999.0f);
        mobile3.setMemory(64);
        mobile3.setSpecs("90Hz Display, Fast Charge");
        mobile3.setScreenSize(6.6f);
        System.out.println(mobile3.brand);
        System.out.println(mobile3.cost);
        System.out.println(mobile3.memory);
        System.out.println(mobile3.specs);
        System.out.println(mobile3.screenSize);

        Mobile mobile4 = new Mobile();
        mobile4.setBrand("Vivo");
        mobile4.setCost(17999.0f);
        mobile4.setMemory(64);
        mobile4.setSpecs("AMOLED, 5G");
        mobile4.setScreenSize(6.4f);
        System.out.println(mobile4.brand);
        System.out.println(mobile4.cost);
        System.out.println(mobile4.memory);
        System.out.println(mobile4.specs);
        System.out.println(mobile4.screenSize);

        Mobile mobile5 = new Mobile();
        mobile5.setBrand("Oppo");
        mobile5.setCost(20999.5f);
        mobile5.setMemory(128);
        mobile5.setSpecs("SuperVOOC Charging");
        mobile5.setScreenSize(6.5f);
        System.out.println(mobile5.brand);
        System.out.println(mobile5.cost);
        System.out.println(mobile5.memory);
        System.out.println(mobile5.specs);
        System.out.println(mobile5.screenSize);

        Mobile mobile6 = new Mobile();
        mobile6.setBrand("Motorola");
        mobile6.setCost(15499.9f);
        mobile6.setMemory(64);
        mobile6.setSpecs("Stock Android");
        mobile6.setScreenSize(6.6f);
        System.out.println(mobile6.brand);
        System.out.println(mobile6.cost);
        System.out.println(mobile6.memory);
        System.out.println(mobile6.specs);
        System.out.println(mobile6.screenSize);

        Mobile mobile7 = new Mobile();
        mobile7.setBrand("Google Pixel");
        mobile7.setCost(65999.0f);
        mobile7.setMemory(128);
        mobile7.setSpecs("Android 14, Tensor Chip");
        mobile7.setScreenSize(6.1f);
        System.out.println(mobile7.brand);
        System.out.println(mobile7.cost);
        System.out.println(mobile7.memory);
        System.out.println(mobile7.specs);
        System.out.println(mobile7.screenSize);

        Mobile mobile8 = new Mobile();
        mobile8.setBrand("Nokia");
        mobile8.setCost(13499.0f);
        mobile8.setMemory(32);
        mobile8.setSpecs("Basic Android, Long Battery");
        mobile8.setScreenSize(6.2f);
        System.out.println(mobile8.brand);
        System.out.println(mobile8.cost);
        System.out.println(mobile8.memory);
        System.out.println(mobile8.specs);
        System.out.println(mobile8.screenSize);

        Mobile mobile9 = new Mobile();
        mobile9.setBrand("Nothing Phone");
        mobile9.setCost(38999.0f);
        mobile9.setMemory(256);
        mobile9.setSpecs("Transparent Design, Glyph Light");
        mobile9.setScreenSize(6.7f);
        System.out.println(mobile9.brand);
        System.out.println(mobile9.cost);
        System.out.println(mobile9.memory);
        System.out.println(mobile9.specs);
        System.out.println(mobile9.screenSize);
    }

    public void setBrand(String mobileBrand) {
        brand = mobileBrand;
    }

    public void setCost(float mobileCost) {
        cost = mobileCost;
    }

    public void setMemory(int mobileMemory) {
        memory = mobileMemory;
    }

    public void setSpecs(String mobileSpecs) {
        specs = mobileSpecs;
    }

    public void setScreenSize(float mobileScreenSize) {
        screenSize = mobileScreenSize;
    }
}