class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> exp = new Stack<>();

        for(String val:tokens){
            if(val.equals("+")) exp.push(exp.pop()+exp.pop());
            if(val.equals("-")) { int b = exp.pop(); exp.push(exp.pop() - b); }
            if(val.equals("*")) exp.push(exp.pop()*exp.pop());
            if(val.equals("/")) { int b = exp.pop(); exp.push(exp.pop() / b); }
            if(!val.equals("+") && !val.equals("-") && !val.equals("*") && !val.equals("/")) exp.push(Integer.parseInt(val));
        }
        return exp.pop();
    }
}
