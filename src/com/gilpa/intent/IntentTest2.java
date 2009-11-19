package com.gilpa.intent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class IntentTest2 extends Activity implements OnClickListener{
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.sub);
    	String msg = getIntent().getStringExtra("msg");
    	TextView view = (TextView) findViewById(R.id.TextView01);
    	view.setText(msg);	
    	Button endButton = (Button) findViewById(R.id.endButton);
    	endButton.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.endButton){
			finish();
		}
	}
}
