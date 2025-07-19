public class Queue {
    Node front,rear;
    int size;
    Queue(){
        front = null;
        rear = null;
        size = 0;
    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty(){
        return front==null;
    }
    public void enqueue(int data){
      Node curr = new Node(data);
      if(isEmpty()){
          front = rear = curr;
          size++;
      }else{
          rear.next = curr;
          rear = curr;
          size++;
      }
    }
    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        int ans = front.data;
        front = front.next;
        size--;
        if(isEmpty()) rear = null;
        return ans;
    }
    public void display() {
        Node curr = front;
        System.out.print("Queue: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args){
        System.out.println("I REALLY WANNA STAY AT YOUR HOUSE");
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("The size of the queue now is "+q.getSize());
        System.out.println("you removed the element "+ q.dequeue());
        q.display();
    }
}
