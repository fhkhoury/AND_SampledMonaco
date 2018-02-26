package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Reserve_your_card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_your_card);

        final Button settingsButton = (Button) findViewById(R.id.SettingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "SETTINGS button cliqued");
                Intent i = new Intent(Reserve_your_card.this, Settings.class);
                startActivity(i);
                finish();
            }
        });

        final Button optionsButton = (Button) findViewById(R.id.OptionsButton);
        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "SEE OPTIONS button cliqued");
                Intent i = new Intent(Reserve_your_card.this, Card_selection.class);
                startActivity(i);
                finish();
            }
        });

        final Button inviteButton = (Button) findViewById(R.id.InviteButton);
        inviteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "INVITE FRIENDS button cliqued");
                final Toast toast = Toast.makeText(Reserve_your_card.this, "An invite has been sent to your friends!", Toast.LENGTH_SHORT);
                toast.show();
                // place here an event
            }
        });
    }



}
