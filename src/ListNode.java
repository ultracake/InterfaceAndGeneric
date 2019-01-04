
// ListNode is for storing a single node of a linked list and a value.
public class ListNode
{
    public Object data;    // data stored in this node
    public ListNode next;  // link to next node in the list

    // constructs a node with data null and null link
    public ListNode()
    {
        //this(null, null);
        this.data = null;
        this.next = null;
    }

    // constructs a node with given data and null link
    public ListNode(Object data)
    {
        //this(data, null);
        this.data =data;
        this.next = null;
    }

    // constructs a node with given data and given link
    /*
    public ListNode(Object data, ListNode next)
    {
        this.data = data;
        this.next = next;
    }*/
}


