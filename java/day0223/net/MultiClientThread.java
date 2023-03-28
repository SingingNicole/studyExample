package day0223.net;

public class MultiClientThread extends Thread {
	private MultiClient mc;

	public MultiClientThread(MultiClient mc) {
		this.mc = mc;
	}

	@Override
	public void run() {
		String message = null;
		String[] receivedMsg = null;
		// 받아 올 메시지의 공간
		boolean isStop = false; // 메시지 올 때까지 반복
		while (!isStop) {
			try {
				message = (String) mc.getOis().readObject();
				receivedMsg = message.split("#"); // 메시지 저장, split
				// 서버에서 넘어 온 메시지를 # 기준으로 split
				// 콘솔창에 출력
			} catch (Exception e) {
				e.printStackTrace();
				isStop = true; // 메시지에 문제가 있을 경우 중단
			}
			System.out.println(receivedMsg[0] + ", " + receivedMsg[1]);
			if (receivedMsg[1].equals("exit")) { // 첫 번째 메시지가 exit이라면
				if (receivedMsg[0].equals(mc.getId())) {
					mc.exit();
					// 내가 보낸 메시지라면 시스템 종료.
				} else {
					mc.getJta().append(receivedMsg[0] + "님이 종료 하셨습니다." + System.getProperty("line.separator"));
					// 다른 사람이 종료했다면 누가 종료했는지 id와 종료 문자 출력
					mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
					// 문장의 끝을 인식, 다음 줄부터 출력
				}
			} else {
				mc.getJta().append(receivedMsg[0] + ": " + receivedMsg[1] + System.getProperty("line.separator"));
				mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
				// 텍스트 창에 있는 텍스트의 길이를 확인하고 가장 마지막 위치에 커서가 위치할 수 있도록 다시 세팅하는 메서드
			}
		}
	}

}