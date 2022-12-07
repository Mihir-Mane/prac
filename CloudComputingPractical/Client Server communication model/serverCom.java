import java.net.*;
import java.io.*;
class serverCom{
	public static void main(String args[]){
		try{
			ServerSocket ss = new ServerSocket(8000);
			System.out.println("Server Started.");
			System.out.println("Waiting For Client.....");
			Socket s = ss.accept();
			System.out.println("Client Accepted!");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataInputStream inp = new DataInputStream(s.getInputStream());
			DataOutputStream out = new DataOutputStream(s.getOutputStream());
			String receive, send;
			while((receive=inp.readLine()) != null){
				if(receive.equals("STOP"))
					break;
				System.out.println("Client: "+receive);
				System.out.println("Server: ");
				send=br.readLine();
				out.writeBytes(send+"\n");
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