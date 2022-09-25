package com.springioc.beans;

public class ClientRepository {

	private String dataSource;
	
	private String repName;

	public String getRepName() {
		return repName;
	}



	public void setRepName(String repName) {
		this.repName = repName;
	}



	public String getDataSource() {
		return dataSource;
	}
	
	

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
}
