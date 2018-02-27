package com.example.android.quizzTheJungleBook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        //get the number of points from the quizz layout
        int value = 0;
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            value = bundle.getInt("total");
        }
        //shwo the points
        showResult("You got " + value + " points!");
        //get the name of the player
        String Congrats = "Well done!";
        Bundle firstPage = getIntent().getExtras();
        if (firstPage != null) {
            Congrats = firstPage.getString("name");
        }

        //show the congratulations message with the player's name
        if (value <= 3) {
            showName("It's okay " + Congrats + ". You should try again! ");
            changePic();

        } else showName("Well done, " + Congrats + "!");


    }

    //go to the main layout
    public void goback(View view) {
        Intent d = new Intent(this, MainActivity.class);
        startActivity(d);
    }

    //get the id of the total points message
    private void showResult(String mesajtotal) {

        TextView viewresult = (TextView) findViewById(R.id.points_textview);
        viewresult.setText(String.valueOf(mesajtotal));
    }
    private void changePic (){
        ImageView monkey = (ImageView)findViewById(R.id.monkey);
        monkey.setImageResource(R.drawable.rsz_sheerkhan);
    }

    //get the id of the congratulations message
    private void showName(String mesajname) {

        TextView viewresult = (TextView) findViewById(R.id.congrats_textview);
        viewresult.setText(String.valueOf(mesajname));

    }
}
