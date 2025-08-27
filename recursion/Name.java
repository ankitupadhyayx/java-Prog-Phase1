public class Name {
    static void printName(int num ){
        if(num==0){
            return;
        }
        System.out.println("Ankit");
        printName(num-1);
    }
    public static void main(String[] args) {
        printName(5);

    }
}

// o u t p u t :
// Ankit
// Ankit
// Ankit
// Ankit
// Ankit
