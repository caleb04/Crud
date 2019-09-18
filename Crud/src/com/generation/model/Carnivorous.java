package com.generation.model;

//import com.generation.model.Override;
//import com.generation.model.String;

public class Carnivorous {

	private int idCarnivorous;
	private String nameCrnivorous;
	private int edadCarnivorous;
	private String habitatCarnivorous;
	
	public Carnivorous() {}
	public Carnivorous(int idCarnivorous, String nameCrnivorous, int edadCarnivorous, String habitatCarnivorous) {
		super();
		this.idCarnivorous = idCarnivorous;
		this.nameCrnivorous = nameCrnivorous;
		this.edadCarnivorous = edadCarnivorous;
		this.habitatCarnivorous = habitatCarnivorous;
	}


	public int getIdCarnivorous() {
		return idCarnivorous;
	}


	public void setIdCarnivorous(int idCarnivorous) {
		this.idCarnivorous = idCarnivorous;
	}


	public String getNameCrnivorous() {
		return nameCrnivorous;
	}


	public void setNameCrnivorous(String nameCrnivorous) {
		this.nameCrnivorous = nameCrnivorous;
	}


	public int getEdadCarnivorous() {
		return edadCarnivorous;
	}


	public void setEdadCarnivorous(int edadCarnivorous) {
		this.edadCarnivorous = edadCarnivorous;
	}


	public String getHabitatCarnivorous() {
		return habitatCarnivorous;
	}


	public void setHabitatCarnivorous(String habitatCarnivorous) {
		this.habitatCarnivorous = habitatCarnivorous;
	}


	@Override
	public String toString() {
		return "Carnivorous [idCarnivorous=" + idCarnivorous + ", nameCrnivorous=" + nameCrnivorous
				+ ", edadCarnivorous=" + edadCarnivorous + ", habitatCarnivorous=" + habitatCarnivorous + "]";
	}
	
	
}
