package com.example.jumblehero;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class JumbleloseendActivity extends Activity implements OnClickListener {
Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jumbleloseend);
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(b==v)
		{
			Toast.makeText(getApplicationContext(), "Starting new game ...", Toast.LENGTH_SHORT).show();
			Intent i=new Intent(JumbleloseendActivity.this,JumblestartActivity.class);
			startActivity(i);
		}
	}
}
