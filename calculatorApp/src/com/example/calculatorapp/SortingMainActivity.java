package com.example.calculatorapp;

import java.util.Arrays;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SortingMainActivity extends Activity {
	
	EditText edtinput;
	TextView txtbubble;
	TextView txtselect;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sorting_main);
		
Toast toast=Toast.makeText(getBaseContext(),"Welcome to the BENCH MARK activity",Toast.LENGTH_LONG);
		
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
		
		
		edtinput=(EditText) findViewById(R.id.edtinputnumber);
		txtbubble=(TextView) findViewById(R.id.txtbubblesort);
		txtselect=(TextView) findViewById(R.id.txtselection);
		
	}
	
	
   public int[] randomArray(int num){
	   
	   int[] arr= new int[num];
	   for(int i=0;i<arr.length;i++){
		   arr[i]=(int)(Math.random()*100);
	   }
	   return arr;
	   
   }
   
   public void benchMark(View view){
	   
	   int size=Integer.parseInt(edtinput.getText().toString());
	   int[] sortArr= randomArray(size);
	   long t=System.currentTimeMillis();
	   
	  
	   switch(view.getId()){
	   
	   case R.id.btnbubblesort:
		   Arrays.toString(sortingNumbers.bubbleSort(sortArr));
		   txtbubble.setText((System.currentTimeMillis() - t) + " ");
		   break;
		   
	   case R.id.btnselectionsort:
		   Arrays.toString(sortingNumbers.SelectionSort(sortArr));
		   txtselect.setText((System.currentTimeMillis() - t) + " ");
		   break;
		   
	   
	   }
   }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sorting_main, menu);
		return true;
	}

}
