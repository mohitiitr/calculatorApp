package com.example.calculatorapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends Activity {
	
	EditText edtfirst;
	EditText edtsecond;
	
	TextView tvresult;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
Toast toast=Toast.makeText(getBaseContext(),"Welcome to the CALCULATOR activity",Toast.LENGTH_LONG);
		
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
		
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculator_activity);
		
		edtfirst=(EditText) findViewById(R.id.edt1);
		edtsecond=(EditText) findViewById(R.id.edt2);
		
		tvresult=(TextView) findViewById(R.id.txtresult);
	}
	
	
	public void calci(View view){
		double num1=0;
		double num2=0;
		
		if(edtfirst.getText().toString() != null && edtsecond.getText().toString() != null)
			num1=Double.parseDouble(edtfirst.getText().toString());
		    num2=Double.parseDouble(edtsecond.getText().toString());
		    
		    
		    switch(view.getId()){
		    
		    case R.id.btnAddition:
		    	tvresult.setText((num1+num2)+ " ");
		    	break;
		    	
		    case R.id.btnSubtraction:
		    	tvresult.setText((num1-num2)+ " ");
		    	break;
		    	
		    case R.id.btnMul:
		    	tvresult.setText((num1*num2)+ " ");
		    	break;
		    	
		    case R.id.btnDiv:
		    	tvresult.setText((num1/num2)+ " ");
		    	break;
		    	
		    case R.id.btnclear:
		    	edtfirst.setText(" ");
		    	edtsecond.setText(" ");
		    	tvresult.setText(" ");
		    	break;
		    
		    }
		    
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

}
