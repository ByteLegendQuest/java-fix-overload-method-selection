package com.bytelegend;

/**
 * Guess the output of `Main.main()` method, then run it and see if it is
 * expected. Please
 * understand it and modify `main()` method to make it output "I am Sub, the
 * param is ParamSub".
 */
public class Main {
    public static void main(String[] args) {
        Sub object = new Sub();
        ParamSub param = new ParamSub();
        object.print(param);
    }
}

class ParamBase {
}

class ParamSub extends ParamBase {
}

class Base {
    public void print(ParamBase param) {
        System.out.println("I am Base, the param is ParamBase");
    }

    public void print(ParamSub param) {
        System.out.println("I am Base, the param is ParamSub");
    }
}

class Sub extends Base {
    @Override
    public void print(ParamBase param) {
        System.out.println("I am Sub, the param is ParamBase");
    }

    @Override
    public void print(ParamSub param) {
        System.out.println("I am Sub, the param is ParamSub");
    }
}
