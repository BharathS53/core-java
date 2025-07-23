public class Multip1 {
    public static void main(String args[]){
        multiplication();
        multiplication(5, 2);
    }
    public static void multiplication(){
    System.out.println("without args");
    int a=5;
    int b=2;
    float c=a*b;
    System.out.println(c);
}
public static void multiplication(int var0, int var1) {
      System.out.println("with arg");
      int var2 = var0 * var1;
      System.out.println(var2);
   }
}