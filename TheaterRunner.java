public class TheaterRunner {
    public static void main(String[] args) {
        Theater theater=new Theater();
        theater.setName("PVR");
        System.out.println(theater.getName());
        theater.setSize(300);
        System.out.println(theater.getSize());
        theater.setEffects("4DX");
        System.out.println(theater.getEffects());
    }
    
}
