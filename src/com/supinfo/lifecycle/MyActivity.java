package com.supinfo.lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MyActivity extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d("LifeCycle", "onCreate()");
    }

    @Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("LifeCycle", "onDestroy()");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("LifeCycle", "onPause()");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("LifeCycle", "onResume()");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("LifeCycle", "onStart()");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("LifeCycle", "onStop()");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my, menu);
		return true;
	}

}
