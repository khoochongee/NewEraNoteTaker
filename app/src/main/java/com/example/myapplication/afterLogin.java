package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class afterLogin extends AppCompatActivity {
    private Button btnAddNote;
    private ListView listView;
    private ArrayList<String> details=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        listView=findViewById(R.id.ListView);
        details.add("Khoo Chong Ee");
        details.add("Steve");
        details.add("19");
        details.add("Male");
        details.add("000703-10-1358");
        details.add("Diploma In Web Development");
        details.add("Love Coding & Learning");
        ArrayAdapter<String> detailAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,details);
        listView.setAdapter(detailAdapter);
        btnAddNote=findViewById(R.id.addNote);
        btnAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(afterLogin.this,AddNoteActivity.class);
                startActivity(i);
            }
        });
        findViews();
        setListeners();
    }
    private void findViews(){

    }
    private void setListeners(){

    }
}
