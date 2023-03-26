import java.util.Stack;

public class hello {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        
        stack.push("Minecraft");
        stack.push("COD");
        stack.push("Chess");
        stack.push("COC");
        stack.push("COR");

        String myfavgame = stack.pop();
        
        System.out.println(stack);
        System.out.println(myfavgame);
    }
}
