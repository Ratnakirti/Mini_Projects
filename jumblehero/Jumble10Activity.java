package com.example.jumblehero;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Jumble10Activity extends Activity implements OnClickListener {
	Button b;
	TextView txt;
	EditText atxt;
	String []word={"MUBLEJ","ZZUPEL","KCAIJH","JAMAPY","JECOBT","BOMIEZ","IMACLX","GUNLEJ","FIFXUS","ZOFREN"};
	String []aword={"JUMBLE","PUZZLE","HIJACK","PYJAMA","OBJECT","ZOMBIE","CLIMAX","JUNGLE","SUFFIX","FROZEN"};
	int pos,ctr=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jumble10);
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(this);
		txt=(TextView)findViewById(R.id.textView1);
		atxt=(EditText)findViewById(R.id.editText1);
		Random r = new Random();
		int i = r.nextInt(4);
		txt.setText(word[i]);
		pos=i;
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(b==v)
		{
			String reply=atxt.getText().toString();
			if(reply.equalsIgnoreCase(aword[pos]))
			{
				Toast.makeText(getApplicationContext(),"CORRECT! You've WON the game!!", Toast.LENGTH_SHORT).show();
				Intent i=new Intent(Jumble10Activity.this,JumblewinendActivity.class);
				startActivity(i);
			}
			else
			{
				ctr++;
				if(ctr>=3)
					{
						Toast.makeText(getApplicationContext(),"LOSE!", Toast.LENGTH_SHORT).show();
						Intent i=new Intent(Jumble10Activity.this,JumbleloseendActivity.class);
						startActivity(i);
					}
				else
					Toast.makeText(getApplicationContext(),"WRONG! Try again.", Toast.LENGTH_SHORT).show();
			}
			
		}
		
	}
}
