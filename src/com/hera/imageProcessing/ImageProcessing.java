package com.hera.imageProcessing;

import java.io.File;

import android.media.Image;
import com.hera.entities.Foto;
import com.hera.entities.Tapa;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class ImageProcessing {


	private Tapa tapa;
	private Foto foto;
	private Bitmap tapaMerge;
	
	Canvas dibujador;
	
	public ImageProcessing(Foto foto, Tapa tapa){
		this.foto = foto;
		this.tapa = tapa;
	}
	public Bitmap posicionarFoto(int x, int y){
		
		Bitmap tapa = null;
		
		
		
		return tapa;
		
	}
	
	public Bitmap zoomFoto(int width, int height){
		
		Bitmap tapa = null;
		
		
		
		return tapa;
		
		
	}
	
	
	
	public Bitmap mergeFoto(){
		
		
		this.tapaMerge =  Bitmap.createBitmap(tapa.getTamanioTapaX(),tapa.getTamanioTapaY(),Bitmap.Config.ARGB_8888);
		this.tapaMerge = this.tapaMerge.copy(Config.ARGB_8888, true);
		
		this.foto.setFoto(this.foto.getFoto().copy(Config.ARGB_8888, true));
		
		foto.getFoto().setHeight(tapa.getTamanioTapaY());
		foto.getFoto().setWidth(tapa.getTamanioTapaX());
		
		dibujador = new Canvas(tapaMerge);
		
		dibujador.drawBitmap(tapa.getTapa(), 0,0, null);
		
		dibujador.drawBitmap(foto.getFoto(), tapa.getPosicionFotoX(),tapa.getPosicionFotoY(), null);
		
		
		
		return tapaMerge;
		
	}
}
	
	
	
	