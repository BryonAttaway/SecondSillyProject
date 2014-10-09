package CTEC.secondsillyproject;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeirdActivity extends Activity
{
	private Button appButton;
	private TextView appText;
	private ArrayList<Integer> colorList;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weird);
		
		appButton = (Button) findViewById(R.id.appButton);
		appText = (TextView) findViewById(R.id.boringTextView);
		colorList = new ArrayList<Integer>();
		
		fillTheColorList();
		setupListeners();
	}
	
	private void fillTheColorList()
	{
		colorList.add(R.color.Black);
		colorList.add(R.color.brightPink);
		colorList.add(R.color.uglyBrown);
		colorList.add(R.color.White);
		colorList.add(R.color.Blue);
		colorList.add(R.color.Green);
		colorList.add(R.color.Red);
	}
	
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				//Button click stuff goes here
				int randomIndex = (int) (Math.random() * colorList.size());
				
				
				appButton.setBackgroundResource(colorList.get(randomIndex));
			}
		});
	}
}
