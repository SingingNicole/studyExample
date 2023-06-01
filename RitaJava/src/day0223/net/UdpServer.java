package day0223.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {

	@SuppressWarnings("resource")
	public void start() throws IOException { // start 메서드

		DatagramSocket socket = new DatagramSocket(7777); // 포트 7777번을 사용하는 소켓을 생성한다.
		DatagramPacket inPacket, outPacket;

		byte[] inMsg = new byte[10];
		byte[] outMsg;

		while (true) { // 종료되지 않고 클라이언트의 수신을 기다린다.
			inPacket = new DatagramPacket(inMsg, inMsg.length); // 데이터를 수신하기 위한 패킷을 생성한다.

			socket.receive(inPacket); // 패킷을 통해 데이터를 수신(receive)한다.
			// 해당 위치까지 실행한 후 클라이언트를 대기

			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			// 수신한 패킷으로부터 client(송신자)의 IP주소와 Port를 얻는다.

			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			// 서버의 현재 시간을 시분초 형태([hh:mm:ss])로 반환한다.
			outMsg = time.getBytes(); // time을 byte배열로 변환한다.

			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
			// 시간을 담을 수 있는 배열을 만든다.
			socket.send(outPacket); // 패킷을 생성해서 client에게 전송(send)한다.
		}

	} // start() end

	public static void main(String args[]) {
		try {
			new UdpServer().start(); // UDP서버를 실행시킨다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // main end

}