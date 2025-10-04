public class Pattern10 {
    static void patt(int n){
       for(int i = 1 ; i<=n;i++){
        for(int j = 3;j>=i;j--){
            System.out.print(" ");//2 spaces
        }
        for(int  k =1;k<=i*2-1;k++){
            System.out.print("*");
       }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int n = 4 ;
        patt(n);
    }
}
/*output
   *
  ***
 *****
*******
*/