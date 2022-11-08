import java.util.Stack;

public class isValidBrackets {


    public static boolean isValid(String s) {
        Stack <Character> tmpStack = new Stack<Character>();
        for (int i = 0 ;i<s.length();i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){     // the left brackets
                tmpStack.push(s.charAt(i));
            }else if (s.charAt(i) ==')' && !tmpStack.isEmpty() && tmpStack.peek()=='('){
                tmpStack.pop();
            }else if (s.charAt(i) =='}' && !tmpStack.isEmpty() && tmpStack.peek()=='{'){
                tmpStack.pop();
            }else if (s.charAt(i) ==']' && !tmpStack.isEmpty() && tmpStack.peek()=='[') {
                tmpStack.pop();
            }else {
                return false;
            }
        }
        return tmpStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        String s1 = "()[]{}";
        String s2 = "(]";
        System.out.println("answer s = " + isValid(s));
        System.out.println("answer s1 = " + isValid(s1));
        System.out.println("answer s2 = " + isValid(s2));

    }

}
