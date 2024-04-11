public class Main {
    public static void main(String[] args) {
        int [][] numeri={
                {0,4,7},
                {4,0,9},
                {7,9,0}
        };
        System.out.println(Simmetrico(numeri));
    }
    public static boolean Simmetrico (int[][]numeri){
     boolean simmetria=false;
     int conta=0;
     for (int i=0;i< numeri.length;i++){
            for (int j=0;j< numeri[0].length;j++){
                if (numeri[i][j]==numeri[j][i]){
                     conta++;
                }
            }
        }
     if (conta==numeri.length*numeri[0].length){
         simmetria=true;
     }
     return simmetria;
    }
}