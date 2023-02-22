package 네트워크프로그램;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// 승인용 소켓
		// 서버 생존용 무한루프
		// 요청이 있으면 승인, 통신용 소켓 제작
		ServerSocket server = new ServerSocket(9100);
		System.out.println("승인용 서버 소켓 시작");
		System.out.println("연결 대기중");
		int count = 0;
		while (true) {
			Socket socket = server.accept();//소켓
			System.out.println(count++ + ">> 승인완료! 소켓생성됨");
		}
	}

}
