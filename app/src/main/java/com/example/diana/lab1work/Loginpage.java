package com.example.diana.lab1work;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.diana.lab1work.Homepage;
import com.example.diana.lab1work.R;
import com.example.diana.lab1work.SignupPage;

public class Loginpage extends AppCompatActivity {

    private Button mBtLogin;
    private Button mBtCreate_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);



        mBtLogin = (Button) findViewById(R.id.login);

        mBtLogin.setOnClickListener(new View.OnClickListener() {
            @Overide
            public void onClick(View view){
                Login();
            }
        });
    }

    private void Login(){
        Intent intent = new Intent(this,Homepage.class );
        startActivity(intent);
    }

    public void create_account(View view){
        Intent intent = new Intent(this,SignupPage.class );
        startActivity(intent);
    }

}
