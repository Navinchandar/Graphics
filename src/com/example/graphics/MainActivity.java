package com.example.graphics;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
 
        protected void onDraw(Canvas canvas)
		{
			super.onDraw(canvas);

			// custom drawing code here
			Paint paint = new Paint();
			paint.setStyle(Paint.Style.FILL);
			

			// draw BLACK rectangle with anti aliasing turned off
			paint.setAntiAlias(false);
			paint.setColor(Color.BLACK);
			canvas.drawRect(100, 5, 200, 30, paint);
			



		}
	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
