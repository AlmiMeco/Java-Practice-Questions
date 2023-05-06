import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings_205 {

    /** Given two strings s and t, determine if they are isomorphic.

     Two strings s and t are isomorphic if the characters in s can be replaced to get t.

     All occurrences of a character must be replaced with another character while preserving the order of characters.
     No two characters may map to the same character, but a character may map to itself.

     Input: s = "egg", t = "add"
     Output: true

     **/

    public static boolean isIsomorphic(String s, String t) {

        int[] arrayOfS = new int[200];
        int[] arrayOfT = new int[200];

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {

            if (arrayOfS[s.charAt(i)] != arrayOfT[t.charAt(i)]) return false;

            arrayOfS[s.charAt(i)]=i+1;
            arrayOfT[t.charAt(i)]=i+1;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "paper";
        String t = "title";


        System.out.println(isIsomorphic(s, t));

    }

}
