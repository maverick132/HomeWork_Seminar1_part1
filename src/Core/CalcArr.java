package Core;

import Core.Interface.EvalutionArr;

public class CalcArr extends Array implements EvalutionArr {

    @Override
    public int div(int firstIndex, int secondIndex) {
        if (this.arr[secondIndex] != 0) return this.arr[firstIndex]/this.arr[secondIndex];
        else throw new ArithmeticException("������ �� 0 ������.");
    }


    @Override
    public void mult() {

    }

    @Override
    public void sub() {

    }

    @Override
    public void sum() {

    }
}
