import java.util.Stack;

public class day2 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Closing brackets
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        day2 obj = new day2();

        System.out.println(obj.isValid("()"));       // true
        System.out.println(obj.isValid("()[]{}"));   // true
        System.out.println(obj.isValid("(]"));       // false
        System.out.println(obj.isValid("([)]"));     // false
        System.out.println(obj.isValid("{[]}"));     // true
    }
}