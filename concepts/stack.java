import java.util.ArrayList;

class stack{
    ArrayList<Integer> stk = new ArrayList<Integer>();
    int size = 5;
     
    public void push(int element){
        if(stk.size() == size){
            System.out.println("Overflow: stack is full");
        } else {
            stk.add(element);
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Underflow: stack is empty");
        } else {
            stk.remove(stk.size()-1);
        }
    }
    public int peek(){
        if(!isEmpty()){
            return stk.get(stk.size() - 1);
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public boolean isEmpty(){
        if(stk.size() == 0){
            return true;
        }
        return false;
    }
    public void printStack(){
        System.out.println(stk);
    }
}


public class Stack {
    public static void main(String[] args) {
       
    }
}
