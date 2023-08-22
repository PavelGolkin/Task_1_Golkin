package task6;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.summ(5,6);
    calc.minus(92,22);
    calc.mn(33,2);
    //теси
    calc.summ(calc.minus(100,50), 25);
    //не проходит т.к значения просто выводятся в консоль,
    // вместо этого можно было бы их сначала в методе выводить в консоль, а потом еще и возвращать из метода
    }
}
