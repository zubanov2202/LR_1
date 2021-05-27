package com.example.lr1;



public class Test {

    private double ab, bc, ac;
    private double perimeter, semiPerimeter;
    private double squareHeron;

    Triangle t1 = new Triangle(2,5,6);

    @org.junit.Test
    public void Perimeter(){

        ab = t1.getAB();
        bc = t1.getBC();
        ac = t1.getAC();

        System.out.println(t1);


        perimeter = ab + bc + ac;
        System.out.println("Периметр этого треугольника равен:  " + perimeter );
    }

    @org.junit.Test
    public void SquareHeron(){
        ab = t1.getAB();
        bc = t1.getBC();
        ac = t1.getAC();

        System.out.println(t1);

        semiPerimeter = 0.5 * (ab + bc + ac);
        System.out.println("Полупериметр этого треугольника равен: " + semiPerimeter);

        squareHeron = Math.sqrt (semiPerimeter * (semiPerimeter - ab) * (semiPerimeter - bc) *
                (semiPerimeter - ac));

        String square = String.format("%.2f", squareHeron);

        System.out.println("Площадь треугольника по формуле Герона равна: " + square);

    }

}
