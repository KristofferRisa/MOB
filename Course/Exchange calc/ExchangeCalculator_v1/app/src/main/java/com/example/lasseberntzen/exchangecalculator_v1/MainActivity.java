package com.example.lasseberntzen.exchangecalculator_v1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText e;
    TextView t;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get pointers to UI elements
        t = (TextView)findViewById(R.id.textView1);
        e = (EditText)findViewById(R.id.editText1);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        // Set up the click listeners
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String s = e.getText().toString();
                double l = Double.parseDouble(s);
                l = l / 9.5;
                s = String.valueOf(l);
                t.setText(s);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String s = e.getText().toString();
                double l = Double.parseDouble(s);
                l = l * 9.5;
                s = String.valueOf(l);
                t.setText(s);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
