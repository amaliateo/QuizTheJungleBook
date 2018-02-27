package com.example.android.quizzTheJungleBook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TriviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia);
    }
    public void trivia(View view) {
        Uri webpage = Uri.parse("http://www.imdb.com/title/tt0061852/trivia?ref_=tt_trv_trv");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    //go back to the main layout
    public void backButton(View view){
        Intent b = new Intent (this, MainActivity.class);
        startActivity(b);
    }
}
