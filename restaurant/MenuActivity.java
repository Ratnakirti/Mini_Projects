package com.example.restaurant;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuActivity extends ListActivity {
	String []menu={"North Indian Cuisine","South Indian Cuisine","Continental Cuisine","Fast Food"};
	String []menuitem={"NorthActivity","SouthActivity","ContinentalActivity","FastActivity"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_menu);
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, menu));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String pos=menuitem[position];
		try{
			Class myActivity=Class.forName("com.example.restaurant."+pos);
			Intent i=new Intent(MenuActivity.this,myActivity);
			startActivity(i);
		   }
		catch(Exception e)
			{
			
			}
	}
}
