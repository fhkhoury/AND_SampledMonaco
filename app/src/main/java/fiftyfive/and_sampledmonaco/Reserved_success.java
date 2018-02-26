package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Reserved_success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserved_success);

        //Get value information about user name
        final String reservedCard = getIntent().getStringExtra("CARD_SELECTED");

        final TextView cardTextView = (TextView) findViewById(R.id.ReservedCard);
        cardTextView.setText("You've reserved " + reservedCard);

        final Button settingsButton = (Button) findViewById(R.id.SettingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "SETTINGS button cliqued");
                Intent i = new Intent(Reserved_success.this, Settings.class);
                startActivity(i);
                finish();
            }
        });

        final Button seeDetailsButton = (Button) findViewById(R.id.DetailsButton);
        seeDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "SEE DETAILS button cliqued");
                Intent i = new Intent(Reserved_success.this, Card_selection.class);
                startActivity(i);
                finish();
            }
        });

        final Button inviteButton = (Button) findViewById(R.id.InviteButton);
        inviteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "INVITE FRIENDS button cliqued");
                final Toast toast = Toast.makeText(Reserved_success.this, "An invite has been sent to your friends!", Toast.LENGTH_SHORT);
                toast.show();
                // place here an event
            }
        });
    }
}
