package com.hera;

import com.sun.prism.*;
import com.sun.prism.Image;


import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file = new File("/Users/lucasmilotich/Desktop/imagen.jpg");
        File file2 = new File("/Users/lucasmilotich/Desktop/imagen2.jpg");

        BufferedImage img1 = null;
        BufferedImage img2 = null;

        File outputfile = new File("/Users/lucasmilotich/Desktop/saved.png");


        BufferedImage combined;

        try {
            img1 = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            img2 = ImageIO.read(file2);
        } catch (IOException e) {
            e.printStackTrace();
        }


        int w = Math.max(img1.getWidth(), img2.getWidth() + 1000 );
        int h = Math.max(img1.getHeight(), img2.getHeight() - 200 );

        combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);

        Graphics g = combined.getGraphics();


        // paint both images, preserving the alpha channels
        g.drawImage(img1, 0, 0, null);
        g.drawImage(img2,-150,150, null);





        try {
            ImageIO.write(combined, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }






        // write your code here
    }
}
