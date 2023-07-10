package dev.raniery.operations.internal;

import dev.raniery.operations.CalcAble;

public class Div implements CalcAble {
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
