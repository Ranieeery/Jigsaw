package dev.raniery.operations;

import dev.raniery.operations.internal.Div;
import dev.raniery.operations.internal.Mult;
import dev.raniery.operations.internal.Sub;
import dev.raniery.operations.internal.Sum;

public class Calc {
    private Sum sumHelper;
    private Sub subHelper;
    private Mult multHelper;
    private Div divHelper;

    public Calc(){
        sumHelper = new Sum();
        subHelper = new Sub();
        multHelper = new Mult();
        divHelper = new Div();
    }

    public int sum(int a, int b) {
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b) {
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b) {
        return multHelper.execute(a, b);
    }

    public int div(int a, int b) {
        return divHelper.execute(a, b);
    }

}
