package ass;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class client {
    public static void main(String[] args) {
            try {
                Socket server = new Socket("localhost", 4999);
                DataInputStream serverreadsoource = new DataInputStream(server.getInputStream());
                DataOutputStream serverwritesoource = new DataOutputStream(server.getOutputStream());
                Scanner scan = new Scanner(System.in);
                String str = "";
                str = serverreadsoource.readUTF();
                System.out.println(str);
                str = serverreadsoource.readUTF();
                System.out.println(str);
                double x=0 , y=0;
                x = scan.nextInt();
                y = scan.nextInt();
                serverwritesoource.writeDouble(x);
                serverwritesoource.writeDouble(y);
                str = serverreadsoource.readUTF();
                System.out.println(str);
                str = serverreadsoource.readUTF();
                System.out.println(str);
                str = serverreadsoource.readUTF();
                System.out.println(str);
                str = serverreadsoource.readUTF();
                System.out.println(str);

                str = serverreadsoource.readUTF();
                System.out.println(str);
                serverreadsoource.close();
                serverwritesoource.close();
                server.close();


            } catch (IOException ex){
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        }
