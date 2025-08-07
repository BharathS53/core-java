public class ThreeTablee {
    public static void main(String args[]){
        int[] ThreeTablee=new int[10];
        for(int i=0;i<ThreeTablee.length;i++){
            ThreeTablee[i]=3*(i+1);
        }
        System.out.println("3's table");
        for(int i=0;i<ThreeTablee.length;i++){
            System.out.println(ThreeTablee[i]);
        }
        /*for(int  i=1;i<ThreeTable.length;i++){
        ThreeTable[i-1]=3*i;
        System.out.println(ThreeTablee[i-1]);
        } */
    }
}