public class Mall {
    String[] shopNames;
    int[] floorCounts;
    boolean[] hasFoodCourt;
    float[] avgRating;
    double[] monthlyRent;
    char[] wings;
    long[] shopkeeperIds;
    short[] emergencyExits;
    byte[] openHours;

    public Mall(String[] shopNames, int[] floorCounts, boolean[] hasFoodCourt,
                float[] avgRating, double[] monthlyRent, char[] wings, long[] shopkeeperIds,
                short[] emergencyExits, byte[] openHours) {
        this.shopNames = shopNames;
        this.floorCounts = floorCounts;
        this.hasFoodCourt = hasFoodCourt;
        this.avgRating = avgRating;
        this.monthlyRent = monthlyRent;
        this.wings = wings;
        this.shopkeeperIds = shopkeeperIds;
        this.emergencyExits = emergencyExits;
        this.openHours = openHours;
    }

    public String[] getShopNames() {
        return shopNames;
    }

    public int[] getFloorCounts() {
        return floorCounts;
    }

    public boolean[] getHasFoodCourt() {
        return hasFoodCourt;
    }

    public float[] getAvgRating() {
        return avgRating;
    }

    public double[] getMonthlyRent() {
        return monthlyRent;
    }

    public char[] getWings() {
        return wings;
    }

    public long[] getShopkeeperIds() {
        return shopkeeperIds;
    }

    public short[] getEmergencyExits() {
        return emergencyExits;
    }

    public byte[] getOpenHours() {
        return openHours;
    }
}
