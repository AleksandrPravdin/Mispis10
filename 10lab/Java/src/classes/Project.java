package classes;

import java.util.Objects;

public class Project {

	private String name;
	private int hours;
	private int startingDate;
	private int endingDate;

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

	public int getStartingDate() {
		return this.startingDate;
	}

	/**
	 * 
	 * @param startingDate
	 */
	public void setStartingDate(int startingDate) {
		this.startingDate = startingDate;
	}

	public int getEndingDate() {
		return this.endingDate;
	}

	/**
	 * 
	 * @param endingDate
	 */
	public void setEndingDate(int endingDate) {
		this.endingDate = endingDate;
	}

	/**
	 * 
	 * @param name
	 * @param hours
	 * @param startingDate
	 * @param endingDate
	 */
	public Project(String name, int hours, int startingDate, int endingDate) {
		this.name = name;
		this.hours = hours;
		this.startingDate = startingDate;
		this.endingDate = endingDate;
	}

	/**
	 *
	 * @param project
	 */
	public Boolean equalsTo(Project project) {
		return Objects.equals(this.name, project.name);
	}

}