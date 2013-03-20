package network;

import java.io.DataOutputStream;
import java.net.Socket;

public class Requests {

	public static void sendRequestTo(String ip,  int port, String msg) throws Exception{
		Socket socket = new Socket(ip, port);
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		socket.close();
    }
	
	public static void sendRequestToPaxosLeader(String sender, int port, String msg) throws Exception{
		
	}
	
	public static void sendRequestToPaxosLeader(String sender, String msg) throws Exception{
		
	}
	
	public static void sendRequestTo2PCCohort(String sender, String msg) throws Exception{
		
	}
	
	
	
	public static void sendRequestToServer(String serverName, String msg) throws Exception{
		sendRequestTo(Agents.getIP(serverName),Agents.port,msg);
	}
	
	
	
	
}
