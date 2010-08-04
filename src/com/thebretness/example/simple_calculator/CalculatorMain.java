package com.thebretness.example.simple_calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorMain extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final EditText text = (EditText) this.findViewById(R.id.entry);
        
        final Button button = (Button) findViewById(R.id.seven);
        final String Rseven = this.getResources().getString(R.string.seven);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { text.append(Rseven); }
        });   
    }
}