package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "user";

    private TextView usernameOutput, nameOutput, ageOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameOutput = findViewById(R.id.text_username);
        nameOutput = findViewById(R.id.text_name);
        ageOutput = findViewById(R.id.text_age);


        Bundle extras = getIntent().getExtras();
        User user = extras.getParcelable("user");
        if (extras != null) {

            // TODO: display value here
            usernameOutput.setText(user.getUsername());
            nameOutput.setText(user.getName());
            ageOutput.setText(String.valueOf(user.getAge()));
        }
    }
}
