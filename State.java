class State{
    private String name;
    private int numberOfDistrict;
    private int numberOfMLA;
    public int getNumberOfDistrict() {
        return numberOfDistrict;
    }
    public void setNumberOfDistrict(int numberOfDistrict) {
        this.numberOfDistrict = numberOfDistrict;
    }
    public int getNumberOfMLA() {
        return numberOfMLA;
    }
    public void setNumberOfMLA(int numberOfMLA) {
        this.numberOfMLA = numberOfMLA;
    }
    private String chiefMinister;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getChiefMinister() {
        return chiefMinister;
    }
    public void setChiefMinister(String chiefMinister) {
        this.chiefMinister = chiefMinister;
    } 
}