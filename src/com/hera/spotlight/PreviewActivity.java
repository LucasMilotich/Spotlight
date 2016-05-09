package com.hera.spotlight;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PreviewActivity extends Activity {

	private Button btnCambiarFoto;
	private Button btnCambiarTapa;
	
	/****				Metodos de activity					****/

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		linkUIComponents();
		loadListeners();

	}

	public void onResume() {
		super.onResume();
	}
	
//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		if (keyCode == KeyEvent.KEYCODE_BACK) {
//
//			return true;
//		}
//		return super.onKeyDown(keyCode, event);
//	}

	
	
	
	/****				Metodos principales					****/	

	private void linkUIComponents() {

		setContentView(R.layout.activity_preview);
		btnCambiarFoto = (Button) findViewById(R.id.btnCambiarFoto);
		btnCambiarTapa = (Button) findViewById(R.id.btnCambiarTapa);

	}

	private void loadListeners() {

		btnCambiarTapa.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				//TODO
			}
		});
		
		btnCambiarFoto.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				//TODO
			}
		});

		

	}


}
