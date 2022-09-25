package in.nareshit.raghu;

public class SecurityMode {

	private String mode;
	private int roleId;
	private String access;
	
	//Source > Generate Constructor > Select All > Generate
	public SecurityMode(String mode, int roleId, String access) {
		super();
		this.mode = mode;
		this.roleId = roleId;
		this.access = access;
		System.out.println("FROM PARAM CONST.");
	}

	@Override
	public String toString() {
		return "SecurityMode [mode=" + mode + ", roleId=" + roleId + ", access=" + access + "]";
	}
	
	
}
