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

public class Verficiation_code_check extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verficiation_code_check);

        //Get value information about user phone number
        final String phone = getIntent().getStringExtra("PHONE_RETRIEVED");

        final TextView phoneTextView = (TextView) findViewById(R.id.phoneNumber);
        phoneTextView.setText(phone);

        final Button continueButton = (Button) findViewById(R.id.ContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "CONTINUE button cliqued");

                Intent i = new Intent(Verficiation_code_check.this, Phone_success.class);
                i.putExtra("PHONE_RETRIEVED", phone);
                startActivity(i);
            }
        });

        final Button resendButton = (Button) findViewById(R.id.ResendButton);
        resendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "RESEND button cliqued");
                final Toast toast = Toast.makeText(Verficiation_code_check.this, "The Verification code has been resent!", Toast.LENGTH_SHORT);
                toast.show();

            }
        });


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("INFO", "SYSTEM BACK button cliqued");
            startActivity(new Intent(Verficiation_code_check.this, Phone_form.class));
            return true;
        }

        return false;
    }
}
