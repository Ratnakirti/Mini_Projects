package com.example.restaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity implements OnClickListener{
	EditText ed1;
	EditText ed2;
	int counter=0;
	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(this);		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==b)
		{
			counter++;
			String user = "admin";
			String pass = "12345678";
			String val1=ed1.getText().toString();
			String val2=ed2.getText().toString();
			if(val1.equals(user) && val2.equals(pass))
			{
				Intent i=new Intent(LoginActivity.this,MenuActivity.class);
				startActivity(i);			
			}
			else
			{	
				if(counter>=3)
				{
					Intent i= new Intent(LoginActivity.this,UnauthorActivity.class);
					startActivity(i);
				}	
				else
				{	
					int t = 3-counter;
					if(t>1)
					{
						String s=Integer.toString(t);
						Toast.makeText(getApplicationContext(),"You've "+ s +" attempts left",Toast.LENGTH_LONG).show();
					}
					else
					{
						String s=Integer.toString(t);
						Toast.makeText(getApplicationContext(),"You've "+ s +" attempt left",Toast.LENGTH_LONG).show();
					}					
				}
			}
		}
	}
}