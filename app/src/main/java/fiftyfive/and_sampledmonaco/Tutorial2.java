package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Tutorial2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial2);


        final Button skipButton = (Button) findViewById(R.id.SkipButton);
        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "SKIP button cliqued");
                startActivity(new Intent(Tutorial2.this, Email_form.class));
                finish();
            }
        });

        final Button gotItButton = (Button) findViewById(R.id.GotIt);
        gotItButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "GOT IT button cliqued");
                startActivity(new Intent(Tutorial2.this, Tutorial3.class));
                finish();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("INFO", "SYSTEM BACK button cliqued");
            startActivity(new Intent(Tutorial2.this, Tutorial1.class));
            finish();
            return true;
        }

        return false;
    }

}
