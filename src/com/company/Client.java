package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String name = in.next();
        try {
            Socket socket = new Socket("192.168.31.36", 1997);
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream =
                    new ObjectInputStream(socket.getInputStream());
            while (true) {
                System.out.print("Insert message:");
                String message = in.next();
                PackageData data = new PackageData(name, message);
                outputStream.writeObject(data);

                if ((data = (PackageData) inputStream.readObject()) != null) {
                    System.out.println("response:"+data.getMessage());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
