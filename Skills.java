package employeManagmentSystem;

public class Skills {
	private String sk1;
	private String sk2;
	private String sk3;
	public Skills(String sk1, String sk2, String sk3) {
		super();
		this.sk1 = sk1;
		this.sk2 = sk2;
		this.sk3 = sk3;
	}
	public String getSk1() {
		return sk1;
	}
	public void setSk1(String sk1) {
		this.sk1 = sk1;
	}
	public String getSk2() {
		return sk2;
	}
	public void setSk2(String sk2) {
		this.sk2 = sk2;
	}
	public String getSk3() {
		return sk3;
	}
	public void setSk3(String sk3) {
		this.sk3 = sk3;
	}
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Skills [sk1=" + sk1 + ", sk2=" + sk2 + ", sk3=" + sk3 + "]";
	}
	
	

}
