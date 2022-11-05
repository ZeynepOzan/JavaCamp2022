package core.logging;

public class MaillLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println(data + " Mail gönderildi ");

	}
}
