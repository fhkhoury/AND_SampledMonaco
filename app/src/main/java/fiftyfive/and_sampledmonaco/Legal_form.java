package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Legal_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal_form);

        Button termsButton = (Button) findViewById(R.id.termsButton);
        termsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "TERMS AND CONDITION button cliqued");

                Intent i = new Intent(Legal_form.this, Terms_and_conditions.class);
                startActivity(i);
            }
        });

        Button preRegisterButton = (Button) findViewById(R.id.PreRegisterButton);
        preRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "PRE_REGISTER button cliqued");

                Intent i = new Intent(Legal_form.this, Id_name.class);
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
            startActivity(new Intent(Legal_form.this, Phone_success.class));
            return true;
        }

        return false;
    }
}
