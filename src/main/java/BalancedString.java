import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Return true if the string is balanced.
 * example: [({})]
 * return: true
*/
public class BalancedString {
    //O(n2)
    public static boolean isBalancedOptionOne(String s){
        Stack<Character> characters = new Stack<Character>();
        Character currentCharacter;
        for (int i = 0; i < s.length(); i++){
            currentCharacter = s.charAt(i);
            if(currentCharacter == '[' || currentCharacter == '(' || currentCharacter == '{') {
                characters.add(s.charAt(i));
            }
            else {
                Character topCharacter = characters.pop();
                if (topCharacter != null && ((topCharacter == '[' && s.charAt(i) == ']') ||
                        (topCharacter == '(' && s.charAt(i) == ')') ||
                        (topCharacter == '{' && s.charAt(i) == '}'))) {
                    continue;
                }
                return false;
            }
        }
        return characters.empty();
    }

    //O(n2)
    public static boolean isBalancedOptionTwo(String s){
        Map<Character, Character> characterPairs = new HashMap<Character, Character>()
        {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};
        Character currentCharacter;
        Stack<Character> characters = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            currentCharacter = s.charAt(i);
            if(characterPairs.containsKey(currentCharacter)) {
                characters.add(currentCharacter);
            }
            else {
                Character topCharacter = characters.pop();
                if (topCharacter != null && currentCharacter == characterPairs.get(topCharacter)) {
                    continue;
                }
                return false;
            }
        }
        return characters.empty();
    }
}
