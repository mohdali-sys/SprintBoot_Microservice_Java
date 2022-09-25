package in.nareshit;

public class DatabaseCon {

	private String driver;
	private String url;
	
	//source > Generate Constructor using Fields > Deselect All > Finish
	public DatabaseCon() {
		super();
		System.out.println("FROM CONSTR!");
	}

	//source > Generate getters/setters> Select All > Finish
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
		System.out.println("FROM SETTER");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	//source > Generate toString > Finish
	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + "]";
	}
	
	
}
