package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Id_success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_success);

        //Get value information about user name
        final String name = getIntent().getStringExtra("NAME_RETRIEVED");

        final TextView nameTextView = (TextView) findViewById(R.id.Name);
        nameTextView.setText(name);

        final Button continueButton = (Button) findViewById(R.id.ContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO", "CONTINUE button cliqued");
                Intent i = new Intent(Id_success.this, Reserve_your_card.class);
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
            startActivity(new Intent(Id_success.this, Id_selfie.class));
            return true;
        }

        return false;
    }
}
