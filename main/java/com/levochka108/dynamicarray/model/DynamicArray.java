package com.levochka108.dynamicarray.model;


public class DynamicArray<T> {
    private T[] array;
    private int length;

    public DynamicArray() {
        length = 0;
        array = (T[]) new Object[0];
    }

    public DynamicArray(T[] data) {
        length = data.length;
        array = (T[]) new Object[length];
        System.arraycopy(data, 0, array, 0, length);
    }

    public void insert(T item) {
        if (length == array.length) {
            resize();
        }
        array[length++] = item;
    }

    public void remove(int index) {
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, length - index - 1);
        length--;
    }

    public void removeAll(T item) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(item)) {
                remove(i);
                i--;
            }
        }
    }

    public T min() {
        if (length == 0) {
            throw new IllegalStateException();
        }
        T min = array[0];
        for (int i = 1; i < length; i++) {
            if (((Comparable<T>) array[i]).compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T max() {
        if (length == 0) {
            throw new IllegalStateException();
        }
        T max = array[0];
        for (int i = 1; i < length; i++) {
            if (((Comparable<T>) array[i]).compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public T sum() {
        if (length == 0) {
            throw new IllegalStateException();
        }
        T sum = array[0];
        for (int i = 1; i < length; i++) {
            sum = add(sum, array[i]);
        }
        return sum;
    }

    public T multiply() {
        if (length == 0) {
            throw new IllegalStateException();
        }
        T product = array[0];
        for (int i = 1; i < length; i++) {
            product = multiply(product, array[i]);
        }
        return product;
    }

    public int indexOf(T item) {
        for (int i = 0; i < length; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(T item) {
        return indexOf(item) != -1;
    }

    public void bubbleSort() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (((Comparable<T>) array[j]).compareTo(array[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < length; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && ((Comparable<T>) array[j]).compareTo(key) > 0) {
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
                if (((Comparable<T>) array[j]).compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(i, minIndex);
            }
        }
    }

    public T get(int index) {
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public void set(int index, T item) {
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = item;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int length() {
        return length;
    }

    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2 + 1];
        System.arraycopy(array, 0, newArray, 0, length);
        array = newArray;
    }

    private void swap(int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf((Integer) a + (Integer) b);
        } else if (a instanceof Double) {
            return (T) Double.valueOf((Double) a + (Double) b);
        } else {
            throw new IllegalArgumentException();
        }
    }

    private T multiply(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf((Integer) a * (Integer) b);
        } else if (a instanceof Double) {
            return (T) Double.valueOf((Double) a * (Double) b);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
