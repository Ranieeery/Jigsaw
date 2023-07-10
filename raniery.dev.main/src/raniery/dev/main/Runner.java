package raniery.dev.main;


import raniery.dev.utils.operations.Calc;

public class Runner {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.sum(1, 2));
    }
}