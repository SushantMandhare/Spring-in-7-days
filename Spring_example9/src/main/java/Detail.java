package main.java;

import java.util.Map;

public class Detail {

	private Map<Employee,Project> det;

	public Map<Employee, Project> getDet() {
		return det;
	}

	public void setDet(Map<Employee, Project> det) {
		this.det = det;
	} 
	public void DisplayInfo()
	{
		System.out.println("det "+det.toString());	
	}
}
