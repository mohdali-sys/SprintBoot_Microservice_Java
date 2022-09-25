package in.nareshit.raghu;

public class MyResolver {

	private String prefix;
	private String suffix;
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	@Override
	public String toString() {
		return "MyResolver [prefix=" + prefix + ", suffix=" + suffix + "]";
	}
	
	
}
