import java.io.*;
public class Pattern2 {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String wd;
        int a,y;
        System.out.println("Enter your word for the pattern printing");
        wd = br.readLine();
        y = wd.length();
        for(a=0;a<=y;a++)
        {
            System.out.println(wd.substring(0,a));
        }
    }
}


