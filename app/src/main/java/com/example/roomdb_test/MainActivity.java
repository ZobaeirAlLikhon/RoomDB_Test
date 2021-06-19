package com.example.roomdb_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.roomdb_test.local_RM_DB.Info;
import com.example.roomdb_test.local_RM_DB.InfoDatabase;

public class MainActivity extends AppCompatActivity {
    EditText name,email,address;
    Button submit;
    InfoDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.edit_name);
        email=findViewById(R.id.edit_email);
        address=findViewById(R.id.edit_number);
        submit=findViewById(R.id.submit);
        db=InfoDatabase.getDatabaseInstance(MainActivity.this);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Info info=new Info();
                info.setName(name.getText().toString());
                info.setEmail(email.getText().toString());
                info.setAddress(address.getText().toString());
                db.infoDao().insertInfo(info);
                Log.e("OK",name.getText().toString());


            }
        });


    }
}