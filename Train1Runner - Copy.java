public class Train1Runner {
    public static void main(String[] args) {
        Train1 train1 = new Train1("Rajdhani Express", 130, "Passenger", 22, "Red");
        System.out.println(train1.getName());
        System.out.println(train1.getMaxSpeed());
        System.out.println(train1.getType());
        System.out.println(train1.getCoaches());
        System.out.println(train1.getColor());

        Train1 train2 = new Train1("Shatabdi Express", 140, "Passenger", 16, "Blue");
        System.out.println(train2.getName());
        System.out.println(train2.getMaxSpeed());
        System.out.println(train2.getType());
        System.out.println(train2.getCoaches());
        System.out.println(train2.getColor());

        Train1 train3 = new Train1("Duronto Express", 135, "Passenger", 20, "Green");
        System.out.println(train3.getName());
        System.out.println(train3.getMaxSpeed());
        System.out.println(train3.getType());
        System.out.println(train3.getCoaches());
        System.out.println(train3.getColor());

        Train1 train4 = new Train1("Goods Train", 90, "Freight", 58, "Brown");
        System.out.println(train4.getName());
        System.out.println(train4.getMaxSpeed());
        System.out.println(train4.getType());
        System.out.println(train4.getCoaches());
        System.out.println(train4.getColor());

        Train1 train5 = new Train1("Metro Rail", 80, "Urban", 6, "Silver");
        System.out.println(train5.getName());
        System.out.println(train5.getMaxSpeed());
        System.out.println(train5.getType());
        System.out.println(train5.getCoaches());
        System.out.println(train5.getColor());
    }
}
