public class While {
    public static void main(String args[]){
        int i=0;
        while(i%3==0){
            System.out.println("divsible by 3");
            i++;
        }
        do{
            System.out.println("divisible by 6");
            i++;
        }while(i%6==0);
    }
}