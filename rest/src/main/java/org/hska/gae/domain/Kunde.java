package org.hska.gae.domain;

public class Kunde {

	
	private int id;
	
	private String vorname;
	
	private String nachname;
	
	private Adresse adresse;
	
	
	public Kunde () {}
	
	public Kunde (int id, String vorname, String nachname, Adresse adresse) {
		this.id = id;
		this.vorname = vorname;
		this.nachname = nachname;
		this.setAdresse(adresse);
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
}
