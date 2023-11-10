package com.example.agecal;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText t1,t2;
    TextView t3,t4,t5,t6,t7,t8;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.editText1);
        t2=(EditText)findViewById(R.id.editText2);
        t3=(EditText)findViewById(R.id.editText3);
        t4=(EditText)findViewById(R.id.editText4);
        t5=(EditText)findViewById(R.id.editText5);
        t6=(EditText)findViewById(R.id.editText6);
        t7=(EditText)findViewById(R.id.editText7);
        t8=(EditText)findViewById(R.id.editText8);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener(){
        

    @Override
    public void onClick(View arg0) {
    	int r=Integer.parseInt(t1.getText().toString());
    	int t=Integer.parseInt(t2.getText().toString());
    	int cy=t-r;
    	int d=r*365;
    	int mo=r*12;
    	int wk=d/7;
    	int hr=d*24;
    	int mn=hr*60;
    	
    	t3.setText(String.valueOf(cy));
    	t4.setText(String.valueOf(d));
    	t5.setText(String.valueOf(mo));
    	t6.setText(String.valueOf(wk));
    	t7.setText(String.valueOf(hr));
    	t8.setText(String.valueOf(mn));
    }
    });
    }
    
}
