import java.util.LinkedList;

public class Run
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedIntList = new LinkedList();
        linkedIntList.remove(1);
        linkedIntList.add("hi");
        linkedIntList.add("hej");
        linkedIntList.add("hej");

        //System.out.println(linkedIntList.size());
        //System.out.println(linkedIntList.get(-5));
        System.out.println(linkedIntList.toString());

        linkedIntList.add(1,"cake");
        //System.out.println(linkedIntList.toString());
        linkedIntList.add(2,"mor");
        System.out.println(linkedIntList.toString());

        linkedIntList.remove(7);
        System.out.println(linkedIntList.toString());



        LinkedList linkedList = new LinkedList();


    }
}
