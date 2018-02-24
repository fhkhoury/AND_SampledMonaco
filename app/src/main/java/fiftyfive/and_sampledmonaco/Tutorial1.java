package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Tutorial1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial1);


        final Button nextButton = (Button) findViewById(R.id.Next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "NEXT button cliked");
                startActivity(new Intent(Tutorial1.this, Tutorial2.class));
                finish();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Log.i("INFO", "SYSTEM BACK button cliqued");
            startActivity(new Intent(Tutorial1.this, Login.class));
            finish();
            return true;
        }

        return false;
    }
}
