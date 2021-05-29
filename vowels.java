import java.io.*;
public class vowels {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x,y,v;
        v=0;
        String st;
        char b;
        System.out.println("Enter your string");
        st=br.readLine();
        x=st.length();
        for(y=0;y<x;y++)
        {
            b=(st.charAt(y));
            if((b=='a')||(b=='e')||(b=='i')||(b=='o')||(b=='u')||(b=='A')||(b=='E')||(b=='I')||(b=='O')||(b=='U'))
            v=v+1;
        }
        System.out.println("The no of vowels is teh string ="+v);
    }

}
