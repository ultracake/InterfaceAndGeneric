public class Run
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedIntList = new LinkedList<String>();
        linkedIntList.add("hi");
        linkedIntList.add("med");
        linkedIntList.add("dig derude");
        System.out.println(linkedIntList.toString());


        System.out.println("Her tilføjer vi 2 noder med en index.");
        linkedIntList.add(1,"Kage");
        linkedIntList.add(2,"er godt");
        System.out.println(linkedIntList.toString());

        System.out.println("Her fjerner vi med et index.");
        linkedIntList.remove(3);
        System.out.println(linkedIntList.toString());

        /*
        System.out.println("test size:");
        System.out.println(linkedIntList.size());
        */

        /*
        System.out.println(linkedIntList.get(2));
        System.out.println(linkedIntList.toString());
        */
    }
}
