package week4day01.ä��;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	ServerSocket ss; // ������ ���� (������ �Ǳ� ���� ����)
	Socket s; // ����� �ϱ� ���� ����

	DataInputStream dataIn;
	DataOutputStream dataOut;

	public Server() {
		try {
			ss = new ServerSocket(5088); // ��Ʈ��ȣ 5000~6000
			System.out.println("���� �غ�");
			// ������ ������ �����Ǹ� �����·� ����
			s = ss.accept(); // �������� ��û�� ���� ����� �� �ִ� ������ ����
			System.out.println("Ŭ���̾�Ʈ ���� ����");

			// ���
			dataIn = new DataInputStream(s.getInputStream()); // �޽����� ������ ��Ʈ��
			dataOut = new DataOutputStream(s.getOutputStream()); // �޽��� ���� �� �ִ� ��Ʈ��

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
					System.out.println("����");
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
					System.out.println("����");
				}

			}

		}).start();
	}

	public static void main(String[] args) {
		new Server();}}
