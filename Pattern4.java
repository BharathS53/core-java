public class Pattern4 {
    //2468
    //2468
    public static void main(String[] args) {
        int row=2;
        int column=4;
        for(int i=0;i<row;i++){
            for(int j=1;j<=column;j++){
                System.out.print(j*2);
            }
            System.out.println();
        }
    }
}
