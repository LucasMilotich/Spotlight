package com.hera.spotlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FiltrosActivity extends Activity {

	private Button btnIniciarEdicion;

	/**** Metodos de activity ****/

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		linkUIComponents();
		loadListeners();
	}

	public void onResume() {
		super.onResume();
	}

	// @Override
	// public boolean onKeyDown(int keyCode, KeyEvent event) {
	// if (keyCode == KeyEvent.KEYCODE_BACK) {
	// moveTaskToBack(true);
	// return true;
	// }
	// return super.onKeyDown(keyCode, event);
	// }

	/**** Metodos principales ****/

	private void linkUIComponents() {

		setContentView(R.layout.activity_filtros);
		btnIniciarEdicion = (Button) findViewById(R.id.btnIniciarEdicion);

	}

	private void loadListeners() {

		btnIniciarEdicion.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				startActivity(new Intent(FiltrosActivity.this,
						PreviewActivity.class));
			}
		});
	}
}
