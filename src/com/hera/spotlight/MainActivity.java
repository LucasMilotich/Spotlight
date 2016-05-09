package com.hera.spotlight;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btnComenzarEdicion;
	
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
//			moveTaskToBack(true);
//			return true;
//		}
//		return super.onKeyDown(keyCode, event);
//	}

	
	
	
	/****				Metodos principales					****/	

	private void linkUIComponents() {

		setContentView(R.layout.activity_main);
		btnComenzarEdicion = (Button) findViewById(R.id.btnComenzarEdicion);

	}

	private void loadListeners() {

		btnComenzarEdicion.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this,
						FiltrosActivity.class);
				startActivity(intent);
			}
		});

		

	}


}
