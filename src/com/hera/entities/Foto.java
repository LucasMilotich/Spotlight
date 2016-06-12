package com.hera.entities;

import java.io.File;

import android.graphics.Bitmap;



public class Foto {
	
	// caracteristicas tomadas del xml
	private int tamanioFotoX;
	private int tamanioFotoY;
	
	private File pathFoto;
	private Bitmap foto;
	private int posicionFotoX;
	private int posicionFotoy;
	
	  public Foto(int tamanioFotoX, int tamanioFotoY, int posicionFotoX, int posicionFotoy, File pathFoto, Bitmap foto) {
	        this.tamanioFotoX = tamanioFotoX;
	        this.tamanioFotoY = tamanioFotoY;
	        this.posicionFotoX = posicionFotoX;
	        this.posicionFotoy = posicionFotoy;
	        this.pathFoto = pathFoto;
	        this.foto = foto;
	    }
	  
	public Foto(Bitmap foto){
		this.foto = foto;
	}
	public int getTamanioFotoX() {
		return tamanioFotoX;
	}
	public void setTamanioFotoX(int tamanioFotoX) {
		this.tamanioFotoX = tamanioFotoX;
	}
	public int getTamanioFotoY() {
		return tamanioFotoY;
	}
	public void setTamanioFotoY(int tamanioFotoY) {
		this.tamanioFotoY = tamanioFotoY;
	}

	public File getPathFoto() {
		return pathFoto;
	}
	public void setPathFoto(File pathFoto) {
		this.pathFoto = pathFoto;
	}
	
	
	public Bitmap getFoto() {
		return foto;
	}
	public void setFoto(Bitmap foto) {
		this.foto = foto;
	}
	
	
}
