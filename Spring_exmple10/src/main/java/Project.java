package main.java;

import org.springframework.beans.factory.annotation.Autowired;

public class Project {
	private String projectName;

	public Project()
	{
		
	}
	public Project(String projectName)
	{
		this.projectName=projectName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String toString()
	{
		return projectName;
	}
	

}
