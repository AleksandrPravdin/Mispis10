package classes;


import java.util.ArrayList;
import java.util.Objects;

public class Faculty {



	private ArrayList<Institute> institutes;
	private String name;
	private Staff dean;

	public void setInstitutes(ArrayList<Institute> institutes) {
		this.institutes = institutes;
	}
	/**
	 * 
	 * @param name
	 * @param dean
	 */
	public Faculty(String name, Staff dean) {
		this.name = name;
		this.dean = dean;
	}

	/**
	 * 
	 * @param institute
	 */
	public void addInstitute(Institute institute) {
		this.institutes.add(institute);
	}

	/**
	 * 
	 * @param institute
	 */
	public void removeInstitute(Institute institute) {
		for (int i = 0; i < this.institutes.size(); i++) {
			if(this.institutes.get(i).equalsTo(institute)){
				this.institutes.remove(i);
				break;
			}
		}
	}

	public ArrayList<Institute> getInstitutes() {
		return this.institutes;
	}

	public Staff getDean() {
		return this.dean;
	}

	/**
	 * 
	 * @param dean
	 */
	public void setDean(Staff dean) {
		this.dean = dean;
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
	 * @param faculty
	 */
	public Boolean equalsTo(Faculty faculty) {
		return Objects.equals(this.name, faculty.name);
	}

}