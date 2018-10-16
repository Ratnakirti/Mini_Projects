package com.example.jumblehero;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;

public class JumblewinendActivity extends Activity implements OnRatingBarChangeListener{
	ImageView img;
	RatingBar rate;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jumblewinend);
		img=(ImageView)findViewById(R.id.imageView1);
		rate=(RatingBar)findViewById(R.id.ratingBar1);
		rate.setOnRatingBarChangeListener(this);
	}


	@Override
	public void onRatingChanged(RatingBar ratingBar, float rating,
			boolean fromUser) {
		// TODO Auto-generated method stub
		String r=String.valueOf(rate.getRating());  
        Toast.makeText(getApplicationContext(),r, Toast.LENGTH_SHORT).show();
		
	}
}
