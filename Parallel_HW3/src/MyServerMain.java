import java.io.*;
import java.net.*;
public class MyServerMain {
  //This class is complete. DO NOT change it.
  public static void main(String[] args) {
    int ip = 16790;
    for(int i = 0; i < 10; i++)
      new MyServer(ip++).start();
  }
}


class MyServer extends Thread {
	int port; 
	MyServer (int port)
	{
		this.port=port;
	}
	public void run() {
		try
		{
			ServerSocket ss = new ServerSocket(port);
			Socket socket=ss.accept();
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			String received = dis.readUTF();
			int num = Integer.parseInt(received)+2;
			dos.writeUTF(Integer.toString(num));
			socket.close();
			dis.close();
			ss.close();
			
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
}





