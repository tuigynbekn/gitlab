package LessonSocket;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            Socket socket = new Socket("192.168.31.36", 1997);

            ObjectOutputStream outputStream =
                    new ObjectOutputStream(socket.getOutputStream());
            while (true) {
                outputStream.writeObject(in.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}