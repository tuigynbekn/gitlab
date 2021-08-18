package ParametrizedClasses;

public class Main {
    public static void main(String[] args) {
        Info<String,Double> o1 = new Info<>("Nurlan",5000000.0);
        System.out.println(o1.getValue());
        System.out.println(o1.getValue2()); //192.168.31.36
    }
}