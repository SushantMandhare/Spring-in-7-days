package main.java;
import main.interfaces.Instrument;
public class Violin implements Instrument{
	public Violin(){
		
	}
	public String play()
	{
		System.out.println("Violin Play");
		return "Violin Play";
	}
}
