public class Pattern2 {
    public static void main(String args[]){
        int row=4;
        int column=4;
        for(int i=0;i<row;i++){
            for(int j=1;j<column+1;j++){
                System.out.print(j);
            }
            System.out.println( );
        }
    }
}