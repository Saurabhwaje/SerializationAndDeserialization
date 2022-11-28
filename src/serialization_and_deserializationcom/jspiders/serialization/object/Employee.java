package serialization_and_deserializationcom.jspiders.serialization.object;

public class Employee {
	private int eId;
	private String eName;
	private String eDept;

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int geteId() {
		return this.eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteDept() {
		return eDept;
	}

	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
}
