package com.example.inspireme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    //declare
    Button enBtn,phBtn,customBtn,saveBtn;
    public  static Button createBtn;
    EditText textEdit,titleEdit;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    LinearLayout container;
    //from firebase
    Button btnLogout;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    //end firebase

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //assign by id
        enBtn = findViewById(R.id.en_btn);
        phBtn = findViewById(R.id.ph_btn);
        customBtn = findViewById(R.id.created_poem_btn);
        createBtn = findViewById(R.id.create_btn);
        saveBtn = findViewById(R.id.save);
        container = findViewById(R.id.create_container);
        textEdit = findViewById(R.id.custom_poem);
        titleEdit = findViewById(R.id.title_custom);
        //from fire base
        btnLogout = findViewById(R.id.logout);
        //end

        saveBtn.setVisibility(View.GONE);
        container.setVisibility(View.GONE);

    //use to initialize our shared pref.
        sharedPref = getSharedPreferences("MyPref",MODE_PRIVATE);
        editor = sharedPref.edit();

        //onclick englis poem
        enBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toTitlePage = new Intent(HomeActivity.this, PoemTitleActivity.class);
                toTitlePage.putExtra("Title1", getText(R.string.en_title1));
                toTitlePage.putExtra("Title2", getText(R.string.en_title2));
                toTitlePage.putExtra("Title3", getText(R.string.en_title3));
                toTitlePage.putExtra("Title4", getText(R.string.en_title4));
                toTitlePage.putExtra("Title5", getText(R.string.en_title5));
                toTitlePage.putExtra("Title6", getText(R.string.en_title6));
                toTitlePage.putExtra("Title7", getText(R.string.en_title7));
                toTitlePage.putExtra("Title8", getText(R.string.en_title8));
                toTitlePage.putExtra("Title9", getText(R.string.en_title9));
                toTitlePage.putExtra("Title10", getText(R.string.en_title10));
                toTitlePage.putExtra("Title11", getText(R.string.en_title11));
                toTitlePage.putExtra("Title12", getText(R.string.en_title12));

                toTitlePage.putExtra("Poem1", getText(R.string.en_poem1));
                toTitlePage.putExtra("Poem2", getText(R.string.en_poem2));
                toTitlePage.putExtra("Poem3", getText(R.string.en_poem3));
                toTitlePage.putExtra("Poem4", getText(R.string.en_poem4));
                toTitlePage.putExtra("Poem5", getText(R.string.en_poem5));
                toTitlePage.putExtra("Poem6", getText(R.string.en_poem6));
                toTitlePage.putExtra("Poem7", getText(R.string.en_poem7));
                toTitlePage.putExtra("Poem8", getText(R.string.en_poem8));
                toTitlePage.putExtra("Poem9", getText(R.string.en_poem9));
                toTitlePage.putExtra("Poem10", getText(R.string.en_poem10));
                toTitlePage.putExtra("Poem11", getText(R.string.en_poem11));
                toTitlePage.putExtra("Poem12", getText(R.string.en_poem12));
                startActivity(toTitlePage);
                finish();

            }
        });

        //onclick tagalog poem

        phBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent toTitlePage = new Intent(HomeActivity.this, PoemTitleActivity.class);
                toTitlePage.putExtra("Title1", getText(R.string.ph_title1));
                toTitlePage.putExtra("Title2", getText(R.string.ph_title2));
                toTitlePage.putExtra("Title3", getText(R.string.ph_title3));
                toTitlePage.putExtra("Title4", getText(R.string.ph_title4));
                toTitlePage.putExtra("Title5", getText(R.string.ph_title5));
                toTitlePage.putExtra("Title6", getText(R.string.ph_title6));
                toTitlePage.putExtra("Title7", getText(R.string.ph_title7));
                toTitlePage.putExtra("Title8", getText(R.string.ph_title8));
                toTitlePage.putExtra("Title9", getText(R.string.ph_title9));
                toTitlePage.putExtra("Title10", getText(R.string.ph_title10));
                toTitlePage.putExtra("Title11", getText(R.string.ph_title11));
                toTitlePage.putExtra("Title12", getText(R.string.ph_title12));


                toTitlePage.putExtra("Poem1", getText(R.string.ph_poem1));
                toTitlePage.putExtra("Poem2", getText(R.string.ph_poem2));
                toTitlePage.putExtra("Poem3", getText(R.string.ph_poem3));
                toTitlePage.putExtra("Poem4", getText(R.string.ph_poem4));
                toTitlePage.putExtra("Poem5", getText(R.string.ph_poem5));
                toTitlePage.putExtra("Poem6", getText(R.string.ph_poem6));
                toTitlePage.putExtra("Poem7", getText(R.string.ph_poem7));
                toTitlePage.putExtra("Poem8", getText(R.string.ph_poem8));
                toTitlePage.putExtra("Poem9", getText(R.string.ph_poem9));
                toTitlePage.putExtra("Poem10", getText(R.string.ph_poem10));
                toTitlePage.putExtra("Poem11", getText(R.string.ph_poem11));
                toTitlePage.putExtra("Poem12", getText(R.string.ph_poem12));
                startActivity(toTitlePage);
                finish();


            }
        });



        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               enBtn.setVisibility(View.GONE);
               phBtn.setVisibility(View.GONE);
               customBtn.setVisibility(View.GONE);
               createBtn.setVisibility(View.GONE);
               saveBtn.setVisibility(View.VISIBLE);
               container.setVisibility(View.VISIBLE);

            }
        });

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //get the value from our savebtn,
                String poemContent =  textEdit.getText().toString();
                String titlePoem =  titleEdit.getText().toString();
            //saving those value to our shared preferences
                editor.putString("POEM",poemContent);
                editor.putString("POEMTITLE",titlePoem);

                editor.commit(); // in order to be save

                enBtn.setVisibility(View.VISIBLE);
                phBtn.setVisibility(View.VISIBLE);
                customBtn.setVisibility(View.VISIBLE);
                saveBtn.setVisibility(View.GONE);
                container.setVisibility(View.GONE);




            }
        });

        customBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //displaying what we input in the save btn
                String displayPoem = sharedPref.getString("POEM",null);
                String displayTitle = sharedPref.getString("POEMTITLE",null);

                Intent toPoemContainer = new Intent(HomeActivity.this, PoemContainerActivity.class);
                toPoemContainer.putExtra("Title", displayTitle);
                toPoemContainer.putExtra("Poem", displayPoem);
                startActivity(toPoemContainer);



            }
        });
        // onclick logout firebase
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intToMain);
            }
        });

        //end firebase
    }
    @Override
    public void onBackPressed() {

       finishAffinity();
       finish();

    }


}