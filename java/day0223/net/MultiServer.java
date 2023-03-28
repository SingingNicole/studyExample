package day0223.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiServer {
	private ArrayList<MultiServerThread> list; // Thread만 담을 수 있는 리스트 선언
	private Socket socket; // 멀티서버 스레드에 저장될 소켓

	public MultiServer() throws IOException {
		list = new ArrayList<MultiServerThread>();
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(3333);
		MultiServerThread mst = null;
		boolean isStop = false;

		while (!isStop) {
			System.out.println("Server ready...");
			socket = serverSocket.accept();
			mst = new MultiServerThread(this);
			list.add(mst); // 리스트에 Thread를 추가시킨다
			Thread t = new Thread(mst);
			t.start(); // 스레드 객체 생성, Runnable 실행
			// 클라이언트가 접속할 때마다 각각의 스레드를 형성하여 대기, run 수행
		}

	}

	public ArrayList<MultiServerThread> getList() {
		return list;
	}

	public Socket getSocket() {
		return socket;
	}

	public static void main(String[] args) throws IOException {
		new MultiServer();
	}

}
