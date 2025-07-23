public class Add1 {
    public static void main(String[] args) {
        Addition();
        Addition(50,20);
    }
public static void Addition(){
    System.out.println("without args");
    int a=20;
    int b=10;
    int c=a+b;
    System.out.println(c);
}    
public static void Addition(int a,int b)
{
    System.out.println("with args");
    int c=a+b;
    System.out.println(c);
}
}