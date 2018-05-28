package main.java;

import java.util.Collection;

import main.interfaces.Instrument;

public class Band {
private String BandName;
private Instrument g1;
private Collection<book> book;
private Collection<String> bookname;


public Collection<String> getBookname() {
	return bookname;
}
public void setBookname(Collection<String> bookname) {
	this.bookname = bookname;
}
public Collection<book> getBook() {
	return book;
}
public void setBook(Collection<book> book) {
	this.book = book;
}

public Band(){
	
}
public void setBandName(String bandName) {
	BandName = bandName;
}
public void setInst(Instrument g1) {
	this.g1 = g1;
}
void SingSong()
{
	g1.play();
}
}
