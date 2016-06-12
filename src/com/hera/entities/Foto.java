package com.hera.entities;

import java.io.File;

public class Foto {

	private int tamanioFotoX;
	private int tamanioFotoY;
	private int posicionFotoX;
	private int posicionFotoy;
	private File pathFoto;
	
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
	public int getPosicionFotoX() {
		return posicionFotoX;
	}
	public void setPosicionFotoX(int posicionFotoX) {
		this.posicionFotoX = posicionFotoX;
	}
	public int getPosicionFotoy() {
		return posicionFotoy;
	}
	public void setPosicionFotoy(int posicionFotoy) {
		this.posicionFotoy = posicionFotoy;
	}
	public File getPathFoto() {
		return pathFoto;
	}
	public void setPathFoto(File pathFoto) {
		this.pathFoto = pathFoto;
	}
	
	
}
