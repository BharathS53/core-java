public class AirportRunner {
    public static void main(String[] args) {
        String[] airportNames = {"Kempegowda", "Indira Gandhi", "Chhatrapati Shivaji", "Rajiv Gandhi"};
        int[] terminals = {2, 3, 2, 2};
        boolean[] isInternational = {true, true, true, true};
        float[] customerRatings = {4.3f, 4.6f, 4.4f, 4.5f};
        double[] runwayLengths = {4000.5, 4500.0, 4200.25, 4300.75};
        char[] gates = {'A', 'B', 'C', 'D'};
        long[] managerIds = {201101L, 201102L, 201103L, 201104L};
        short[] airTrafficTowers = {101, 102, 103, 104};
        byte[] lounges = {2, 3, 2, 1};

        Airport airport = new Airport(airportNames, terminals, isInternational, customerRatings,
                                      runwayLengths, gates, managerIds, airTrafficTowers, lounges);

        for (String name : airport.getAirportNames()) {
            System.out.println("Airport Name: " + name);
        }

        for (int terminal : airport.getTerminals()) {
            System.out.println("Terminals: " + terminal);
        }

        for (boolean international : airport.getIsInternational()) {
            System.out.println("Is International: " + international);
        }

        for (float rating : airport.getCustomerRatings()) {
            System.out.println("Customer Rating: " + rating);
        }

        for (double length : airport.getRunwayLengths()) {
            System.out.println("Runway Length: " + length + " meters");
        }

        for (char gate : airport.getGates()) {
            System.out.println("Gate: " + gate);
        }

        for (long id : airport.getManagerIds()) {
            System.out.println("Manager ID: " + id);
        }

        for (short tower : airport.getAirTrafficTowers()) {
            System.out.println("Air Traffic Tower No: " + tower);
        }

        for (byte lounge : airport.getLounges()) {
            System.out.println("Number of Lounges: " + lounge);
        }
    }
}
