package main.java;

import java.util.HashMap;
import java.util.Map;

public class Detail {

	private Map<Employee,Project> det = new HashMap<Employee, Project>();
	
	public Detail()
	{
		
	}
	public Detail(Employee e,Project p)
	{
		if(det !=null)
		{
			det.put(e, p);
		}
		else
		{
			System.out.println("NUll Value");
		}
	}
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
