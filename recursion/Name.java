class Name {
    static void printName(int num ){
        if(num==0){
            return;
        }
        System.out.println("Ankit"+num);
        printName(num-1);
        System.out.println("Upadhyay");
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
