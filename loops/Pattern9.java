public class Pattern9{
    static void patt(int n){
        for(int i=1;i<=4;i++){
            for(int j =2;j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 4 ; k>=i;k--){
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
****
 ***
  **
   *
*/