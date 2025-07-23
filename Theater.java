public class Theater {
    private String name;
    private int size;
    private String effects;

    public void setName(String TheaterName){
        name=TheaterName;
    }
    public void setSize(int theaterSize){
        size=theaterSize;
    }
    public void setEffects(String theaterEffects){
        effects=theaterEffects;
    }
     public String getName(){
        return name;
     }
     public int getSize(){
        return size;
     }
     public String getEffects(){
        return effects;
     }
}