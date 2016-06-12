package com.hera.imageProcessing;

import java.io.File;

import com.hera.entities.Foto;
import com.hera.entities.Tapa;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class ImageProcessing {

	private Tapa tapa;
	private Foto foto;
	private Bitmap tapaMerge;
	
	Canvas dibujador;
	
	
	public Bitmap posicionarFoto(int x, int y){
		
		Bitmap tapa = null;
		
		
		
		return tapa;
		
	}
	
	public Bitmap zoomFoto(int x, int y){
		
		Bitmap tapa = null;
		
		
		
		return tapa;
		
		
	}
	
	
	
	public Bitmap mergeFoto(Tapa tapa, Foto foto){
		
		this.tapaMerge =  Bitmap.createBitmap(tapa.getTamanioTapaX(),tapa.getTamanioTapaY(),Bitmap.Config.ARGB_8888);
		
		foto.getFoto().setHeight(tapa.getTamanioTapaY());
		foto.getFoto().setWidth(tapa.getTamanioTapaX());
		
		dibujador = new Canvas(tapaMerge);
		
		dibujador.drawBitmap(tapa.getTapa(), 0,0, null);
		
		dibujador.drawBitmap(foto.getFoto(), tapa.getPosicionFotoX(),tapa.getPosicionFotoY(), null);
		
		
		
		return tapaMerge;
		
	}
	
	
	
	
	
	
	
}
