package GenericsExample;

import java.util.ArrayList;
import java.util.List;

public abstract class Participants<T> {
    public Participants(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    private String name;
    private int age;
}
