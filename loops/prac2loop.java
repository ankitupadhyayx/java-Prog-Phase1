// given digit  :  12345
//1
//2
//3
//4
//5
package conditionals;

public class evenodd {
    public static void main(String[] args) {
        int num=12345;
        int cpy= num;
        int count = 0;
        while(cpy!=0){
            count++;
            cpy=cpy/10;
        }
        while(num!=0){
            int pow=(int)Math.pow(10,count-1);
            System.out.println(num/pow);
            num=num%pow;
            count--;
        }
    }
}
