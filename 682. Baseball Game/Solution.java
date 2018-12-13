class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        
        for (String obj:ops){
            if(obj.equals("+")){
                int otop = stack.pop();
                int ntop = stack.peek()+otop;
                stack.push(otop);
                stack.push(ntop);
            }else if(obj.equals("D")){
                stack.push(2*stack.peek());
            }else if(obj.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.valueOf(obj));
            }
        }
        int res = 0;
        for (int addition:stack) res += addition;
        return res;
    }
}