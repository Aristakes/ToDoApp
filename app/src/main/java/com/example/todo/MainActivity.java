package com.example.todo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.todo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private EditText userName = findViewById(R.id.userName);

    private EditText password = findViewById(R.id.password);

    private Button submitBtn = findViewById(R.id.submitButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(userName.getText().toString().equalsIgnoreCase("username")
                    && password.getText().toString().equalsIgnoreCase("test")
                )
                {
                    Intent intent = new Intent(MainActivity.this, Daschboard.class);
                    startActivity(intent);
                }

            }
        });


    }


}