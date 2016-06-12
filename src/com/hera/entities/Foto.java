package com.hera.entities;

import java.io.File;

import android.graphics.Bitmap;


public class Foto {

	
	// caracteristicas tomadas del xml
	
	
	private File pathFoto;
	private Bitmap foto;
	private int posicionFotoX;
	private int posicionFotoy;
	
	  public Foto( int posicionFotoX, int posicionFotoy, File pathFoto, Bitmap foto) {
	       
	        this.posicionFotoX = posicionFotoX;
	        this.posicionFotoy = posicionFotoy;
	        this.pathFoto = pathFoto;
	        this.foto = foto;
	    }
	  
	public Foto(Bitmap foto){
		this.foto = foto;
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
