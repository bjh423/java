package 네트워크프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저A extends JFrame {

	DatagramSocket socket;
	JTextArea list; // 채팅내역
	JTextField input; // 입력내역

	public 메신저A() {
		setTitle("메신저A");
		setSize(500, 500);
		try {
			socket = new DatagramSocket(7777);
		} catch (SocketException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		list = new JTextArea();
		input = new JTextField();

		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);

		Font font = new Font("굴림", 1, 30);
		list.setFont(font);
		input.setFont(font);
		list.setBackground(Color.white);
		list.setForeground(Color.black);
		input.setBackground(Color.black);
		input.setForeground(Color.white);
		list.setEditable(false);

		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// UDP용 소켓
				try {
					String s = input.getText();
					DatagramSocket socket = new DatagramSocket();

					// UDP패킷 (데이터+데이터크기+ip+port)
					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5555);
					// 소켓을 이용해서 패킷 전송
					list.append("나>> " + s + "\n");
					input.setText("");
					socket.send(packet);
					socket.close();
				} catch (SocketException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		setVisible(true);

	}

	// 받는 부분을 먼저 실행
	public void process() {
		while (true) {
			try {
				System.out.println("수신 대기중...");
				
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				
				socket.receive(packet);
				list.append("상대 : " + new String(data) + "\n");
			} catch (Exception e) {
				System.out.println("연결 실패");
			}
		}

	}

	public static void main(String[] args) {
		메신저A name = new 메신저A();
		name.process();

	}

}
