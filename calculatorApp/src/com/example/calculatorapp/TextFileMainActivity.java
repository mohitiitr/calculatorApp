package com.example.calculatorapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TextFileMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_file_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.text_file_main, menu);
		return true;
	}

}
