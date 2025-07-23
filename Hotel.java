class Hotel {
    String name;
    float pricePerNight;
    int rooms;
    String location;
    float rating;

    public static void main(String args[]) {
        Hotel hotel = new Hotel();

        hotel.setName("The Taj");
        hotel.setPricePerNight(7500.0f);
        hotel.setRooms(120);
        hotel.setLocation("Mumbai");
        hotel.setRating(4.9f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);

        hotel.setName("Leela Palace");
        hotel.setPricePerNight(9500.0f);
        hotel.setRooms(100);
        hotel.setLocation("Bengaluru");
        hotel.setRating(4.8f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);

        hotel.setName("ITC Grand");
        hotel.setPricePerNight(8700.0f);
        hotel.setRooms(130);
        hotel.setLocation("Chennai");
        hotel.setRating(4.7f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);

        hotel.setName("Oberoi");
        hotel.setPricePerNight(11000.0f);
        hotel.setRooms(140);
        hotel.setLocation("Delhi");
        hotel.setRating(5.0f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);

        hotel.setName("Radisson Blu");
        hotel.setPricePerNight(6700.0f);
        hotel.setRooms(90);
        hotel.setLocation("Hyderabad");
        hotel.setRating(4.5f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);

        hotel.setName("Trident");
        hotel.setPricePerNight(8200.0f);
        hotel.setRooms(110);
        hotel.setLocation("Jaipur");
        hotel.setRating(4.6f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);

        hotel.setName("JW Marriott");
        hotel.setPricePerNight(9800.0f);
        hotel.setRooms(115);
        hotel.setLocation("Kolkata");
        hotel.setRating(4.9f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);

        hotel.setName("Holiday Inn");
        hotel.setPricePerNight(5400.0f);
        hotel.setRooms(80);
        hotel.setLocation("Goa");
        hotel.setRating(4.3f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);

        hotel.setName("Novotel");
        hotel.setPricePerNight(6000.0f);
        hotel.setRooms(100);
        hotel.setLocation("Pune");
        hotel.setRating(4.4f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);

        hotel.setName("The Park");
        hotel.setPricePerNight(4900.0f);
        hotel.setRooms(75);
        hotel.setLocation("Coimbatore");
        hotel.setRating(4.2f);
        System.out.println(hotel.name);
        System.out.println(hotel.pricePerNight);
        System.out.println(hotel.rooms);
        System.out.println(hotel.location);
        System.out.println(hotel.rating);
    }

    public void setName(String hotelName) {
        name = hotelName;
    }

    public void setPricePerNight(float price) {
        pricePerNight = price;
    }

    public void setRooms(int totalRooms) {
        rooms = totalRooms;
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public void setRating(float starRating) {
        rating = starRating;
    }
}
