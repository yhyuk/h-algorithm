import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        boolean flag = true;
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                flag = true;
            } else if (flag) {
                c = Character.toUpperCase(c);
                flag = false;
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}