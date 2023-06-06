import java.util.Scanner;
public class vowel 
{
    public static void main (String a[])
    {
        char ch;
        Scanner s=new Scanner (System.in);
        System.out.println("Enter a charcter");
        ch=s.next().charAt(0);
        s.close();
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')

                System.out.println(ch+ " is a vowel");
            else
                System.out.println(ch+ " is not a vowel");

        }


    }
    
}
