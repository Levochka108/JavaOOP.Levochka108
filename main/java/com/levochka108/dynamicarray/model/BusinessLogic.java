package main.java.com.levochka108.dynamicarray.model;


public class BusinessLogic {
    private final DynamicArray<Integer> dynamicArray;

    public BusinessLogic() {
        dynamicArray = new DynamicArray<>();
    }

    public void insertItem(int item) {
        dynamicArray.insert(item);
    }

    public void removeItem(int index) {
        dynamicArray.remove(index);
    }

    public int searchItem(int item) {
        return dynamicArray.indexOf(item);
    }

    public String printArray() {
        return dynamicArray.toString();
    }
}
