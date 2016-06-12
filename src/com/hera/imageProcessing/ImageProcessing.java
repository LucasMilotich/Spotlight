package com.hera.imageProcessing;

import java.io.File;

import android.media.Image;
import com.hera.entities.Foto;
import com.hera.entities.Tapa;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class ImageProcessing {

    private Tapa tapa;
    private Foto foto;
    private Bitmap tapaMerge;

    Canvas dibujador;

    public ImageProcessing(Foto foto, Tapa tapa) {
        this.foto = foto;
        this.tapa = tapa;
    }

    public ImageProcessing() {
        this.tapa = new Tapa();
        this.foto = new Foto();
    }

    public Tapa getTapa() {
        return tapa;
    }

    public void setTapa(Tapa tapa) {
        this.tapa = tapa;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Bitmap posicionarFoto(int x, int y) {
        return tapa.getTapa();
    }

    public Bitmap zoomFoto(int x, int y) {
        return tapa.getTapa();
    }


    public Bitmap mergeFoto() {

        this.tapaMerge = Bitmap.createBitmap(tapa.getTamanioTapaX(), tapa.getTamanioTapaY(), Bitmap.Config.ARGB_8888);

        foto.getFoto().setHeight(tapa.getTamanioTapaY());
        foto.getFoto().setWidth(tapa.getTamanioTapaX());

        dibujador = new Canvas(tapaMerge);

        dibujador.drawBitmap(tapa.getTapa(), 0, 0, null);

        dibujador.drawBitmap(foto.getFoto(), tapa.getPosicionFotoX(), tapa.getPosicionFotoY(), null);


        return tapaMerge;

    }


}
