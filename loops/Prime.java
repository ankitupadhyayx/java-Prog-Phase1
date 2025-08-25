//whether the given num iis prime or not

public class Prime {
    public static void main(String[] args) {
            int n = 16;
            int count = 0;
            for(int i = 1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
        System.out.println(count==2?"prime":"not prime");
    }
}
