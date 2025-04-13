package test;

public class Overloading {

    public static void main(String[] args) {

        // create an object addition to call method
        Overloading addition = new Overloading();
        System.out.println(addition.add(1, 2, 3));
    }

    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    int add(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

}
