package classes;

import java.util.ArrayList;
import java.util.Objects;

public class Institute {

	private String address;
	private ArrayList<Researcher> researchers;
	private String name;

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setResearchers(ArrayList<Researcher> researchers) {
		this.researchers = researchers;
	}

	/**
	 * 
	 * @param name
	 * @param address
	 */
	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	/**
	 * 
	 * @param employee
	 */
	public void addResearchEmployee(Researcher employee) {
		this.researchers.add(employee);
	}

	/**
	 * 
	 * @param employee
	 */
	public void removeResearchEmployee(Researcher employee) {
		for (int i = 0; i < this.researchers.size(); i++) {
			if(this.researchers.get(i).equalsTo(employee)){
				this.researchers.remove(i);
				break;
			}
		}
	}

	public ArrayList<Researcher> getResearchEmployees() {
		return this.researchers;
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

	/**
	 *
	 * @param institute
	 */
	public Boolean equalsTo(Institute institute) {
		return Objects.equals(this.name, institute.name);
	}
}