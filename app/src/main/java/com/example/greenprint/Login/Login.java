package com.example.greenprint.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.greenprint.R;

public class Login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button buttonLogin;
    private Button buttonReg;
    private TextView attemptsInfo;


    private final String realusername = "Admin";
    private final String realpassword = "123";


    boolean isValid = false;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.etName);
        password = (EditText) findViewById(R.id.edTextTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        attemptsInfo = findViewById(R.id.textAttemptsInfo);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = username.getText().toString();
                String inputPassword = password.getText().toString();



                if (inputName.isEmpty() || inputPassword.isEmpty()) {
                    Toast.makeText(Login.this, "Please enter all the details correctly!", Toast.LENGTH_SHORT).show();
                } else {

                    /*isValid = validate(inputName, inputPassword);
                    if(!isValid) {

                        counter--;
                        Toast.makeText(Login.this, "Incorrect credentials entered!", Toast.LENGTH_SHORT).show();

                        attemptsInfo.setText("No. of attempts remaining: " + counter);

                        if(counter == 0){
                           buttonLogin.setEnabled(false);
                        }
                    } else{
                        Toast.makeText(Login.this, "Login was successful!", Toast.LENGTH_SHORT).show();

                        //Go to the home activity
                        Intent intent = new Intent(Login.this, MainActivity.class);
                        startActivity(intent);
                    }*/
                }
            }
        });

        buttonReg = (Button) findViewById(R.id.buttonregister);
        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistration();
            }
        });
    }

    private boolean validate(String name, String password) {
        if (name.equals(realusername) && password.equals(realpassword)) {
            return true;
        }
        return false;
    }


    public void openRegistration() {
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
}