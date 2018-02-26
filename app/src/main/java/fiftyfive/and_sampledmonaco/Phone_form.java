package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Phone_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_form);

        final EditText phoneField = (EditText) findViewById(R.id.Phone_Field);

        final Button sendVerficationCodeButton = (Button) findViewById(R.id.SendVerificationCodeButton);
        sendVerficationCodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "SEND VERIFICATION CODE button cliqued");

                String phoneNumber = phoneField.getText().toString();

                Intent i = new Intent(Phone_form.this, Verficiation_code_check.class);
                i.putExtra("PHONE_RETRIEVED", phoneNumber);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("INFO", "SYSTEM BACK button cliqued");
            startActivity(new Intent(Phone_form.this, Email_success.class));
            return true;
        }

        return false;
    }
}
