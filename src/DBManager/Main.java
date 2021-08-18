package DBManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBManager db = new DBManager();
        db.connect();
        System.out.println(db.getAllCars());
    }
}
