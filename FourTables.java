class FourTable{
    public static void main(String  args[]){
        int[] FourTable=new int[10];
        for(int i=0;i<FourTable.length;i++){
            FourTable[i]=4*(i+1);
            System.out.println(FourTable[i]);
        }
        for(int i=1;i<FourTable.length;i++){
            FourTable[i-1]=4*i;
            System.out.println(FourTable[i-1]);
        }
    }
}