package classes;

import java.util.ArrayList;

public class University {

	private ArrayList<Faculty> faculties;

	private String name;


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

	public University(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param faculty
	 */
	public void addFaculty(Faculty faculty) {
		this.faculties.add(faculty);
	}

	/**
	 * 
	 * @param faculty
	 */
	public void removeFaculty(Faculty faculty) {
		for (int i = 0; i < this.faculties.size(); i++) {
			if(this.faculties.get(i).equalsTo(faculty)){
				this.faculties.remove(i);
				break;
			}
		}
	}

	public ArrayList<Faculty> getFaculties() {
		return this.faculties;
	}

	public void setFaculties(ArrayList<Faculty> faculties) {
		this.faculties = faculties;
	}

	public ArrayList<Staff> getEmployees() {
		ArrayList<Staff> staff = new ArrayList<Staff>();
		for(Faculty f : this.faculties){
			for(Institute i : f.getInstitutes()){
				staff.addAll(i.getResearchEmployees());
			}
		}
		return staff;
	}

}