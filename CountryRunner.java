public class CountryRunner {
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("INDIA");
        country.setPrimeMinister("narendra modi");

        State[] states = new State[36];


        State state1 = new State();
        state1.setName("karnataka");
        state1.setChiefMinister("siddaramaiah");
        states[0] = state1;

        State state2 = new State();
        state2.setName("kerala");
        state2.setChiefMinister("vijayan");
        states[1] = state2;

        State state3 = new State();
        state3.setName("tamil nadu");
        state3.setChiefMinister("stalin");
        states[2] = state3;

        State state4 = new State();
        state4.setName("maharashtra");
        state4.setChiefMinister("shinde");
        states[3] = state4;

        State state5 = new State();
        state5.setName("andhra");
        state5.setChiefMinister("chandrababu");
        states[4] = state5;

        State state6 = new State();
        state6.setName("telangana");
        state6.setChiefMinister("revanth reddy");
        states[5] = state6;

        State state7 = new State();
        state7.setName("up");
        state7.setChiefMinister("yogi");
        states[6] = state7;

        State state8 = new State();
        state8.setName("west bengal");
        state8.setChiefMinister("mamtha");
        states[7] = state8;

        State state9 = new State();
        state9.setName("up");
        state9.setChiefMinister("yogi");
        states[8] = state9;

        State state10 = new State();
        state10.setName("madhyapradesh");
        state10.setChiefMinister("mohan yadhav");
        states[9] = state10;

        State state11 = new State();
        state11.setName("goa");
        state11.setChiefMinister("sawant");
        states[10] = state11;

        State state12 = new State();
        state12.setName("utthrakand");
        state12.setChiefMinister("jainath");
        states[11] = state12;

        // --- Remaining states and UTs (starting from index 12) ---
        State state13 = new State();
        state13.setName("arunachal pradesh");
        state13.setChiefMinister("pema khandu");
        states[12] = state13;

        State state14 = new State();
        state14.setName("assam");
        state14.setChiefMinister("himanta biswa sarma");
        states[13] = state14;

        State state15 = new State();
        state15.setName("bihar");
        state15.setChiefMinister("nitish kumar");
        states[14] = state15;

        State state16 = new State();
        state16.setName("chhattisgarh");
        state16.setChiefMinister("vishnu deo sai");
        states[15] = state16;

        State state17 = new State();
        state17.setName("gujarat");
        state17.setChiefMinister("bhupendra patel");
        states[16] = state17;

        State state18 = new State();
        state18.setName("haryana");
        state18.setChiefMinister("nayabi");
        states[17] = state18;

        State state19 = new State();
        state19.setName("himachal pradesh");
        state19.setChiefMinister("sukhvinder");
        states[18] = state19;

        State state20 = new State();
        state20.setName("jharkhand");
        state20.setChiefMinister("hemant");
        states[19] = state20;

        State state21 = new State();
        state21.setName("manipur");
        state21.setChiefMinister("biren singh");
        states[20] = state21;

        State state22 = new State();
        state22.setName("meghalaya");
        state22.setChiefMinister("conrad sangma");
        states[21] = state22;

        State state23 = new State();
        state23.setName("mizoram");
        state23.setChiefMinister("lalduhoma");
        states[22] = state23;

        State state24 = new State();
        state24.setName("nagaland");
        state24.setChiefMinister("neiphiu");
        states[23] = state24;

        State state25 = new State();
        state25.setName("odisha");
        state25.setChiefMinister("mohan charan");
        states[24] = state25;

        State state26 = new State();
        state26.setName("punjab");
        state26.setChiefMinister("bhagwant mann");
        states[25] = state26;

        State state27 = new State();
        state27.setName("rajasthan");
        state27.setChiefMinister("bhajan lal ");
        states[26] = state27;

        State state28 = new State();
        state28.setName("sikkim");
        state28.setChiefMinister("prem singh");
        states[27] = state28;

        country.setStates(states);

        System.out.println("Country name ,Prime minister and its states:");
        System.out.println(country.getName());
        System.out.println(country.getPrimeMinister());


        State[] countryStates = country.getStates();
        for (int i = 0; i < countryStates.length; i++) {
            State state = countryStates[i];
            if (state != null) {
                System.out.println(state.getName());
                System.out.println(state.getChiefMinister());
            }
        }
    }
}
