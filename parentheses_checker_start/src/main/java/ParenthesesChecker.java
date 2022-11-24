import java.util.Stack;


public class ParenthesesChecker {

    /* the goal is to write a method called check parentheses

    the method should take in a string
    and return a boolean

    return true if the string contains "correct" pairs of parentheses
    return false if not

    situations to return false:
    more opening or closing brackets of a particular type (), <>, {}, []
    closing bracket at start
    opening brackets followed by two closing brackets


    can look at the tests to see what the different situations would be
    */


// stack allows you to inspect all elements stored on the stack.
// with stacks, it is the 'last one, first in' order

// stack 'rules' :
// .push : push elements to the top of stack
// .pop : remove elements from top of stack (will be removed from end to beginning)
// .peak : will read the top element without removing it
// .search : can search inside a stack

    public boolean checkParentheses(String testString) {
        Stack<Character> tester = new Stack<>();

        // need to create a loop that runs through the string and pushes the characters into a stack.
        // then in the stack the code needs to go through each character and run the different tests
        // if it starts with closing bracket, test needs to stop
        // if an opening bracket isn't closed, it needs to stop
        // the closing bracket needs to match the same type as opening bracket
        // if the closing bracket matches the opening bracket, then we can remove the last opening bracket and can continue the whole process.
        // after pushing the opening bracket to stack, we can check if closing bracket matches that opening bracket, if it is of the same type, we pop the opening bracket
        // if the parenthesis are balanced, we should end up with an empty list
        // at end if list isn't empty then opening parenthesis has not found its closing counterpart

        char character;

        for (int i = 0; i < testString.length(); i++) {
            character = testString.charAt(i);

// .charAt returns the character at the specified index in a string,
// as it's defined as (i), it will run through the length of the string ( i < testString.length() ) and increase one character each time (i++)

            if (character == '(')
                tester.push(character); // pushing any '(' onto stack



            if (tester.empty()) return false; // boolean says stack is NOT empty

            else if (character == ')') {
                if (tester.empty())
                    return false;
                else if (tester.peek() == '(')
                    tester.pop();
                    else
                        return true;






            }
        }
        return tester.empty();
    }

    // need to create other methods to check the other bits? not sure how to put it in one code

}





