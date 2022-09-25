package in.nareshit.raghu.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("dsObj")
@ConfigurationProperties(prefix="my.db")
@Setter
@ToString
public class MyDataSource {

	private String driver;
	private String url;
}
