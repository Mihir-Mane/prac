import java.net.*; 
import java.io.*; 
 
public class client 
{ 
 
Socket socket; 
DataInputStream input; 
DataOutputStream out; 
 
public client(String address, int port) throws IOException 
{     
try     
{       
socket = new Socket(address, port); 
System.out.println("connected"); 
 
       input = new DataInputStream(System.in);        
out= new DataOutputStream(socket.getOutputStream()); 
 
       String line = ""; 
 
       while(!line.equals("bye"))       
{             
line = input.readLine(); 
out.writeUTF(line); 
 
      } 
input.close(); 
socket.close(); 
out.close(); }    
catch(IOException i)
{ 
System.out.println(i);    
} 
} 
public static void main(String args[]) throws IOException
{ 
client clientt = new client("127.0.0.1",5000); 
} 
}