import java.net.*; 
import java.io.*; 
 
public class server {     
      Socket socket; 
      DataInputStream input; 
      ServerSocket server; 
      public server(int port) throws IOException { 
      try
      {     
            server=new ServerSocket(port); 
            System.out.println("Server started"); 
            System.out.println("Waiting for Client..."); 
 
            socket=server.accept(); 
            System.out.println("Client successfully accpeted!"); 
 
            input= new DataInputStream(new BufferedInputStream(socket.getInputStream()));       
            String line="";       
            while(!line.equals("terminate"))       
            {           
                  line = input.readUTF(); 
                  System.out.println(line); 
 
            } 
            input.close(); 
            socket.close(); 
      } 
      catch(IOException i) { 
      System.out.println(i); 
} 
}
public static void main(String[] args) throws IOException { 
      server serverr= new server(5000); 
} 
}