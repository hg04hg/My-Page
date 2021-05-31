package week4day01.ä��;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// ��Ʈ��ũ ���α׷���

// ���� �̿�(��ȭ��)
// 1:1 ä��  ������ Ŭ���̾�Ʈ�� ä��
// ���� ������
// Ŭ���̾�Ʈ : �ޱ�

public class Client {
	Socket s;
	DataInputStream dataIn;
	DataOutputStream dataOut;

	public Client() {

		// ������ ������ ��Ʈ�� ������ ��û
		try {
			s = new Socket("localhost", 5088); // ������ ������ ��Ʈ�� ����
			System.out.println("���ӿ�û");

			// ���
			dataIn = new DataInputStream(s.getInputStream()); // �޽����� ������ ��Ʈ��
			dataOut = new DataOutputStream(s.getOutputStream()); // �޽��� ���� �� �ִ� ��Ʈ��

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
		new Client();}}
