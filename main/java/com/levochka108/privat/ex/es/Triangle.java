package com.levochka108.privat.ex.es;

public record Triangle(int first, int second, int third) {

    public int perimeter() {
        return first + second + third;
    }

    public int area() {
        int p = perimeter() / 2;
        return (int) Math.sqrt(p * (p - first) * (p - second) * (p - third));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
