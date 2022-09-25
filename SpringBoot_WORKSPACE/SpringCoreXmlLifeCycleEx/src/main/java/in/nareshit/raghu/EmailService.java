package in.nareshit.raghu;

public class EmailService {

	private String host;
	private int port;
	
	public EmailService() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
		System.out.println("FROM SETTER METHOD");
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "EmailService [host=" + host + ", port=" + port + "]";
	}
	
	public void setup() {
		System.out.println("FROM INIT METHOD");
	}
	
	public void clear() {
		System.out.println("FROM DESTORY METHOD");
	}
	
	
}
