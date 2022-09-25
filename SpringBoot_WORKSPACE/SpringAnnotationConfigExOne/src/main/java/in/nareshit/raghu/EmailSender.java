package in.nareshit.raghu;
import org.springframework.beans.factory.annotation.Value;
//ctrl+shift+O (imports)
import org.springframework.stereotype.Component;

//1. Spring Bean + 2. Spring Annotation Configuration 
//@Component("esObj")
@Component
public class EmailSender {
	
	@Value("gmail")
	private String host;
	@Value("587")
	private String port;
	
	// Source Menu > Generate toString > Generate Button
	@Override
	public String toString() {
		return "EmailSender [host=" + host + ", port=" + port + "]";
	}
	
}
