package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "user";

    private TextView usernameInput, nameInput, ageInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameInput = findViewById(R.id.text_username);
        nameInput = findViewById(R.id.text_name);
        ageInput = findViewById(R.id.text_age);


        Bundle extras = getIntent().getExtras();
        User user = extras.getParcelable(USER_KEY);
        if (extras != null) {

            // TODO: display value here
            usernameInput.setText(user.getUsername());
            nameInput.setText(user.getName());
            ageInput.setText(user.getAge());
        }
    }
}
