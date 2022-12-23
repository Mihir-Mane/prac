import java.net.*;
import java.io.*;
class serverPrime {
    public static void main(String args[]){
        try{
            ServerSocket socket = new ServerSocket(8001);
            System.out.println("Server Strated.");
            Socket soc = socket.accept();
            DataInputStream inp = new DataInputStream(soc.getInputStream());
            int x = inp.readInt();
            DataOutputStream out = new DataOutputStream(soc.getOutputStream());
            int y = x / 2;
            if(x==1 || x==2 || x==3){
                out.writeUTF(x+" is prime");
                System.exit(0);
            }
            for(int i=2; i<=y; i++){
                if(x%i != 0){
                    out.writeUTF(x+" is prime.");
                } else{
                    out.writeUTF(x+" is not prime");
                }
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}