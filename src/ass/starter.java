package ass;
import java.util.Scanner;
public class starter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("hello");
        if(scan.next().equals("server")){
            scan.close();
            server s= new server();
        }else {
            scan.close();
            client c= new client();
        }
    }
}