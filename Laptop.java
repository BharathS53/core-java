class Laptop              
{
   String name;
   float price;
   int storage;
   String features;
   float size;

   public static void main(String args[])
   {
    Laptop laptop=new Laptop();          
    laptop.name="lenovo";
    laptop.price=30212.1f;
    System.out.println(laptop.name);
    laptop.setName("dell"); 
    System.out.println(laptop.name);
    System.out.println(laptop.price);
    laptop.setPrice(20000.2f); 
    System.out.println(laptop.price);
    laptop.setStorage(512); 
    System.out.println(laptop.storage);
    laptop.setFeatures("touch screen"); 
    System.out.println(laptop.features);
    laptop.setSize(13.2f); 
    System.out.println(laptop.size);
    
    Laptop laptop1=new Laptop();     
    laptop1.name="HP";
    laptop1.setName("asus"); 
    System.out.println(laptop1.name);
    System.out.println(laptop.name);
    laptop1.price=63262.3f;
    System.out.println(laptop1.price);
    laptop1.setPrice(45770.2f); 
    System.out.println(laptop1.price);
    laptop1.setStorage(1024); 
    System.out.println(laptop1.storage);
    laptop1.setFeatures("360 Degree"); 
    System.out.println(laptop1.features);
    laptop1.setSize(14.2f); 
    System.out.println(laptop1.size);

    Laptop laptop2=new Laptop();     
    laptop2.name="asus";
    laptop2.setName("asus"); 
    System.out.println(laptop2.name);
    laptop2.price=63262.3f;
    System.out.println(laptop2.price);
    laptop2.setPrice(45770.2f); 
    System.out.println(laptop2.price);
    laptop2.setStorage(1024); 
    System.out.println(laptop2.storage);
    laptop2.setFeatures("360 Degree"); 
    System.out.println(laptop2.features);
    laptop2.setSize(14.2f); 
    System.out.println(laptop2.size);

    Laptop laptop3=new Laptop();     
    laptop3.name="dell";
    laptop3.setName("asus"); 
    System.out.println(laptop3.name);
    laptop3.price=63262.3f;
    System.out.println(laptop3.price);
    laptop3.setPrice(45770.2f); 
    System.out.println(laptop3.price);
    laptop3.setStorage(1024); 
    System.out.println(laptop3.storage);
    laptop3.setFeatures("360 Degree"); 
    System.out.println(laptop3.features);
    laptop3.setSize(14.2f); 
    System.out.println(laptop3.size);

    Laptop laptop4=new Laptop();     
    laptop4.name="HP";
    laptop4.setName("dell"); 
    System.out.println(laptop4.name);
    laptop4.price=63262.3f;
    System.out.println(laptop4.price);
    laptop4.setPrice(45770.2f); 
    System.out.println(laptop4.price);
    laptop4.setStorage(1024); 
    System.out.println(laptop4.storage);
    laptop4.setFeatures("360 Degree"); 
    System.out.println(laptop4.features);
    laptop4.setSize(14.2f); 
    System.out.println(laptop4.size);

    Laptop laptop5=new Laptop();     
    laptop5.name="HP";
    laptop5.setName("HP"); 
    System.out.println(laptop5.name);
    laptop5.price=63262.3f;
    System.out.println(laptop5.price);
    laptop5.setPrice(45770.2f); 
    System.out.println(laptop5.price);
    laptop5.setStorage(1024); 
    System.out.println(laptop5.storage);
    laptop5.setFeatures("360 Degree"); 
    System.out.println(laptop5.features);
    laptop5.setSize(14.2f); 
    System.out.println(laptop5.size);

    Laptop laptop6=new Laptop();     
    laptop6.name="lenovo";
    laptop6.setName("asus"); 
    System.out.println(laptop6.name);
    laptop6.price=63262.3f;
    System.out.println(laptop6.price);
    laptop6.setPrice(45770.2f); 
    System.out.println(laptop6.price);
    laptop6.setStorage(1024); 
    System.out.println(laptop6.storage);
    laptop6.setFeatures("360 Degree"); 
    System.out.println(laptop6.features);
    laptop6.setSize(14.2f); 
    System.out.println(laptop6.size);

    Laptop laptop7=new Laptop();     
    laptop7.name="HP";
    laptop7.setName("Mac"); 
    System.out.println(laptop7.name);
    laptop7.price=63262.3f;
    System.out.println(laptop7.price);
    laptop7.setPrice(45770.2f); 
    System.out.println(laptop7.price);
    laptop7.setStorage(1024); 
    System.out.println(laptop7.storage);
    laptop7.setFeatures("360 Degree"); 
    System.out.println(laptop7.features);
    laptop7.setSize(14.2f); 
    System.out.println(laptop7.size);

    Laptop laptop8=new Laptop();     
    laptop8.name="Mac";
    laptop8.setName("asus"); 
    System.out.println(laptop8.name);
    laptop8.price=63262.3f;
    System.out.println(laptop8.price);
    laptop8.setPrice(45770.2f); 
    System.out.println(laptop8.price);
    laptop8.setStorage(1024); 
    System.out.println(laptop8.storage);
    laptop8.setFeatures("360 Degree"); 
    System.out.println(laptop8.features);
    laptop8.setSize(14.2f); 
    System.out.println(laptop8.size);

    Laptop laptop9=new Laptop();     
    laptop9.name="Mac";
    laptop9.setName("mac"); 
    System.out.println(laptop9.name);
    laptop9.price=63262.3f;
    System.out.println(laptop9.price);
    laptop9.setPrice(45770.2f); 
    System.out.println(laptop9.price);
    laptop9.setStorage(1024); 
    System.out.println(laptop9.storage);
    laptop9.setFeatures("360 Degree"); 
    System.out.println(laptop9.features);
    laptop9.setSize(14.2f); 
    System.out.println(laptop9.size);

    }
      
   public void setName(String laptopName)
   {
     name=laptopName;  
   }
   public void setPrice(float laptopPrice)
   {
     price=laptopPrice;  
   }
   public void setStorage(int laptopStorage)
   {
     storage=laptopStorage;  
   }
   public void setFeatures(String laptopFeatures)
   {
     features=laptopFeatures;  
   }
   public void setSize(float laptopSize)
   {
     size=laptopSize;  
   }




}