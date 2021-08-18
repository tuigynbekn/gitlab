package ParametrizedClasses;

public class Info<T1,T2> {
    public Info(T1 value, T2 value2) {
        this.value = value;
        this.value2 = value2;
    }

    T1 value;
    T2 value2;

    public T1 getValue() {
        return value;
    }

    public T2 getValue2() {
        return value2;
    }
}

