package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Phone_success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_success);

        //Get value information about user email address
        final String phone = getIntent().getStringExtra("PHONE_RETRIEVED");

        final TextView phoneTextView = (TextView) findViewById(R.id.Phone_Number);
        phoneTextView.setText(phone);

        final Button continueButton = (Button) findViewById(R.id.ContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "CONTINUE button cliqued");
                Intent i = new Intent(Phone_success.this, Legal_form.class);
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
            startActivity(new Intent(Phone_success.this, Verficiation_code_check.class));
            return true;
        }

        return false;
    }
}
