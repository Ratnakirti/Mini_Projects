package com.example.restaurant;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class OrderActivity extends Activity implements OnRatingBarChangeListener {
	RatingBar rate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order);
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
