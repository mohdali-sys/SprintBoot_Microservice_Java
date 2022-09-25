package in.nareshit.raghu;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmailService implements InitializingBean, DisposableBean {

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
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("FROM INIT-METHOD(JAVA BASED)");
	}
	
	public void destroy() throws Exception {
		System.out.println("FROM DESTORY-METHOD(JAVA BASED)");
	}
	
}
