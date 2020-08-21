import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Return true if the string is balanced.
 * example: [({})]
 * return: true
*/
public class BalancedString {

    public static boolean isBalancedOptionOne(String s){
        Stack<Character> c = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                c.add(s.charAt(i));
            }
            else {
                Character c1 = c.pop();
                if (c1 != null && ((c1 == '[' && s.charAt(i) == ']') ||
                        (c1 == '(' && s.charAt(i) == ')') ||
                        (c1 == '{' && s.charAt(i) == '}'))) {
                    continue;
                }
                return false;
            }
        }
        return c.empty();
    }

    public static boolean isBalancedOptionTwo(String s){
        Map<Character, Character> m = new LinkedHashMap<Character, Character>();
        m.put('(', ')');
        m.put('[', ']');
        m.put('{', '}');
        Stack<Character> c = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            if(m.containsKey(s.charAt(i))) {
                c.add(s.charAt(i));
            }
            else {
                Character c1 = c.pop();
                if (c1 != null && s.charAt(i) == m.get(c1)) {
                    continue;
                }
                return false;
            }
        }
        return c.empty();
    }
}
