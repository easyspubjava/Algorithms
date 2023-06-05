package list.linkedlist;

public class ListNode<E> {

    private E data;
    public ListNode<E> next;

    public ListNode(){
        data = null;
        next = null;
    }

    public ListNode(E data){
        this.data = data;
        this.next = null;
    }

    public ListNode(E data, ListNode<E> link){
        this.data = data;
        this.next = link;
    }

    public E getData(){
        return data;
    }
}
