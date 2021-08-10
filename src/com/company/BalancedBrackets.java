package com.company;

import java.util.Stack;

public class BalancedBrackets {
    public static boolean isValid(String s) {
        Stack<Character> openBracket = new Stack<>();

        if (s.length() == 0 || s.length() % 2 != 0) {
            return false;
        }

        char[] sToChar = s.toCharArray();

        for (int i = 0; i < sToChar.length; i++) {
            if (sToChar[i] == '(' || sToChar[i] == '{' || sToChar[i] == '[') {
                openBracket.push(s.charAt(i));
                continue;

            } else {
                if (openBracket.isEmpty()) {
                    return false;
                }
                Character checkBracket = openBracket.pop();
                switch (checkBracket) {
                    case '(':
                        if (!(sToChar[i] == ')')) {
                            return false;
                        }
                        break;
                    case '[':
                        if (!(sToChar[i] == ']')) {
                            return false;
                        }
                        break;
                    case '{':
                        if (!(sToChar[i] == '}')) {
                            return false;
                        }
                        break;
                    default:
                        System.out.println("shouldn't reach here");
                        return false;
                }
            }
        }
        if (!openBracket.isEmpty())
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }
}
