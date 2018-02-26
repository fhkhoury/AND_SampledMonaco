package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Card_selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_selection);

        final Button midnightBlueButton = (Button) findViewById(R.id.MidnightBlueButton);
        midnightBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "MIDNIGHT BLUE button cliqued");
                Intent i = new Intent(Card_selection.this, Reserved_success.class);
                i.putExtra("CARD_SELECTED", "Midnight Blue");
                startActivity(i);
                finish();
            }
        });

        final Button rubySteelButton = (Button) findViewById(R.id.RubySteelButton);
        rubySteelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "RUBY STEEL button cliqued");
                Intent i = new Intent(Card_selection.this, Reserved_success.class);
                i.putExtra("CARD_SELECTED", "Ruby Steel");
                startActivity(i);
                finish();
            }
        });

        final Button preciousMetalPinkButton = (Button) findViewById(R.id.PreciousMetalPinkButton);
        preciousMetalPinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "PRECIOUS METAL PINK button cliqued");
                Intent i = new Intent(Card_selection.this, Reserved_success.class);
                i.putExtra("CARD_SELECTED", "Precious Metal Pink");
                startActivity(i);
                finish();
            }
        });

        final Button preciousMetalGrayButton = (Button) findViewById(R.id.PreciousMetalGrayButton);
        preciousMetalGrayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "PRECIOUS METAL GRAY button cliqued");
                Intent i = new Intent(Card_selection.this, Reserved_success.class);
                i.putExtra("CARD_SELECTED", "Precious Metal Gray");
                startActivity(i);
                finish();
            }
        });

        final Button obsidianBlackButton = (Button) findViewById(R.id.ObsidianBlackButton);
        obsidianBlackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "OBSIDIAN BLACK button cliqued");
                Intent i = new Intent(Card_selection.this, Reserved_success.class);
                i.putExtra("CARD_SELECTED", "Obsidian Black");
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("INFO", "SYSTEM BACK button cliqued");
            //If card has been already selected for the first time

            //
            //If card has not been already selected for the first time
            startActivity(new Intent(Card_selection.this, Reserved_success.class));
            finish();
            return true;
        }

        return false;
    }
}
