package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Email_success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_success);

        //Get value information about selected product in the list
        final String eMailAddress = getIntent().getStringExtra("EMAIL_RETRIEVED");

        final TextView eMailAddressTextView = (TextView) findViewById(R.id.Email_Address);
        eMailAddressTextView.setText(eMailAddress);

        final Button continueButton = (Button) findViewById(R.id.ContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "CONTINUE button cliqued");

                //Intent i = new Intent(Email_success.this, XXXX.class);
                //startActivity(i);
                finish();
            }
        });



    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("INFO", "SYSTEM BACK button cliqued");
            startActivity(new Intent(Email_success.this, Email_check.class));
            return true;
        }

        return false;
    }
}
