import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();        
        
        for (int i=0; i<s.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
			} else {
				char ch = s.charAt(i); // current

				if (stack.peek() == ch) {
					// 제거
					stack.pop();
				} else {
					// 추가
					stack.push(ch);
				}
			}
		}

        return stack.isEmpty() ? 1 : 0;
    }
}