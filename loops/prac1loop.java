//we have a number eg num = 123 and this number digits are 1 2 3 and sum of digit is 1+2+3=6
//we have to find the sum of digit using loop
package loops;

public class prac1loop {
    public static void main(String[] args) {
       int num = 123;

       int sum = 0;
       while(num!=0){
       int lastdigit = num%10;
       sum=sum+lastdigit;
       num=num/10;}
        System.out.println(sum);
    }
}
