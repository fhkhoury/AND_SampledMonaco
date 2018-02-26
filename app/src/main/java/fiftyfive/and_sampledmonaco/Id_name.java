package fiftyfive.and_sampledmonaco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Id_name extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id_name);

        final EditText nameField = (EditText) findViewById(R.id.name_field);

        Button nextButton = (Button) findViewById(R.id.NextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "NEXT button cliqued");

                String name = nameField.getText().toString();

                Intent i = new Intent(Id_name.this, Id_scan.class);
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
            startActivity(new Intent(Id_name.this, Legal_form.class));
            return true;
        }

        return false;
    }


}
