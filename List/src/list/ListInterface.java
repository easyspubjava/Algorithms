package list;

public interface ListInterface<E> {

    public void insertElement(int i, E data);
    public void addElement(E data);
    public E removeElement(int i);
    public E getElement(int i);
    public int getSize();
    public boolean isEmpty();
    public void removeAll();
    public void printAll();

}
