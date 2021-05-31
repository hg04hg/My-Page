package week4day01.채팅;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	ServerSocket ss; // 서버용 소켓 (서버가 되기 위한 소켓)
	Socket s; // 통신을 하기 위한 소켓

	DataInputStream dataIn;
	DataOutputStream dataOut;

	public Server() {
		try {
			ss = new ServerSocket(5088); // 포트번호 5000~6000
			System.out.println("서버 준비");
			// 서버형 소켓이 생성되면 대기상태로 빠짐
			s = ss.accept(); // 서버에게 요청한 상대와 통신할 수 있는 소켓을 생성
			System.out.println("클라이언트 소켓 생성");

			// 통신
			dataIn = new DataInputStream(s.getInputStream()); // 메시지가 들어오는 스트림
			dataOut = new DataOutputStream(s.getOutputStream()); // 메시지 보낼 수 있는 스트림

		} catch (IOException e) {
			e.printStackTrace();
		}
		dataSend();
		dataRecv();
	}

	public void dataRecv() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					String data = "";
					while (true) {
						data = dataIn.readUTF();
						System.out.println(data);
					}
				} catch (IOException e) {
					System.out.println("나감");
				}
			}
		}).start();
	}

	public void dataSend() {
		Scanner sc = new Scanner(System.in);

		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					while (true) {
						String sendData = sc.nextLine();
						dataOut.writeUTF(sendData);
					}
				} catch (Exception e) {
					System.out.println("나감");
				}

			}

		}).start();
	}

	public static void main(String[] args) {
		new Server();}}
