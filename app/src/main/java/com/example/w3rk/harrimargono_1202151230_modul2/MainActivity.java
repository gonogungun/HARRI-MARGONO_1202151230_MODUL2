package com.example.w3rk.harrimargono_1202151230_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {



    private static final String TAG_ACTIVITY = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {

        final Intent i = new Intent(this,dineIn.class);
        final Intent o = new Intent(this,takeAway.class);


        // Is a button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.dinein:
                if (checked)
                    // Same day service
                    displayToast("Chosen" + getString(R.string.dine_in));
                    startActivity(i);
                break;
            case R.id.takeaway:
                if (checked)
                    // Next day delivery
                    displayToast("Chosen" + getString(R.string.take_away));
                    startActivity(o);
                break;

            default:
                Log.d(TAG_ACTIVITY,"onRadioButtonClicked: Nothing clicked.");
                break;
        }
    }

}
