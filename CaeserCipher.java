public class CaeserCipher
{
 private final static String wheel = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 private String originalPhrase;
 private int shiftValue;
 
 public CaeserCipher(String phrase)
 {
     originalPhrase = phrase.toUpperCase();
     shiftValue = (int) (Math.random() * 5) + 3;
 }
 
 public String getEncryptedPhrase()
 {
     String encrypted = "";
     for (int i = 0; i < originalPhrase.length(); i++)
     {
        String let = originalPhrase.substring(i, i+1);
        int index = wheel.indexOf(let);
        if (wheel.indexOf(let) != -1)
          { index = (index +shiftValue) %wheel.length();
             encrypted += wheel.substring(index, index+1);
           } 
            else
            {
                encrypted += let;
            }
        return encrypted;
     }
     return encrypted; 
 } 
}