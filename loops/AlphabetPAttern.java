
public class AlphabetPAttern  {
    public static void main(String[] args) {
        int n = 5 ;
        char character = 'A';
        for(int i = 0; i < n ; i++){
            for(int j = 0; j<=i;j++){
                //if(i == 1 || i == n || j == 1 || j == n || i == j  || j == n-i + 1){
                    System.out.print(character +" ");
                    character++;
            }
            System.out.println();
        }
    }
}

// o u t p u t :
// A  
// B  C  
// D  E  F  
// G  H  I  J  
// K  L  M  N  O 
