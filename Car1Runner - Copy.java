public class Car1Runner {
    public static void main(String[] args){
        Car1 car1=new Car1("mustang",250,"diesel","black",15000);
        System.out.println(car1.getName());
        System.out.println(car1.getSpeed());
        System.out.println(car1.getFuelType());
        System.out.println(car1.getColor());
        System.out.println(car1.getRpm());

        Car1 car2=new Car1("BMW",300,"petrol","black",18000);
        System.out.println(car2.getName());
        System.out.println(car2.getSpeed());
        System.out.println(car2.getFuelType());
        System.out.println(car2.getColor());
        System.out.println(car2.getRpm());

        Car1 car3=new Car1("audi",320,"diesel","black",17000);
        System.out.println(car3.getName());
        System.out.println(car3.getSpeed());
        System.out.println(car3.getFuelType());
        System.out.println(car3.getColor());
        System.out.println(car3.getRpm());

        Car1 car4=new Car1("porsche",400,"petrol","yellow",19000);
        System.out.println(car4.getName());
        System.out.println(car4.getSpeed());
        System.out.println(car4.getFuelType());
        System.out.println(car4.getColor());
        System.out.println(car4.getRpm());

        Car1 car5=new Car1("ferrari",450,"diesel","red",20000);
        System.out.println(car5.getName());
        System.out.println(car5.getSpeed());
        System.out.println(car5.getFuelType());
        System.out.println(car5.getColor());
        System.out.println(car5.getRpm());

    }
}