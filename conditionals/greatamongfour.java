// WAP to find the greatest among four numbers using nested if-else statements
package conditionals;

public class greatamongfour {
    public static void main(String[] args) {
       int a=10,b=20,c=30,d=40;
       if(a>b){
           if(a>c){
               if(a>d){
                   System.out.println(a+" : a is greater");
               }
           }
       }
       else{
           if(b>c){
               if(b>d){
                   System.out.println(b +" : b is greater..");
               }
           }
           else {
               if(c>d){
                   System.out.println(c+" : c is greater...");
               }
               else{
                   System.out.println(d+" : d is greater...");
               }
           }
       }

    }
}
