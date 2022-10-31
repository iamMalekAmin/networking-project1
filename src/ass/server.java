package ass;
import javax.swing.*;
import java.net.*;
import java.net.Socket;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(4999);
            Socket client = server.accept();
            DataInputStream clientreadsoource = new DataInputStream(client.getInputStream());
            DataOutputStream clientwritesoource = new DataOutputStream(client.getOutputStream());
            clientwritesoource.writeUTF("connected");
            clientwritesoource.writeUTF(" enter two number");
            double num1=0 , num2=0;
            num1 = clientreadsoource.readDouble();
            num2 = clientreadsoource.readDouble();
            clientwritesoource.writeUTF("nummber1 + number2 = " + (num1 + num2));
            clientwritesoource.writeUTF("nummber1 - number2 = " + (num1 - num2));
            clientwritesoource.writeUTF("nummber1 * number2 = " + (num1 * num2));
            if (num2==0) {
                clientwritesoource.writeUTF("Error , u cant divide by 0 ");
            }
            else{
                    clientwritesoource.writeUTF("nummber1 / number2 = " + (num1 / num2));
            }
            clientwritesoource.writeUTF("bye");
            clientreadsoource.close();
            clientwritesoource.close();
            client.close();

        }catch (IOException ex){
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
