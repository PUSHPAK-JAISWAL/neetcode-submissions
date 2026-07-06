class Solution {
    public int calPoints(String[] operations) {
        int sum = 0;
        Set<String> specialOps = Set.of("D", "C", "+");
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<operations.length;i++) {
            if(operations[i].equals("+")) {
                int temp1 = stack.pop();
                int temp = temp1+stack.peek();
                stack.push(temp1);
                stack.push(temp);
            }
            if(operations[i].equals("D")) {
                stack.push(stack.peek()*2);
            }
            if(operations[i].equals("C")) stack.pop();
            if (!specialOps.contains(operations[i])) {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}