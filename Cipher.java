public class Cipher
{
    public static String encode(String message)
    {
       String result = "";
       char temp;
       for (int i = 0; i < message.length(); i++)
       {
           temp = message.charAt(i);
           temp +=3;
           result += temp;
        }
       return result;
    }
    public static String decode(String message)
    {
        String result = "";
       char temp;
       for (int i = 0; i < message.length(); i++)
       {
           temp = message.charAt(i);
           temp -=3;
           result += temp;
        }
       return result;
        
    }
}