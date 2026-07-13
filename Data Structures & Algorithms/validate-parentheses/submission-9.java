class Solution {
    public boolean isValid(String s) {
        Stack<Character> charstack=new Stack<>();
        if(s.length()<2){
            return false;
        }
        for(char c: s.toCharArray()){
            if(c=='(')
            charstack.push(')');
            else if(c=='[')
            charstack.push(']');
            else if(c=='{')
            charstack.push('}');
            else if(charstack.isEmpty() || charstack.pop()!=c){
                return false;
            }
        }
        return charstack.isEmpty();
    }
}
