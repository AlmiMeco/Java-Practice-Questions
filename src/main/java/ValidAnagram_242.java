import java.util.Arrays;

public class ValidAnagram_242 {


    /** Given two strings s and t, return true if t is an anagram of s, and false otherwise.

     An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     typically using all the original letters exactly once.

     Input: s = "anagram", t = "nagaram"
     Output: true

     **/


    public static boolean isAnagram(String s, String t){

        if (s.length() != t.length()) return false;

        /* Turn both Strings to -> chaar[] */
        var arrayS = s.toCharArray();
        var arrayT = t.toCharArray();

        /* Sort Both Strings */
        Arrays.sort(arrayS); //Bad Time complexity sorting to Different
        Arrays.sort(arrayT);

        /* Compare both char[] */
        if (Arrays.equals(arrayS, arrayT)) return true;

        return false;


    }

    public static void main(String[] args) {

        String s = "dog";
        String t = "good";
        
        System.out.println(isAnagram(s, t));


    }


}
