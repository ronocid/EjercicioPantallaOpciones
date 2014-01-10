package org.pmm.ejerciciopantallaopciones;

import android.preference.PreferenceActivity;
import android.os.Bundle;

public class PantallaPreferencias extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.pantallapreferencias);
	}
	
}
