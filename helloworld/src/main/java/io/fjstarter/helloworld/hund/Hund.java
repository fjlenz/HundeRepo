package io.fjstarter.helloworld.hund;


public class Hund {

	private String id;
	private String farbe;
	private String name;
	
	public Hund() {
	}
	
	public Hund(String id, String farbe, String name) {
		super();
		this.id = id;
		this.farbe = farbe;
		this.name = name;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
