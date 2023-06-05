package list.arraylist;

import list.ListInterface;

public class MyArrayList<E> implements ListInterface<E> {

    private int count;
    private E[] objectList;

    private int DEFAULT_CAPACITY = 10;
    public static final int ERROR_NUM = -999999999;

    public MyArrayList(){
        objectList = (E[])new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int size){
        DEFAULT_CAPACITY = size;
        objectList = (E[])new Object[size];
    }

    @Override
    public void insertElement(int position, E data) {

        if( count >= DEFAULT_CAPACITY){
            System.out.println("not enough memory");
            return;
        }

        if( position <0 || position > count){
            System.out.println("insert position error");
            return;
        }

        if(position == count){
            objectList[count++] = data;
            return;
        }

        for(int i = count -1; i >= position; i--){
            objectList[i+1] = objectList[i];
        }

        objectList[position] = data;
        count++;

    }

    @Override
    public void addElement(E data) {

        if( count >= DEFAULT_CAPACITY){
            System.out.println("not enough memory");
            return;
        }

        objectList[count++] = data;

    }

    @Override
    public E removeElement(int position) {
        if(isEmpty()){
            System.out.println("no element");
            return null;
        }

        if( position <0 || position >= count){
            System.out.println("remove position error");
            return null;
        }

        E ret = objectList[position];

        for(int i = position; i<count-1; i++ ){
            objectList[i] = objectList[i+1];
        }

        count--;
        return ret;
    }

    @Override
    public E getElement(int i) {
        return objectList[i];
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if(count == 0){
            return true;
        }
        else return false;
    }

    @Override
    public void removeAll() {

        objectList = (E[])new Object[DEFAULT_CAPACITY];
        count = 0;
    }

    @Override
    public void printAll() {
        if(count == 0){
            System.out.println("Array is empty");
            return;
        }

        for(int i=0; i<count; i++){
            System.out.println(objectList[i]);
        }
    }
}
