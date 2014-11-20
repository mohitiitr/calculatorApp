package com.example.calculatorapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	EditText edtext;
	EditText edtext1;
	
	TextView tvres;
	
	Button btnOk;
	Button btnOk1;
	Button btnOk2;
	Button btnOk3;
	Button clear;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edtext=(EditText) findViewById(R.id.edt1);
		edtext1=(EditText) findViewById(R.id.edt2);
		
		tvres=(TextView) findViewById(R.id.txt);
		
		btnOk=(Button) findViewById(R.id.btn);
		btnOk1=(Button) findViewById(R.id.btn1);
		btnOk2=(Button) findViewById(R.id.btn2);
		btnOk3=(Button) findViewById(R.id.btn3);
		clear=(Button) findViewById(R.id.btnclr);
		
	}
	
	
	public void user(View view) {
		double num1=Double.parseDouble(edtext.getText().toString());
		double num2=Double.parseDouble(edtext1.getText().toString());
		
		
		
		switch(view.getId()) {
		
		
		case R.id.btn:
			String res=Double.toString(calculator.sum(num1,num2));
			tvres.setText(res);
			break;
			
		case R.id.btn1:
			String res1=Double.toString(calculator.diff(num1, num2));
			tvres.setText(res1);
			break;
		
		case R.id.btn2:
			String res2=Double.toString(calculator.mul(num1, num2));
			tvres.setText(res2);
			break;
			
		case R.id.btn3:
			String res3=Double.toString(calculator.div(num1, num2));
			tvres.setText(res3);
			break;
			
			
		case R.id.btnclr:
			edtext.setText(" ");
			edtext1.setText(" ");
			tvres.setText(" ");
			break;
		
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
