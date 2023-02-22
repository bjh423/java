package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// 수신용 소켓 필요 (port)
		// 패킷을 받기위해 빈 패킷 정의, 그 안에 byte[] 넣어두기
		// 받아서 패킷에 넣음
		// 받은걸 String으로 변환

		DatagramSocket socket = new DatagramSocket(9100);
		System.out.println("수신 대기중...");

		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		socket.receive(packet);

		System.out.println("받은 데이터 : " + new String(data));
		socket.close();

	}

}
