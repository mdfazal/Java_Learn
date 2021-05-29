public class Sample {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char chr;
        System.out.println("Enter a character to check the case of a letter or digit ");
        chr = (char)(br.read());
        if(Character.isLetter(chr))
        {
            System.out.println(chr+" is a letter");
            if(Character.isUpperCase(chr)==true)
            System.out.println(chr+" is a Upper case letter");
            if(Character.isLowerCase(chr)==true)
            System.out.println(chr+" is a lower case letter");
        }
        else
        {
            if(Character.isDigit(chr)==true)
            System.out.println(chr+" is a digit");
            else
            System.out.println(chr+ " is a special character");
        }
    }
}
