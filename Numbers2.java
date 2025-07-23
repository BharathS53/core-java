public class Numbers2 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"is even number");
            }
            else{
                System.out.println(i+"is odd number");
            }
            if(i%3==0)
            {
                System.out.println(i+"is divisible by 3");
            }
            if(i%5==0)
            {
                System.out.println(i+"is divisible by 5");
            }
        }
    }
}