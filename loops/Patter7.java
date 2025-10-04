public class Patter7 {
    static void patt(int n){
        for(int i = 1 ; i <= 4 ; i++){
            for(int j = 4 ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }    
    public static void main(String[] args) {
        int n = 5 ;
        patt(n);
    }
}
/*output

* * * * 
* * * 
* * 
*

*/