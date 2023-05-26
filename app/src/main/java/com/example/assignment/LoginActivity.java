package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText edtUsername = findViewById(R.id.edt_username);
        EditText edtPassword = findViewById(R.id.edt_nhappassword);

        Bundle data = getIntent().getExtras();

        edtUsername.setText(data.getString("username"));
        edtPassword.setText(data.getString("password"));

        Button btnBack = findViewById(R.id.btn_trove);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = new Intent();
                data.putExtra("number", 0);
//chạy dữ liệu click
                setResult(RESULT_OK, data);
                finish();
            }
        });
//        Button btn1 = findViewById(R.id.btn1);
//        Button btn2 = findViewById(R.id.btn2);
//        Button btn3 = findViewById(R.id.btn3);
//        Button btn
    }



}