package com.company;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1997);
            System.out.println("Waiting Client");
            Socket socket = server.accept();
            System.out.println("Client connected");

            ObjectInputStream inputStream =
                    new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(socket.getOutputStream());
            PackageData data = null;
            while ((data = (PackageData) inputStream.readObject()) != null) {
                System.out.println(data.toString());
                PackageData response = null;
                if(data.getMessage().equalsIgnoreCase("hello")
                        || data.getMessage().equalsIgnoreCase("hi")){
                    response = new PackageData("Server", "Hello");
                }else if(data.getMessage().equalsIgnoreCase("lol")){
                    response = new PackageData("Server", "LOOOOLLL!!!!😂");
                }
                outputStream.writeObject(response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
