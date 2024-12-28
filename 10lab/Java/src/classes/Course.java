package classes;

public class Course {

	private int id;
	private String name;
	private int weeklyDuration;

	/**
	 * 
	 * @param id
	 * @param name
	 * @param weeklyDuration
	 */
	public Course(int id, String name, int weeklyDuration) {
		this.id = id;
		this.name = name;
		this.weeklyDuration = weeklyDuration;
	}

	public int getId() {
		return this.id;
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

	public int getWeeklyDuration() {
		return this.weeklyDuration;
	}

	/**
	 * 
	 * @param weeklyDuration
	 */
	public void setWeeklyDuration(int weeklyDuration) {
		this.weeklyDuration = weeklyDuration;
	}

}