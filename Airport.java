public class Airport {
    String[] airportNames;
    int[] terminals;
    boolean[] isInternational;
    float[] customerRatings;
    double[] runwayLengths;
    char[] gates;
    long[] managerIds;
    short[] airTrafficTowers;
    byte[] lounges;

    public Airport(String[] airportNames, int[] terminals, boolean[] isInternational,
                   float[] customerRatings, double[] runwayLengths, char[] gates,
                   long[] managerIds, short[] airTrafficTowers, byte[] lounges) {
        this.airportNames = airportNames;
        this.terminals = terminals;
        this.isInternational = isInternational;
        this.customerRatings = customerRatings;
        this.runwayLengths = runwayLengths;
        this.gates = gates;
        this.managerIds = managerIds;
        this.airTrafficTowers = airTrafficTowers;
        this.lounges = lounges;
    }

    public String[] getAirportNames() {
        return airportNames;
    }

    public int[] getTerminals() {
        return terminals;
    }

    public boolean[] getIsInternational() {
        return isInternational;
    }

    public float[] getCustomerRatings() {
        return customerRatings;
    }

    public double[] getRunwayLengths() {
        return runwayLengths;
    }

    public char[] getGates() {
        return gates;
    }

    public long[] getManagerIds() {
        return managerIds;
    }

    public short[] getAirTrafficTowers() {
        return airTrafficTowers;
    }

    public byte[] getLounges() {
        return lounges;
    }
}
