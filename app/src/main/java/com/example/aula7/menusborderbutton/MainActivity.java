package com.example.aula7.menusborderbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionMenu (Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R,menu.options_menu, menu);
        return true;

    }
}
