package com.example.restaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class NorthActivity extends Activity implements OnClickListener {
	AutoCompleteTextView autoc;
	Button b1;
	Button b2;
	Button b3;
	TextView tv;
	String a = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_north);
		autoc=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		String []str={"Chole Bhature","Rogan Josh","Chicken Dum Biryani","Chicken Butter Masala","Chicken Tikka","Dal Tadka","Dal Makhani","Paneer Tikka"};
		ArrayAdapter<String> adpt=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,str);
		autoc.setAdapter(adpt);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		tv=(TextView)findViewById(R.id.textView3);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v== b1)
		{
			a = a + "\n" + autoc.getText().toString();
			tv.setText(a);
		}
		
		if(v == b2)
		{
			Intent i=new Intent(NorthActivity.this,OrderActivity.class);
			startActivity(i);
		}
		if(v == b3)
		{
			finish();
		}
	}
}
