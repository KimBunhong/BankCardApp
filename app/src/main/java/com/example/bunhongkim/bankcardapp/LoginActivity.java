package com.example.bunhongkim.bankcardapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final ToggleButton toggleButton  = (ToggleButton) findViewById(R.id.chkbox_remember);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    toggleButton.setBackgroundResource(R.drawable.chkbox_on_icon);
                    Toast.makeText(LoginActivity.this, "ON", Toast.LENGTH_SHORT).show();
                }
                else{
                    toggleButton.setBackgroundResource(R.drawable.chkbox_off_icon);
                    Toast.makeText(LoginActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
