package com.shrey.samples.simpleunboundedserviceexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

	//tag to be used for error logging
	private static final String TAG = "my service";
	
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	//overriding onCreate()
	@Override
	public void onCreate() {
		
		//text to be displayed for success
		String text = "Service onCreate() called";
		
		//using toast to make and display text for successful call of the function
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
		
		//logging for debug console
		Log.e(TAG,text);
		
	}
	
	//overridding onStartCommand()
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		
		//text to be displayed for success
		String text = "Service onStartCommand() called";
		
		//using toast to make and display text for successful call of the function
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
		
		//logging for debug console
		Log.e(TAG,text);
		
		return super.onStartCommand(intent, flags, startId);
	}

	//overriding onDestroy()
	@Override
	public void onDestroy() {
		
		//text to be displayed for success
		String text = "Service onDestroy() called";
		
		//using toast to make and display text for successful call of the function
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
		
		//logging for debug console
		Log.e(TAG,text);
		
	}
}
