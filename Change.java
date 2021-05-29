import java.io.*;
public class Change {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name, name1;
        name1 = "";
        int a,i;
        char chr,chr1;
        chr1=0;
        System.out.println("Enter your word");
        name = br.readLine();
        a=name.length();
        for(i=0;i<a;i++)
        {
            chr=name.charAt(i);
            if(chr>='A' && chr<='Z')
            {
                chr1 = Character.toLowerCase(chr);
                name1=name1+chr1;
            }
            else if(chr>='a' && chr<='z')
            {
                chr1=Character.toUpperCase(chr);
                name1 = name1+chr1;
            }
            else 

            name1=name1+chr;
        }
        System.out.println(name1);
    }
}
