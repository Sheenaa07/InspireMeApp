package com.example.inspireme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PoemTitleActivity extends AppCompatActivity {
    //declare
    Button title1,title2,title3,title4,title5,title6,title7,title8,title9,title10,title11,title12;

    SharedPreferences shared;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_title);


        //assign by id
        title1 = findViewById(R.id.button1);
        title2 = findViewById(R.id.button2);
        title3 = findViewById(R.id.button3);
        title4 = findViewById(R.id.button4);
        title5 = findViewById(R.id.button5);
        title6 = findViewById(R.id.button6);
        title7 = findViewById(R.id.button7);
        title8 = findViewById(R.id.button8);
        title9 = findViewById(R.id.button9);
        title10 = findViewById(R.id.button10);
        title11 = findViewById(R.id.button11);
        title12 = findViewById(R.id.button12);

        //retrieve what we put extra in home actvty
        Intent getTitles = getIntent();
        String btn1 = getTitles.getStringExtra("Title1");
        String btn2 = getTitles.getStringExtra("Title2");
        String btn3 = getTitles.getStringExtra("Title3");
        String btn4 = getTitles.getStringExtra("Title4");
        String btn5 = getTitles.getStringExtra("Title5");
        String btn6 = getTitles.getStringExtra("Title6");
        String btn7 = getTitles.getStringExtra("Title7");
        String btn8 = getTitles.getStringExtra("Title8");
        String btn9 = getTitles.getStringExtra("Title9");
        String btn10 = getTitles.getStringExtra("Title10");
        String btn11 = getTitles.getStringExtra("Title11");
        String btn12 = getTitles.getStringExtra("Title12");

        Intent getPoem = getIntent();
        String poemContent1 = getPoem.getStringExtra("Poem1");
        String poemContent2 = getPoem.getStringExtra("Poem2");
        String poemContent3 = getPoem.getStringExtra("Poem3");
        String poemContent4 = getPoem.getStringExtra("Poem4");
        String poemContent5 = getPoem.getStringExtra("Poem5");
        String poemContent6 = getPoem.getStringExtra("Poem6");
        String poemContent7 = getPoem.getStringExtra("Poem7");
        String poemContent8 = getPoem.getStringExtra("Poem8");
        String poemContent9 = getPoem.getStringExtra("Poem9");
        String poemContent10 = getPoem.getStringExtra("Poem10");
        String poemContent11 = getPoem.getStringExtra("Poem11");
        String poemContent12 = getPoem.getStringExtra("Poem12");



        //displaying titles in the button
        title1.setText(btn1);
        title2.setText(btn2);
        title3.setText(btn3);
        title4.setText(btn4);
        title5.setText(btn5);
        title6.setText(btn6);
        title7.setText(btn7);
        title8.setText(btn8);
        title9.setText(btn9);
        title10.setText(btn10);
        title11.setText(btn11);
        title12.setText(btn12);



        //onclick listner for each title button
        title1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn1);
                toPoemContainer.putExtra("Poem", poemContent1);
                startActivity(toPoemContainer);
            }
        });
        title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn2);
                toPoemContainer.putExtra("Poem", poemContent2);
                startActivity(toPoemContainer);
            }
        });

        title3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn3);
                toPoemContainer.putExtra("Poem", poemContent3);
                startActivity(toPoemContainer);
            }
        });
        title4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn4);
                toPoemContainer.putExtra("Poem", poemContent4);
                startActivity(toPoemContainer);
            }
        });
        title5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn5);
                toPoemContainer.putExtra("Poem", poemContent5);
                startActivity(toPoemContainer);
            }
        });
        title6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn6);
                toPoemContainer.putExtra("Poem", poemContent6);
                startActivity(toPoemContainer);
            }
        });

        title7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn7);
                toPoemContainer.putExtra("Poem", poemContent7);
                startActivity(toPoemContainer);
            }
        });
        title8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn8);
                toPoemContainer.putExtra("Poem", poemContent8);
                startActivity(toPoemContainer);
            }
        });
        title9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn9);
                toPoemContainer.putExtra("Poem", poemContent9);
                startActivity(toPoemContainer);
            }
        });
        title10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn10);
                toPoemContainer.putExtra("Poem", poemContent10);
                startActivity(toPoemContainer);
            }
        });

        title11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn11);
                toPoemContainer.putExtra("Poem", poemContent11);
                startActivity(toPoemContainer);
            }
        });
        title12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toPoemContainer = new Intent(PoemTitleActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", btn12);
                toPoemContainer.putExtra("Poem", poemContent12);
                startActivity(toPoemContainer);
            }
        });



    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(PoemTitleActivity.this,HomeActivity.class);
        startActivity(intent);
        finish();
    }
}