import java.io.*;
import java.net.*;

public class MyClientMain {
  //This class is complete. DO NOT change it.
  public static void main(String[] args) {
    int ip = 16790;
    System.out.println("Enter 10 integers");
    for(int i = 0; i < 10; i++)
	new MyClient(ip++).start();
  }
}     

class MyClient extends Thread  {

	int port;
	MyClient(int port){
		this.port=port;
	}
	
	public void run() {
		int n;
		try {
			BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
			n=Integer.parseInt(buf.readLine());
			InetAddress ip = InetAddress.getByName("localhost");
			Socket s = new Socket(ip,port);
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF(Integer.toString(n));
			System.out.print(n);
			System.out.print(" + 2=");
			System.out.println(dis.readUTF());
			
			s.close();
			dis.close();
			dos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
