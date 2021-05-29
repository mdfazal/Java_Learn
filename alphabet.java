import java.io.*;
public class alphabet {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char chr, chr1;
        System.out.println("Enter an alphabet");
        chr = (char)(br.read());
        if(Character.isUpperCase(chr)==true)
        {
            chr1 = Character.toLowerCase(chr);
            System.out.println(("The lowercase of" +chr+ "is" + chr1));
            System.out.println("The ASCII values of"+chr+ "is"+(int)chr1);
        }
        else
        {
            chr1=Character.toUpperCase(chr);
            System.out.println(("The uppercase of" +chr+ "is" + chr1));
            System.out.println("The ASCII values of"+chr+ "is"+(int)chr1);

        }
    }
}


