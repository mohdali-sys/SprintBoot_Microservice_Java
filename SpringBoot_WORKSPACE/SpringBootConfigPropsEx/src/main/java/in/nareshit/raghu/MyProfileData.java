package in.nareshit.raghu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("mypob")
@ConfigurationProperties(prefix = "my.app")
public class MyProfileData {
	
	private Integer pid;
	private String pcode;
	private String model;
	private Double version;
	private String format;
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Double getVersion() {
		return version;
	}
	public void setVersion(Double version) {
		this.version = version;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	@Override
	public String toString() {
		return "MyProfileData [pid=" + pid + ", pcode=" + pcode + ", model=" + model + ", version=" + version
				+ ", format=" + format + "]";
	}
	
	
}
