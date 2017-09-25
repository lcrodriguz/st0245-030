import java.util.*;

public class Taller8{
    //Punto 1
    public static Stack<Integer> inversa ( Stack<Integer> stack){
        Stack<Integer> stackr = new Stack<Integer>();
        while (!stack.empty()) {
            stackr.push(stack.pop());
        }
        return stackr;
    }
    //Punto 2
    public static void cola (Queue<String> queue){
        while (!queue.isEmpty()){
            System.out.println("atendiando a:" + queue.poll());
        }
    }

    //notacion polaca
    public static int polaca  (String string){
        Stack<Integer> stack = new Stack<Integer>();
        String[] hola = string.split(" ");
        for(int i = 0; i< hola.length; i++){
            if(hola[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(hola[i].equals("-")){
                stack.push(stack.pop() - stack.pop());
            }
            else if(hola[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(hola[i].equals("/")){
                stack.push(stack.pop() / stack.pop());
            }else{
                int j = Integer.parseInt(hola[i]);
                stack.push(j);
            }
        }
        return stack.pop();
    }
}