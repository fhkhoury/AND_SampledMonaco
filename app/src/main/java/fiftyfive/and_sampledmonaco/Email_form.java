package fiftyfive.and_sampledmonaco;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_form);

        final EditText emailField = (EditText) findViewById(R.id.Email_Field);

        final Button continueButton = (Button) findViewById(R.id.ContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "CONTINUE button cliqued");

                String eMailAddress = emailField.getText().toString();

                // IF USER IS CREATING A NEW ACCOUNT
                Intent i = new Intent(Email_form.this, Email_check.class);
                i.putExtra("EMAIL_RETRIEVED", eMailAddress);
                startActivity(i);

                // IF USER HAS ALREADY AN ACCOUNT
                //Intent j = new Intent(Email_form.this, Email_check.class);
                //startActivity(j);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("INFO", "SYSTEM BACK button cliqued");
            startActivity(new Intent(Email_form.this, Login.class));
            return true;
        }

        return false;
    }
}
