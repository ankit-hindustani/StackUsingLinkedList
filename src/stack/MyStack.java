package stack;

public class MyStack {
    //top of stack
    Node head;
    //number of element in stack
    int size;

    public MyStack() {
        head = null;
        size = 0;
    }

    //isEmpty() to check stack for zero elements
    public boolean isEmpty() {
        boolean response = false;
        if (head == null) {
            response = true;
        }
        return response;
    }
//insert at beginning O(1)(don't use insert at end due to complexity O(n))
    public void push(int element)
    {
        Node node=new Node(element);
        node.setNext(head);
        head=node;
        size++;
    }

//delete from beginning
public Node pop()
{
    Node response=null;
    if(!isEmpty())
    {
        response=head;
        size--;
        head=head.getNext();
    }
    else
    {
        System.out.println("stack underflow");
    }
    return response;
}
public int size()
{
    return size;
}
public Node peek()
{
    Node response=null;
    if(!isEmpty())
    {
        response=head;
    }
    return response;
}
}
