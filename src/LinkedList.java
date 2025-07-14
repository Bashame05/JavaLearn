
public class LinkedList {
   static class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
     Node head;
     int size;
    LinkedList(){
        size = 0;
    }
    public  void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            size++;
            return;
        }
        size++;
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        size++;
        currNode.next = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("LIST IS EMPTY");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        size--;
        head = head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        size--;
        if(head.next==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public void getsize(){
        System.out.println("The size of the list is "+size);
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst("viola");
        list.addFirst("robin");
        list.addFirst("nami");
        list.addFirst("carrot");
        list.addLast("makar");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.getsize();
    }
}
