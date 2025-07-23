class Bus {
    String operator;
    float fare;
    int seatingCapacity;
    String type;
    float length;

    public static void main(String args[]) {
        Bus bus = new Bus();

        bus.setOperator("KSRTC");
        bus.setFare(450.0f);
        bus.setSeatingCapacity(50);
        bus.setType("AC Sleeper");
        bus.setLength(12.0f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);

        bus.setOperator("APSRTC");
        bus.setFare(300.0f);
        bus.setSeatingCapacity(48);
        bus.setType("Non-AC Seater");
        bus.setLength(11.5f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);

        bus.setOperator("TNSTC");
        bus.setFare(270.0f);
        bus.setSeatingCapacity(54);
        bus.setType("Ordinary");
        bus.setLength(11.8f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);

        bus.setOperator("BMTC");
        bus.setFare(60.0f);
        bus.setSeatingCapacity(40);
        bus.setType("City Bus");
        bus.setLength(10.5f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);

        bus.setOperator("VRL Travels");
        bus.setFare(1200.0f);
        bus.setSeatingCapacity(44);
        bus.setType("Luxury AC Sleeper");
        bus.setLength(13.5f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);

        bus.setOperator("SRS Travels");
        bus.setFare(1100.0f);
        bus.setSeatingCapacity(42);
        bus.setType("Multi-Axle Sleeper");
        bus.setLength(14.0f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);

        bus.setOperator("Parveen Travels");
        bus.setFare(980.0f);
        bus.setSeatingCapacity(40);
        bus.setType("AC Semi-Sleeper");
        bus.setLength(12.5f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);

        bus.setOperator("Orange Travels");
        bus.setFare(1300.0f);
        bus.setSeatingCapacity(46);
        bus.setType("AC Sleeper");
        bus.setLength(13.0f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);

        bus.setOperator("SETC");
        bus.setFare(320.0f);
        bus.setSeatingCapacity(56);
        bus.setType("Express");
        bus.setLength(12.0f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);

        bus.setOperator("Indigo Travels");
        bus.setFare(1450.0f);
        bus.setSeatingCapacity(38);
        bus.setType("AC Private Sleeper");
        bus.setLength(13.8f);
        System.out.println(bus.operator);
        System.out.println(bus.fare);
        System.out.println(bus.seatingCapacity);
        System.out.println(bus.type);
        System.out.println(bus.length);
    }

    public void setOperator(String operatorName) {
        operator = operatorName;
    }

    public void setFare(float ticketFare) {
        fare = ticketFare;
    }

    public void setSeatingCapacity(int seatCount) {
        seatingCapacity = seatCount;
    }

    public void setType(String busType) {
        type = busType;
    }

    public void setLength(float busLength) {
        length = busLength;
    }
}

