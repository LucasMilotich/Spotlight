package com.hera.entities;

import java.io.File;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public class Tapa {

	
	private String nombreTapa;
	
	private int tamanioTapaX;
	private int tamanioTapaY;

	// posicion en donde va la foto
	private int posicionFotoX;
	private int posicionFotoY;
	private int tamanioFotoX;
	private int tamanioFotoY;
	// texto
	private String fuente;
	private String tamanio;

	private String categoria;
	private String pais;
	
	private Bitmap tapa;
	private File pathTapa;
	// tapa finalizada
	private Bitmap mergeTapa;
	  public Tapa(int tamanioTapaX, int tamanioTapaY,int tamanioFotoX, int tamanioFotoY, Bitmap tapa) {
	        this.tamanioTapaX = tamanioTapaX;
	        this.tamanioTapaY = tamanioTapaY;
	        this.tamanioFotoX = tamanioFotoX;
	        this.tamanioFotoY = tamanioFotoY;
	        this.tapa = tapa;
	    }

	    public Tapa() {

	    }
	
	public int getPosicionFotoX() {
		return posicionFotoX;
	}
	public void setPosicionFotoX(int posicionFotoX) {
		this.posicionFotoX = posicionFotoX;
	}
	
	public String getNombreTapa() {
		return nombreTapa;
	}
	public void setNombreTapa(String nombreTapa) {
		this.nombreTapa = nombreTapa;
	}
	public int getTamanioTapaX() {
		return tamanioTapaX;
	}
	public void setTamanioTapaX(int tamanioTapaX) {
		this.tamanioTapaX = tamanioTapaX;
	}
	public int getTamanioTapaY() {
		return tamanioTapaY;
	}
	public void setTamanioTapaY(int tamanioTapaY) {
		this.tamanioTapaY = tamanioTapaY;
	}	
	public int getPosicionFotoY() {
		return posicionFotoY;
	}
	public void setPosicionFotoY(int posicionFotoY) {
		this.posicionFotoY = posicionFotoY;
	}
	public String getFuente() {
		return fuente;
	}
	public void setFuente(String fuente) {
		this.fuente = fuente;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public File getPathTapa() {
		return pathTapa;
	}
	public void setPathTapa(File pathTapa) {
		this.pathTapa = pathTapa;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	public Bitmap getTapa() {
		return tapa;
	}
	public void setTapa(Bitmap tapa) {
		this.tapa = tapa;
	}
	public Bitmap getMergeTapa() {
		return mergeTapa;
	}
	public void setMergeTapa(Bitmap mergeTapa) {
		this.mergeTapa = mergeTapa;
	}
	
}
