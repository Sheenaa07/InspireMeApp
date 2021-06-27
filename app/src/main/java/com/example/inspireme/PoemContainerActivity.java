package com.example.inspireme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PoemContainerActivity extends AppCompatActivity {
    //declare
    TextView titleContainer,poemContainer;
    Button homeBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_container);
        //assign by id
        titleContainer = findViewById(R.id.titleContainer);
        poemContainer = findViewById(R.id.poemContainer);
        homeBtn = findViewById(R.id.homeBtn);

        //retrieve title and poem content
        Intent getTitleAndPoem = getIntent();
        String poemTitle = getTitleAndPoem.getStringExtra("Title");
        String poemContent = getTitleAndPoem.getStringExtra("Poem");


            //display what we retrieve on its container
            titleContainer.setText(poemTitle);
            poemContainer.setText(poemContent);


            homeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent = new Intent(PoemContainerActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
            });



    }


}