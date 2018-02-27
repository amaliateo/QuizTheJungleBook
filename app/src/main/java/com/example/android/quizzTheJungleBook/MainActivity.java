package com.example.android.quizzTheJungleBook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //go to the quizz layout
    public void StartQuizz(View view) {

        //if the player didn't enter his name pop up a toast,dont go to the next layout

        if (getName().isEmpty()) {
            Toast.makeText(this, "You forgot to enter Your Name", Toast.LENGTH_LONG).show();
        } else {

            Intent i = new Intent(this, QuizzActivity.class);
            i.putExtra("name", getName());
            startActivity(i);
            Log.i("Mainactivity", getName());
        }

    }

    //go to the Did You Know activity_end layout
    public void didYouKnow(View view) {
        Intent a = new Intent(this, TriviaActivity.class);
        startActivity(a);
    }

    //get the player's name
    private String getName() {
        EditText whatisthename = (EditText) findViewById(R.id.whatname_editte);
        String name = whatisthename.getText().toString();

        return name;


    }
}
