public class Stack {
    Node top;
    int size;
    Stack(){
        size = 0;
        top = null;
    }
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty(){
        return top==null;
    }
    public  void push(int data){
        Node curr = new Node(data);
        curr.next = top;
        top = curr;
        size++;
    }
    public int pop(){
        if(isEmpty()) throw new IllegalStateException("Stack is Empty");
        int result = top.data;
        top = top.next;
        size--;
        return result;
    }
    public int peek(){
        if(isEmpty()) throw new IllegalStateException("Stack is Empty");
        int result = top.data;
        return result;
    }
    public int getSize(){
       return size;
    }
    public void display() {
        Node curr = top;
        System.out.print("Stack (top to bottom): ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public void clearStack(){
        top = null;
        size = 0;
        System.out.println("The current stack is cleared");
    }
    public void pushAtBottom(int data,Stack s){
        if(top==null){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    public void reverseStack(Stack s){
        if(isEmpty()) return;
        int temp = s.pop();
        reverseStack(s);
        pushAtBottom(temp,s);
    }
    public static void main(String[] args){
        System.out.println("Crime And Punishment");
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("you removed the element "+st.pop()+" from the top of the stack");
        System.out.println("the current element at the top of the stack is "+st.peek());
        System.out.println("The current size of the stack is "+st.getSize());
        st.pushAtBottom(4,st);
        st.display();
        st.reverseStack(st);
        st.display();
        st.clearStack();
    }
}
