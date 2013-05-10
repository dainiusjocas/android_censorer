package com.example.androidcensorer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Censorer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_censorer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.censorer, menu);
		return true;
	}

}
