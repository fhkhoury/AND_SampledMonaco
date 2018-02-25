package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Id_scan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_scan);

        //Get value information about user name
        final String name = getIntent().getStringExtra("NAME_RETRIEVED");

        final Button continueButton = (Button) findViewById(R.id.ContinueButton);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "CONTINUE button cliqued");

                Intent i = new Intent(Id_scan.this, Id_selfie.class);
                i.putExtra("NAME_RETRIEVED", name);
                startActivity(i);

            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("INFO", "SYSTEM BACK button cliqued");
            startActivity(new Intent(Id_scan.this, Id_name.class));
            return true;
        }

        return false;
    }
}
