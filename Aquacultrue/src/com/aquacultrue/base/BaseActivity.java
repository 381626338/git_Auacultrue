package com.aquacultrue.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import com.aquacultrue.Application.APP;
import com.aquacultrue.app.R;

/**
 * Activity»ùÀà
 * @author YZX.2015.5.18
 *
 */
public class BaseActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		APP.getInstance().addActivity(this);	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	public void onStop() {
		super.onStop();
	}
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	

}
