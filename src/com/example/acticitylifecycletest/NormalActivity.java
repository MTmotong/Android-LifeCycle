package com.example.acticitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class NormalActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedIntanceState) {
		super.onCreate(savedIntanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.normal_layout);
	}
}
