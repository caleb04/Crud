package com.crudpractica.model;

public class Carnivorous {
	private int idCarnivorous;
	private String nameCarnivorous;
	private int edadCarnivorous;
	private String habitatCarnivorous;
	
	public Carnivorous()
	{
	}
	public Carnivorous(int idCarnivorous, String nameCarnivorous, int edadCarnivorous, String habitatCarnivorous) {
		super();
		this.idCarnivorous = idCarnivorous;
		this.nameCarnivorous = nameCarnivorous;
		this.edadCarnivorous = edadCarnivorous;
		this.habitatCarnivorous = habitatCarnivorous;
	}
	public int getIdCarnivorous() {
		return idCarnivorous;
	}
	public void setIdCarnivorous(int idCarnivorous) {
		this.idCarnivorous = idCarnivorous;
	}
	public String getNameCarnivorous() {
		return nameCarnivorous;
	}
	public void setNameCarnivorous(String nameCarnivorous) {
		this.nameCarnivorous = nameCarnivorous;
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
		return "Carnivorous [idCarnivorous=" + idCarnivorous + ", nameCarnivorous=" + nameCarnivorous
				+ ", edadCarnivorous=" + edadCarnivorous + ", habitatCarnivorous=" + habitatCarnivorous + "]";
	}
	
	
}
