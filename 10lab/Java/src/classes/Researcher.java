package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Researcher extends Staff {

	private String fieldOfStudy;
	private Institute institute;

	private ArrayList<Project> projects;

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	/**
	 * 
	 * @param ssn
	 * @param name
	 * @param email
	 * @param fieldOfStudy
	 */
	public Researcher(int ssn, String name, String email, String fieldOfStudy) {
		super(ssn, name, email);
		this.fieldOfStudy = fieldOfStudy;
	}

	/**
	 * 
	 * @param project
	 */
	public void addProject(Project project) {
		projects.add(project);
	}

	/**
	 * 
	 * @param project
	 */
	public void removeProject(Project project) {
		for (int i = 0; i < this.projects.size(); i++) {
			if(this.projects.get(i).equalsTo(project)){
				this.projects.remove(i);
				break;
			}
		}
	}

	public List<Project> getProjects() {
		return this.projects;
	}

	public String getFieldOfStudy() {
		return this.fieldOfStudy;
	}

	/**
	 * 
	 * @param fieldOfStudy
	 */
	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	/**
	 *
	 * @param researcher
	 */
	public Boolean equalsTo(Researcher researcher){
		return Objects.equals(this.getName(), researcher.getName());
	}

}