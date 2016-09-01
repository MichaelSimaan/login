package com.example.misho.login;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SignUp extends AppCompatActivity {
    private Spinner spinner1 ,spinner2;
    private UserSignUpTask mAuthTask = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        spinner1 = (Spinner) findViewById(R.id.gender_signUpSpinner);
        List<String> list = new ArrayList<String>();
        list.add("Male");
        list.add("Female");
        list.add("hint");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
        spinner1.setSelection(dataAdapter.getCount() - 1);
        spinner2 = (Spinner) findViewById(R.id.userType_signUpSpinner);
        List<String> list1 = new ArrayList<String>();
        list1.add("Regular");
        list1.add("Curator");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list1);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter1);
    }

    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

    public class UserSignUpTask extends AsyncTask<void,void,Boolean>{
        @Override
        protected JSONObject doInBackground(void... params) {
            return null;
        }
    }
}
