package com.example.calculatorapp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainPageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_page);
	}
	
	public void calciAct(View view){
		Intent intent=new Intent(getBaseContext(),CalculatorActivity.class);
		startActivity(intent);
		
		
	}
	
	public void benchMarkAct(View view){
		Intent intent=new Intent(getBaseContext(),SortingMainActivity.class);
		startActivity(intent);
	}
	
	public void fileText(View view){
		Intent intent=new Intent(getBaseContext(),TextFileMainActivity.class);
		startActivity(intent);
	}
	@SuppressLint("NewApi")
	public void createNotification(View v) {
		
		NotificationManager nm = (NotificationManager) this
				.getSystemService(Context.NOTIFICATION_SERVICE);
		
		int icon = R.drawable.ic_launcher;
		CharSequence tickerText = "CALCULATOR";
		long when = System.currentTimeMillis();
		
		
		Intent notificationIntent = new Intent(this,CalculatorActivity.class);
		
		PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
				notificationIntent, PendingIntent.FLAG_CANCEL_CURRENT);
		
		Notification.Builder builder = new Notification.Builder(this);
		
		builder.setContentIntent(contentIntent).setSmallIcon(icon)
		.setTicker(tickerText).setWhen(when).setAutoCancel(true)
		.setContentTitle("CALCULATOR")
		.setContentText("U can go to calculator activity here also!");
		
		Notification n = builder.getNotification();

		nm.notify(0, n);

		
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
		case R.id.About:
			Intent intent=new Intent(getBaseContext(),AboutActivity.class);
			startActivity(intent);
			break;
			
		
			
		case R.id.DisplayToastMsg:
			Toast toast=Toast.makeText(getBaseContext(),"TOAST IS SELECTED",Toast.LENGTH_LONG);
			
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.show();
			break;
			
		case R.id.Exit:
			this.finish();
			return true;
		}
		// TODO Auto-generated method stub
		return super.onOptionsItemSelected(item);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		 
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_page, menu);
		return true;
	}

}
