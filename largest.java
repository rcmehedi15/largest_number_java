
package largest;
import java.util.Scanner;
public class largest {

   
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);

        System.out.println("Enter The value a:");
        int a= scan.nextInt();

        System.out.println("Enter The value b:");
        int b=scan.nextInt();

        System.out.println("Enter The value c:");
        int c=scan.nextInt();
        
        if((a<b)&& (b<c))
            System.out.println("The small Number is a : "+a);
        else if ((b<c)&&(b<a))
            System.out.println("The small Number is b : "+b);
                    else
            System.out.println("The small Number is c : "+c);
       
      
    }
    
}
