class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i : asteroids) {
            while (!stack.isEmpty() && i < 0 && stack.peek() > 0) {
                if (stack.peek() < Math.abs(i)) {
                    stack.pop(); 
                    continue;
                } else if (stack.peek() == Math.abs(i)) {
                    stack.pop();
                }
                i = 0; 
                break;
            }
            
            if (i != 0) {
                stack.push(i);
            }
        }
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        
        return res;
    }
}