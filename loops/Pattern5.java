public class Pattern5 {
    static void patt(int n){
        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <n-i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        patt(n);
    }
    
}

/* output:
* * * * *
* * * * 
* * *
* *
*
*/