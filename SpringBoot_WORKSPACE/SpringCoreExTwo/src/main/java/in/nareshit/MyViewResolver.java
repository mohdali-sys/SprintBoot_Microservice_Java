package in.nareshit;

public class MyViewResolver {

	private int id;
	private String prefix;
	private String suffix;
	
	public MyViewResolver() {
		super();
	}
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "MyViewResolver [id=" + id + ", prefix=" + prefix + ", suffix=" + suffix + "]";
	}
	
	
	
}
