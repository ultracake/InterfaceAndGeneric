import java.util.LinkedList;

public class Run
{
    public static void main(String[] args)
    {
        LinkedIntList linkedIntList = new LinkedIntList();

        linkedIntList.add(2);
        linkedIntList.add(3);
        linkedIntList.add(5);

        //System.out.println(linkedIntList.size());
        //System.out.println(linkedIntList.get(-5));
        System.out.println(linkedIntList.toString());

        linkedIntList.add(1,9);
        //System.out.println(linkedIntList.toString());
        linkedIntList.add(2,3);
        System.out.println(linkedIntList.toString());

        linkedIntList.remove(2);
        System.out.println(linkedIntList.toString());



        LinkedList linkedList = new LinkedList();


    }
}
