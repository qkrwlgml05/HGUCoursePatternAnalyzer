package edu.handong.analysis.datamodel;

public class Student {
	private String name;

	/**
	 * This method initialize name of a Student class instance.
	 * @param name
	 */
	public Student (String name) {
		this.name = name;
	}
	
	/**
	 * This method return name of a Student class instance.
	 * @return name
	 */
	public String getName () {
		return name;
	}

}