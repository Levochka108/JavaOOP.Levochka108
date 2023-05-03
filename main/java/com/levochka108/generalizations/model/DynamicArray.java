package com.levochka108.generalizations.model;

public class DynamicArray<T> {
    private T[] array;
    private int length;
    private int index;
    private T element;

    public DynamicArray() {
        this.array = (T[]) new Object[0];
        this.length = 0;
    }

    public DynamicArray(T[] initialArray) {
        this.array = initialArray.clone();
        this.length = initialArray.length;
    }

    public void insert(T value) {
        T[] newArray;
        newArray = (T[]) new Object[length + 1];
        System.arraycopy(array, 0, newArray, 0, length);
        newArray[length] = value;
        array = newArray;
        length++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length " + length);
        }
        T[] newArray = (T[]) new Object[length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, length - index - 1);
        array = newArray;
        length--;
    }

    public void removeAll(T value) {
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < length; readIndex++) {
            if (!array[readIndex].equals(value)) {
                array[writeIndex++] = array[readIndex];
            }
        }
        T[] newArray = (T[]) new Object[writeIndex];
        System.arraycopy(array, 0, newArray, 0, writeIndex);
        array = newArray;
        length = writeIndex;
    }

    public T findMin() {
        if (length == 0) {
            throw new IllegalStateException("Cannot find minimum of empty array");
        }
        T min = array[0];
        for (int i = 1; i < length; i++) {
            if (((Comparable<T>) array[i]).compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T findMax() {
        if (length == 0) {
            throw new IllegalStateException("Cannot find maximum of empty array");
        }
        T max = array[0];
        for (int i = 1; i < length; i++) {
            if (((Comparable<T>) array[i]).compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public double findSum() {
        double sum = 0.0;
        for (int i = 0; i < length; i++) {
            sum += ((Number) array[i]).doubleValue();
        }
        return sum;
    }

    public double findProduct() {
        double product = 1.0;
        for (int i = 0; i < length; i++) {
            product *= ((Number) array[i]).doubleValue();
        }
        return product;
    }

    public int findIndex(T element) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T element) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void bubbleSort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (((Comparable) array[j]).compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < length; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && ((Comparable) array[j]).compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public void selectionSort() {
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (((Comparable) array[j]).compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public int length() {
        return length;
    }

    public T get(int index) {
        return getElement(index);
    }

    public void set(int index, T element) {
        setElement(index, element);
    }

    public void printArray() {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getLength() {
        return length;
    }

    private T getElement(int index) {
        this.index = index;
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[index];
    }


    private void setElement(int index,
                            T element) {
        this.index = index;
        this.element = element;
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        array[index] = element;
    }







}

