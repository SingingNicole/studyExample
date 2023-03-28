package day0223.net;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx1 {

	public static void main(String[] args) {

		InetAddress ip = null;
		InetAddress[] ipArr = null;

		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName(): " + ip.getHostName());
			System.out.println("getHostAddress(): " + ip.getHostAddress());
			System.out.println("toString(): " + ip);

			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress(): " + Arrays.toString(ipAddr));

			String result = "";
			for (int i = 0; i < ipAddr.length; i++) {
				result += (ipAddr[i] < 0) ? ipAddr[i] + 256 : ipAddr[i];
				result += ".";
			}
			System.out.println("getAddress()+256: " + result);
			System.out.println();
			// ip의 값을 byte로 가져오면서 큰 수는 음수로 출력됨
			// 음수가 나왔을 때 256을 더하면 원래의 ip를 얻을 수 있다.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName(): " + ip.getHostName());
			System.out.println("getHostAddress(): " + ip.getHostAddress());
			System.out.println();
			// 로컬 호스트 컴퓨터의 이름과 ip주소를 가져 온다.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		try {
			ipArr = InetAddress.getAllByName("www.naver.com");

			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr[" + i + "]: " + ipArr[i]);
				// ip 주소를 표현하는 InetAddress.
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			InetAddress names[] = InetAddress.getAllByName("www.google.com");
			for (InetAddress addr : names) {
				if (addr instanceof Inet6Address) {
					Inet6Address v6 = (Inet6Address) addr;
					System.out.println("IPv6: " + v6);
				} else if (addr instanceof Inet4Address) {
					Inet4Address v4 = (Inet4Address) addr;
					System.out.println("IPv4: " + v4);
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	} // main

}