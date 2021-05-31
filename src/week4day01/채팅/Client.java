package week4day01.채팅;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// 네트워크 프로그래밍

// 소켓 이용(전화기)
// 1:1 채팅  서버와 클라이언트가 채팅
// 서버 보내기
// 클라이언트 : 받기

public class Client {
	Socket s;
	DataInputStream dataIn;
	DataOutputStream dataOut;

	public Client() {

		// 서버에 지정된 포트로 연결을 요청
		try {
			s = new Socket("localhost", 5088); // 서버의 지정된 포트로 연결
			System.out.println("접속요청");

			// 통신
			dataIn = new DataInputStream(s.getInputStream()); // 메시지가 들어오는 스트림
			dataOut = new DataOutputStream(s.getOutputStream()); // 메시지 보낼 수 있는 스트림

		} catch (IOException e) {
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
		new Client();}}
