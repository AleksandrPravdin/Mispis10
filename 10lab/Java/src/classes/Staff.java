package classes;

public class Staff {

	private int ssn;
	private String name;
	private String email;
	private int staffNum;

	/**
	 * 
	 * @param ssn
	 * @param name
	 * @param email
	 */
	public Staff(int ssn, String name, String email) {
		this.ssn = ssn;
		this.name = name;
		this.email = email;
	}

	public int getSsn() {
		return this.ssn;
	}

	/**
	 * 
	 * @param ssn
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}