package org.androidtown.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Age;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//emulator display activity_main.xml

        Name=(EditText)findViewById(R.id.editText1);//In main xml, find the id is editText1 and assign it to Name
        Age=(EditText)findViewById(R.id.editText2);//In main xml, find the id is editText2 and assign it to age
        button=(Button)findViewById(R.id.button1);//        In main xml, find the id is button1 and assign it to


         button.setOnClickListener(new View.OnClickListener(){
        
            public void onClick(View v)//Methods used when clicking a button
            {


                String NAME=Name.getText().toString();// Accept the value entered in edittext1 and store it in NAME
                String AGE=Age.getText().toString();//Accept the value entered in edittext1 and store it in AGE

                Intent intent=new Intent(getApplicationContext(),MenuActivity.class);//Intent to put the contents of MenuActivity
                intent.putExtra("loginname",NAME);//Put the name data value in the intent
                intent.putExtra("loginage",AGE);//Put the age data value in the intent

                startActivity(intent);//Transmits and transitions the data values ​​of the intent


            }

        });

    }
}
