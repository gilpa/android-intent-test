package com.gilpa.intent;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class IntentTest extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.Button01);
        EditText textView =  (EditText) findViewById(R.id.EditText01);
        textView.setText("test");

        button.setText(R.string.buttonName);
        button.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.Button01){
			Intent intent = new Intent(this,IntentTest2.class);
			EditText textView =  (EditText) findViewById(R.id.EditText01);
			String testmsg = textView.getText().toString();
			intent.putExtra("msg", testmsg);
			startActivity(intent);
		}
	}
}