public interface List<E> {

    public int size();

    public Object get(int index);

    public String toString();

    //public int indexOf(ListNode node);

    public void add(E value);

    public void add(int index, E value);

    public void remove(int index);

}