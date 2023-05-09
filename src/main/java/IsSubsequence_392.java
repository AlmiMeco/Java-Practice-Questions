public class IsSubsequence_392 {

/** Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

 A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the
 characters without disturbing the relative positions of the remaining characters.
 (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 Input: s = "abc", t = "ahbgdc"
 Output: true

 **/




    public static boolean isSubsequence(String s, String t) {

        Character placeHolderChar = null;

        for (int i = 0; i < s.length(); i++) {
            placeHolderChar = s.charAt(i);
            CharSequence character = placeHolderChar.toString();

            if (t.contains(character)) {

            }else return false;

        }

        return true;

    }

    /** THIS SOLUTION ONLY FINDS OUT IF 't' IS A VALID SUBSEQUENCE 's'
        -> ALL CHAR OF: 's' MUST BE INCLUDED IN: 't'
            -> THIS SOLUTION DOES NOT ACCOUNT FOR INSERTION ORDER**/

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s,t));


    }

}
