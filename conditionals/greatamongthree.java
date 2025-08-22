package conditionals;

public class greatamongthree {
    public static void main(String[] args) {
       int frist=10,second=20,third=30;
       if(frist>second){
           if(frist>third){
               System.out.println(frist+" : Frist is greater ...");
           }
       }
       else{
           if(second>third){
               System.out.println( second +" :second is gretaer...");
           }
           else{
               System.out.println(third +": third is greater ...");
       }
        }

    }
}
