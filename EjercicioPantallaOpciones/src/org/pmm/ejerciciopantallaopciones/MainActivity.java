package org.pmm.ejerciciopantallaopciones;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button preferencias=(Button)findViewById(R.id.button1);
		Button consulta=(Button)findViewById(R.id.button2);
		final TextView nombre=(TextView)findViewById(R.id.nombre);
		final TextView edad=(TextView)findViewById(R.id.edad);
		final TextView sexo=(TextView)findViewById(R.id.sexo);
		final TextView sonido=(TextView)findViewById(R.id.sonido);
		
		preferencias.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent (MainActivity.this,PantallaPreferencias.class);
				startActivity(i);
			}
		});
		
		consulta.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				SharedPreferences preferencias= getSharedPreferences("org.pmm.ejerciciopantallaopciones_preferences",Context.MODE_PRIVATE);
				nombre.setText("Nombre: "+preferencias.getString("nombre", ""));
				edad.setText("Mayor de edad: "+preferencias.getBoolean("mayorDeEdad", false));
				sexo.setText("Sexo: "+preferencias.getString("sexo", "Mujer"));
				sonido.setText("Sonido: "+preferencias.getBoolean("sonido", false));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
