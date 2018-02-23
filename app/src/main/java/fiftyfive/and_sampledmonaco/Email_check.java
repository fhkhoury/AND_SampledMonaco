package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Email_check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_check);

        //Get value information about selected product in the list
        final String eMailAddress = getIntent().getStringExtra("EMAIL_RETRIEVED");

        final TextView eMailAddressTextView = (TextView) findViewById(R.id.Email_Address);
        eMailAddressTextView.setText(eMailAddress);

        final Button openMailButton = (Button) findViewById(R.id.OpenEmailButton);
        openMailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "OPEN MAIL button cliqued");

                Intent i = new Intent(Email_check.this, Email_success.class);
                i.putExtra("EMAIL_RETRIEVED", eMailAddress);
                startActivity(i);
            }
        });

        final Button resendButton = (Button) findViewById(R.id.ResendButton);
        resendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "RESEND button cliqued");
                final Toast toast = Toast.makeText(Email_check.this, "The Magic Link has been resent!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("INFO", "SYSTEM BACK button cliqued");
            startActivity(new Intent(Email_check.this, Email_form.class));
            return true;
        }

        return false;
    }
}
