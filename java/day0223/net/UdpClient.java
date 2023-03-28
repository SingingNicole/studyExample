package day0223.net;

import java.net.*;
import java.io.*;

public class UdpClient {

	public void start() throws IOException, UnknownHostException {
		DatagramSocket datagramSocket = new DatagramSocket();
		InetAddress serverAddress = InetAddress.getByName("192.168.0.2");
		// UDP는 InetAddress로 수행

		byte[] msg = new byte[100]; // 데이터가 저장될 공간으로 길이 100의 byte배열을 생성한다.

		DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777); // 해당 배열 중 길이 1을 지정하여 클라이언트 IP를 알려줌
		// 서버 아이피, 포트번호
		// 클라이언트에게 데이터를 보내는 용도, 송신용 패킷
		DatagramPacket inPacket = new DatagramPacket(msg, msg.length); // 수신용 데이터그램 패킷, 배열의 길이만큼 저장(수신)용 패킷

		datagramSocket.send(outPacket); // DatagramPacket을 전송한다.
		datagramSocket.receive(inPacket); // DatagramPacket을 수신하여 저장한다.

		System.out.println("current server time: " + new String(inPacket.getData())); // 수신된 byte 데이터를 문자열로 바꾸어 출력한다.

		datagramSocket.close();

	} // start() end

	public static void main(String args[]) {
		try {
			new UdpClient().start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main end(클라이언트 프로그램 종료)

}