import java.net.*;
import java.io.*;
class clientPrime{
    public static void main(String args[]){
		try{
			Socket ss = new Socket("LocalHost",8001);
			BufferedReader infu = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a Number: ");
			int a = Integer.parseInt(infu.readLine());
			DataOutputStream out = new DataOutputStream(ss.getOutputStream());
			out.writeInt(a);
			DataInputStream in = new DataInputStream(ss.getInputStream());
			System.out.println(in.readUTF());
			ss.close();
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}