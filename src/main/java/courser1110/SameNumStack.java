package courser1110;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SameNumStack {
    public List<Integer> solution(int[] arr){
        Stack<Integer> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                continue;
            }

            if (stack.peek() != arr[i]) {
                ans.add(stack.pop());
            } else
                stack.pop();

            stack.push(arr[i]);
        }

        ans.add(stack.pop());
        return ans;
    }
//    public static void main(String[] args) {
//        SameNumStack sameNumStack = new SameNumStack();
//        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
//        sameNumStack.solution(arr);
//    }
}
