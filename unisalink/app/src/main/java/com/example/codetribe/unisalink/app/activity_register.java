package com.example.codetribe.unisalink.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class activity_register extends Activity {


    private ProgressDialog pDialog;

    JSONParser jsonParser = new JSONParser();
    EditText studentnumber;
    EditText emailaddress;
    EditText password;
    EditText accademicyear;
    EditText cellphone;
    EditText dateofbirth;

    Button register;

    //url to create new product
    private static String url_new_user = "";

    //JSON Node names
    private static final String TAG_SUCEESS = "sucess";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Edit text
        studentnumber = (EditText) findViewById(R.id.studentnumber);
        emailaddress = (EditText) findViewById(R.id.emailaddress);
        password = (EditText) findViewById(R.id.password);
        accademicyear = (EditText) findViewById(R.id.accademicyear);
        cellphone = (EditText) findViewById(R.id.cellphone);
        dateofbirth = (EditText) findViewById(R.id.dateofbirth);

        //create a button
        register = (Button) findViewById(R.id.register);

        //button click event
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CreateUser().execute();

            }
        });

    }


    class CreateUser extends AsyncTask<String, String, String>{
        @Override
        protected void onPreExecute() {
          super.onPreExecute();
            pDialog = new ProgressDialog(activity_register.this);
//            continue from here
        }
        @Override
        protected String doInBackground(String... params) {
            return null;
        }


    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_register, menu);
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
