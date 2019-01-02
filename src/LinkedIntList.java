import java.util.LinkedList;

public class LinkedIntList implements IntList
{
    private ListNode front;  // first value in the list

    //constructs an empty list
    public LinkedIntList()
    {
        front = null;
    }

    @Override
    public int size()
    {
        int size = 0;

        //size == 0 then return 0
        if (front == null)
        {
            return size;
        }

        ListNode current = front;

        //counts every node
        while (current != null)
        {
            current = current.next;
            size++;
        }
        return size;
    }

    @Override
    public int get(int index)
    {
        if (index > size() || index < 0)
        {
            System.out.println("Node not found");
            return 0;
        }

        int value = 0;
        ListNode current = front;

        for (int i = 0; i <= index; i++)
        {
            if (i == index)
            {
                value = current.data;
            }
            current = current.next;
        }
        return value;
    }

    // returns comma-separated, bracketed version of list
    public String toString()
    {
        if (front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.data;
            ListNode current = front.next;

            while (current != null)
            {
                result += ", " + current.data;

                current = current.next;
            }

            result += "]";
            return result;
        }
    }

    // appends the given value to the end of the list
    public void add(int value)
    {
        if (front == null)
        {
            front = new ListNode(value);
        }
        else
        {
            ListNode current = front;

            while (current.next != null)
            {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // adds a new node til index and push list by 1!
    @Override
    public void add(int index, int value)
    {
        if (front == null)
        {
            front = new ListNode(value);
        }
        else
        {
            ListNode current = front;
            int copyValue = 0;

            for (int i = 0; i <= size(); i++)
            {
                if (i >= index)
                {
                    copyValue = current.data;
                    current.data = value;
                    value = copyValue;

                }
                if (current.next == null)
                {
                    current.next = new ListNode(value);
                    break;
                }
                current = current.next;
            }
        }
    }

    @Override
    public void remove(int index)
    {
        if (front == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            ListNode current = front;
            int copyValue = 0;

            for (int i = 0; i <= 4; i++)
            {
                if (i >= index && current.next != null)
                {
                    copyValue = current.next.data;
                    current.data = copyValue;
                }

                if (current.next == null)
                {
                    break;
                }
                current = current.next;


            }

        }

    }


}