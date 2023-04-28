package com.levochka108.oop.ui.view.mathprogram;

import com.levochka108.oop.ui.model.abstractmodel.Figure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection implements Iterable<Figure>, Comparable<Figure> {

    public Collection() {
        this.figDB  = new ArrayList<>();
    }

    public Figure getFigure(int index) {
        if (index < this.figDB.size())
            return this.figDB.get(index);
        else
            return null;
    }

    private final ArrayList<Figure> figDB;


    public int editFigure(Figure fg, int index){
        if (fg.getClass() != this.figDB.get(index).getClass())
            return -1; // Классы не совпадают!
        if (fg.equals(this.figDB.get(index)))
            return 1; // Нет изменений!
        else {
            this.figDB.remove(index);
            this.figDB.add(index, fg);
            return 0; // Изменения записаны.
        }
    }

    public int addFigure(Figure af) {
        try {
            figDB.add(af);
            return 0;
        } catch (Exception e) {
            return -1;
        }
    }

    public int removeFigure(int index) {
        if (index < this.figDB.size()) {
            this.figDB.remove(index);
            return 0;
        } else
            return -1;

    }

    public void sort(){
        Collections.sort(this.figDB);
    }

    @Override
    public Iterator iterator() {
        Iterator<Figure> it = new Iterator<>() {
            private int currIndex = 0;
            private final int currSize = figDB.size();

            @Override
            public boolean hasNext() {
                return currIndex < currSize;
            }

            @Override
            public Figure next() {
                return figDB.get(currIndex++);
            }

            @Override
            public void remove() {
                removeFigure(currIndex--);
                if (currIndex < 0) currIndex = 0;

            }
        };
        return it;
    }

    public int compareTo(Figure o1, Figure o2) {
        return Double.compare(o1.getArea(), o2.getArea());
    }

    @Override
    public int compareTo(Figure o) {
        return 0;
    }
}
