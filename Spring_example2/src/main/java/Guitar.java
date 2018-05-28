package main.java;

import main.interfaces.Instrument;

public class Guitar implements Instrument{
	public Guitar(){
		
	}
	public String play()
	{
		System.out.println("Guitar Play");
		return "Guitar Play";
	}

}
