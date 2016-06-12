package com.hera.spotlight;


import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.hera.entities.Foto;
import com.hera.entities.Tapa;
import com.hera.imageProcessing.ImageProcessing;

public class PreviewActivity extends Activity {

    private Button btnCambiarFoto;
    private Button btnCambiarTapa;
    ImageView imgView;

    private static int RESULT_LOAD_IMAGE = 1;
    String imgDecodableString;


    private Bitmap fotoSeleccionada = null;
    private Bitmap tapaSeleccionada = null;

    /***
     * Metodos de activity
     ****/

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        linkUIComponents();
        loadListeners();

    }

    public void onResume() {
        super.onResume();
        if (fotoSeleccionada != null && tapaSeleccionada != null) {
            Foto foto = new Foto(fotoSeleccionada);
            Tapa tapa = new Tapa(206, 525, tapaSeleccionada);
            ImageProcessing imgProcessing = new ImageProcessing(foto, tapa);
            imgView.setImageBitmap(imgProcessing.mergeFoto());
        }
    }

//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		if (keyCode == KeyEvent.KEYCODE_BACK) {
//
//			return true;
//		}
//		return super.onKeyDown(keyCode, event);
//	}


    /****
     * Metodos principales
     ****/

    private void linkUIComponents() {

        setContentView(R.layout.activity_preview);
        btnCambiarFoto = (Button) findViewById(R.id.btnCambiarFoto);
        btnCambiarTapa = (Button) findViewById(R.id.btnCambiarTapa);
        imgView = (ImageView) findViewById(R.id.imgView);
    }

    private void loadListeners() {

        btnCambiarFoto.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
            }
        });

        btnCambiarTapa.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            // When an Image is picked
            if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK
                    && null != data) {
                // Get the Image from data

                Uri selectedImage = data.getData();
                String[] filePathColumn = {MediaStore.Images.Media.DATA};

                // Get the cursor
                Cursor cursor = getContentResolver().query(selectedImage,
                        filePathColumn, null, null, null);
                // Move to first row
                cursor.moveToFirst();

                int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
                imgDecodableString = cursor.getString(columnIndex);
                cursor.close();
                // Set the Image in ImageView after decoding the String
                if (fotoSeleccionada == null) {
                    fotoSeleccionada = BitmapFactory.decodeFile(imgDecodableString);
                    imgView.setImageBitmap(fotoSeleccionada);
                } else {
                    tapaSeleccionada = BitmapFactory.decodeFile(imgDecodableString);
//                    imgView.setImageBitmap(tapaSeleccionada);
                }

            } else {
                Toast.makeText(this, "No has seleccionado ninguna foto",
                        Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(this, "Se ha producido un error: " + e.getMessage(), Toast.LENGTH_LONG)
                    .show();
        }

    }


}
