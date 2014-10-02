package com.shrey.samples.simpleunboundedserviceexample;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

	//called for start service button click
	public void onClickStartService(View view) {
		
		//creating intent for communicating with the MyService class
		//MyService is the Service class name here
		Intent serviceIntent = new Intent(this,MyService.class);
		
		//starting the service by calling the desired intent
		startService(serviceIntent);
	}
	
	//called for stop service button click
	public void onClickStopService(View view) {
		
		//creating intent for communicating with the MyService class
		//MyService is the Service class name here
		Intent serviceIntent = new Intent(this,MyService.class);
		
		//stopping the service by calling the desired intent
		//Service will only stop if it is already running.
        stopService(serviceIntent);
	}
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
