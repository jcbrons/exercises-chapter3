package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;


public class HelloWorldActivity extends Activity {
		@Override
		protected void onCreate (Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_hello_world);
			initDisplayButton();
			initClearButton();
															}
private void initDisplayButton() {
	Button displayButton = (Button) findViewById(R.id.buttonDisplay);
		displayButton.setOnClickListener(new OnClickListener () 	{
			
			@Override
			public void onClick(View arg0){
				EditText editName = (EditText) findViewById(R.id.editTextName);
				TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
				String nameToDisplay = editName.getText().toString();
				textDisplay.setText("Hello " + nameToDisplay);
										  }
									 								});
 								}
	
	private void initClearButton() {
		Button clearButton = (Button) findViewById(R.id.buttonClear);
		clearButton.setOnClickListener(new OnClickListener () {
			
			@Override
			public void onClick(View arg0){
				EditText editName = (EditText) findViewById(R.id.editTextName);
				TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
				textDisplay.setText("Hello World!");
				editName.setText("");
			}
		});
	
}
		
}