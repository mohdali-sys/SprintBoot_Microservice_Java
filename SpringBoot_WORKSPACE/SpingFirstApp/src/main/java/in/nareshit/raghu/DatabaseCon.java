package in.nareshit.raghu;

public class DatabaseCon {

	private String driver;
	private String url;
	
	//set,get methods
	
	//Source >> Generate set/get methods > select All > Generate
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	// Generate toString method
	// Source > Generate toString > Generate
	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + "]";
	}
	
	
}
