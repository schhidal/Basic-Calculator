package test;

public class Test {
    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.rollNumber);

        OuterClass.Innerclass innerclass = outerClass.new Innerclass();
        System.out.println(innerclass.rollNumber2);

    }

}
