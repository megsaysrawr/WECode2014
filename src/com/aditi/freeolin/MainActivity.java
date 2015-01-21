package com.aditi.freeolin;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	String subject = "";
	String loc = "";
	String details = "";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    final Button PizzaButton = (Button)findViewById(R.id.PizzaButton);
    PizzaButton.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			subject += "food";
		}
	}
   
    
    public void sendEmail()
    {
    	Intent intent = new Intent(Intent.ACTION_SENDTO);
    			Uri.parse("mailto:jennifer.wei@students.olin.edu?subject=" + Uri.encode(subject + " " + loc) + "&body=" + 
    		    Uri.encode(details));
    	startActivity(intent);
    }
    
}

