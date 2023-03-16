package ua.lviv.lgs.calculate;

public class Methods {
    int a;
    int b;

    Methods (int a, int b) {
        this.a = a;
        this.b = b;
    }

    void plus() throws MyException, IllegalAccessException {
//        System.out.println(a + " + " + b + " = " + (a+b));
        check();
    }

    void minus() throws MyException, IllegalAccessException {
//        System.out.println(a + " - " + b + " = " + (a-b));
        check();
    }

    void multiple() throws MyException, IllegalAccessException {
//        System.out.println(a + " * " + b + " = " + (a*b));
        check();
    }

    void divided() throws MyException, IllegalAccessException {
//        System.out.println(a + " / " + b + " = " + (a/b));
        check();
    }

    void check() throws MyException, IllegalAccessException {
        if ((a < 0) && (b < 0)) {
            throw new IllegalArgumentException();
        } else if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
            throw new ArithmeticException();
        } else if (a == 0) {
            throw new IllegalAccessException();
        } else if ((a > 0) && (b > 0)) {
            throw new MyException();
        }
    };
}
