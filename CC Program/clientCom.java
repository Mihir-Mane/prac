import java.net.*;
import java.io.*;
class clientCom{
	public static void main(String args[]){
		try{
			Socket s = new Socket("LocalHost",8000);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			DataInputStream inp = new DataInputStream(s.getInputStream());
			String msg;
			System.out.println("type STOP to end communication");
			System.out.print("Client: ");
			while((msg=br.readLine()) != null){
				out.writeBytes(msg+"\n");
				if(msg.equals("STOP"))
					break;
				System.out.println("Server: "+inp.readLine());
				System.out.println("Client: ");
			}
			br.close();
			s.close();
			inp.close();
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}