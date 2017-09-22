package com.example.diana.lab1work;



        import android.content.Intent;
        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.widget.Button;

public class SignupPage extends AppCompatActivity {

    private Button mBtSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_page);

        mBtSignup = (Button) findViewById(R.id.signup_activity);

        mBtSignup.setOnClickListener(new View.OnClickListener() {
            @Overide
            public void onClick(View view){
                Signup();
            }
        });
    }

    private void Signup(){
        Intent intent = new Intent(this,Loginpage.class );
        startActivity(intent);
    }
}
