public class Pattern4 {
    static void patt(int n ){
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j <= i;j++){
                System.out.print(i+" ");
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
0 
1 1
2 2 2
3 3 3 3
4 4 4 4 4
5 5 5 5 5 5
    */  