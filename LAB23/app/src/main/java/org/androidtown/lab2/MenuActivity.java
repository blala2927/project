package org.androidtown.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);// activity_menu display

        Intent passedIntent=getIntent();//Receive the data values ​​contained in the intet
        if(passedIntent!=null)//If the intent is not empty
        {
            String name=passedIntent.getStringExtra("loginname");//The data stored in loginname in the intern is stored in name.
            String age=passedIntent.getStringExtra("loginage");//The data stored in loginage is stored in age in the intern.

            Toast.makeText(getApplicationContext(),"Student Info : "+name+","+age,Toast.LENGTH_LONG).show();
            //In the Student Info sentence, the values ​​entered in the edited text are displayed in a short toasted message

        }
        Button button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){


           public void onClick(View v)
           {


               finish();//Exit the current activity (see previous activity)
           }


        });



    }
}
