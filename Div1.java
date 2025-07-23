public class Div1 {
    public static void main(String args[]){
        division();
        division(10, 2);
    }
    public static void division(){
        System.out.println("without args");
        double a=4;
        double b=2;
        double c=a/b;
        System.out.println(c);
    }
    public static void division(double a,double b){
        System.out.println("with args");
        double c=a/b;
        System.out.println(c);
    }
}
