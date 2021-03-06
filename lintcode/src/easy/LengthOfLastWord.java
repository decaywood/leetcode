package easy;

/**
 * @author: decaywood
 * @date: 2015/10/16 14:39
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Have you met this question in a real interview? Yes
 * Example
 * Given s = "Hello World", return 5.
 *
 * Note
 * A word is defined as a character sequence consists of non-space characters only.
 *
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--, count++) {
            if (s.charAt(i) == ' ') break;
        }
        return count;
    }


}
