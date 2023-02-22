package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// UDP용 소켓
		DatagramSocket socket = new DatagramSocket();

		// UDP패킷 (데이터+데이터크기+ip+port)
		String s = "This is sentence";
		byte[] data = s.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 9100);
		// 소켓을 이용해서 패킷 전송
		socket.send(packet);
		socket.close();

	}

}
