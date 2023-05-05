package com.levochka108.oop.ui.view.mathprogram.console;

import com.levochka108.oop.ui.model.Circle;
import com.levochka108.oop.ui.model.Rectangle;
import com.levochka108.oop.ui.model.Square;
import com.levochka108.oop.ui.model.Triangle;
import com.levochka108.oop.ui.model.abstractmodel.Figure;
import com.levochka108.oop.ui.model.abstractmodel.Polygon;
import com.levochka108.oop.ui.view.mathprogram.Collection;

import java.io.PrintWriter;

import java.util.Scanner;

public class ConsoleMenu {

    public ConsoleMenu() {
        try {
            mainDB.addFigure(new Circle(Math.random() * 10.0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            mainDB.addFigure(new Square(Math.random() * 10.0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            mainDB.addFigure(new Rectangle(Math.random() * 10.0, Math.random() * 10.0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        double rnd = Math.random() * 10.0;

        try {
            mainDB.addFigure(new Triangle(rnd, rnd, rnd));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    private final Collection mainDB = new Collection();
    private final PrintWriter pw = new PrintWriter(System.out, true);
    private final Scanner scan = new Scanner(System.in);

    public void getMainMenu() throws Exception {
        int cmd = 0;
        do {
            pw.println("1. Вывод информации о всех периметрах, площадях и длиннах окружности\n" +
                    "2. Добавить фигуру\n" +
                    "3. Удалить фигуру\n" +
                    "4. Изменить фигуру");

            cmd = getIntValue("команду");
            switch (cmd) {
                case 1 -> this.calculateAllData();
                case 2 -> this.getMenuAddNewFig();
                case 3 -> this.removeFigure();
                case 4 -> this.editFig();
            }
        } while (cmd != 0);
    }


    private void calculateAllData() {
        int currIndex = 0;
        mainDB.sort();
        for (Figure fig : mainDB) {
            pw.println("Фигура " + fig.getClass().getSimpleName() + " с индексом " + currIndex++);
            pw.println("Площадь = " + fig.getArea());
            if (fig instanceof Polygon)
                pw.println("Периметр = " + ((Polygon) fig).getPerimeter());
            if (fig instanceof Circle)
                pw.println("Длина окружности = " + ((Circle) fig).getLength());
            pw.println("-----------------");
        }
    }

    private void getMenuAddNewFig() throws Exception {
        int res = 0;
        pw.println("1.Треугольник\n" +
                "2.Квадрат\n" +
                "3.Прямоугольник\n" +
                "4. Круг");
        switch (getIntValue("команду")) {
            case 1:
                res = mainDB.addFigure(new Triangle(getDblValue("сторону A")));
                break;
            case 2:
                res = mainDB.addFigure(new Square((double) getDblValue("длину стороны")));
                break;
            case 3:
                res = mainDB.addFigure(new Rectangle(getDblValue("длину"), getDblValue("высоту")));
                break;
            case 4:
                res = mainDB.addFigure(new Circle(getDblValue("радиус")));
                break;

        }
        if (res == 0)
            pw.println("Фигура успешно добавлена!");
        else
            pw.println("Ошибка добавления!");
    }

    /**
     * Меню №3 Удаление фигуры
     */
    private void removeFigure() {
        int res = mainDB.removeFigure(getIntValue("индекс удаляемой фигуры"));
        if (res == 0)
            pw.println("Фигура успешно удалена!");
        else
            pw.println("ошибка удаления фигуры!");
    }


    private void editFig() throws Exception {
        int index = getIntValue("индекс фигуры");
        int res = 0;
        String className = mainDB.getFigure(index).getClass().getSimpleName();
        pw.println(mainDB.getFigure(index));
        switch (className) {
            case "Circle":
                res = mainDB.editFigure(new Circle(getDblValue("радиус")), index);
                break;
            case "Rectangle":
                res = mainDB.editFigure(new Rectangle(getDblValue("длину"), getDblValue("высоту")), index);
                break;
            case "Square":
                res = mainDB.editFigure(new Square((double) getDblValue("длину стороны")), index);
                break;
            case "Triangle":
                res = mainDB.editFigure(new Triangle(getDblValue("сторону A")), index);
                break;
            default:
                res = -1;
        }
        switch (res) {
            case -1:
                pw.println("Ошибка изменения!");
                break;
            case 0:
                pw.println("Изменения записаны успешно!");
                break;
            case 1:
                pw.println("Изменений не внесено!");
                break;
        }
    }


    private int getIntValue(String msg) {
        pw.println("Введите " + msg + " (целочисленное):");
        return scan.nextInt();
    }

    private int getDblValue(String msg) {
        pw.println("Введите " + msg + " (с плавающей точкой):");
        return (int) scan.nextDouble();
    }

    private String getStrValue(String msg) {
        pw.println("Введите " + msg + " (строка):");
        return scan.nextLine();
    }

}
