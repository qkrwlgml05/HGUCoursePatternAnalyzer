package edu.handong.analysis.datamodel;

public class Course {
	private String courseName;
	
	/**
	 * This method initialize courseName of a Course class instance.
	 * @param name
	 */
	public Course(String name) {
		courseName = name;
	}
	
	/**
	 * This method return courseName of a Course class instance.
	 * @return courseName
	 */
	public String getCourseName () {
		return courseName;
	}

}
