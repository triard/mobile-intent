package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "user";
    TextView usernameInput, nameInput, ageInput;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
        btnSubmit = (Button) findViewById(R.id.btn_submit);

//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = usernameInput.getText().toString();
//                String name = nameInput.getText().toString();
//                int age = Integer.parseInt(ageInput.getText().toString());
//
//                User user = new User(username, name, age);
//                Intent intent = new Intent(ParcelableActivity.this, ProfileParcelableActivity.class);
//                intent.putExtra(USER_KEY, user);
//                startActivity(intent);
//            }
//        });

    }

    public void handleSubmit2(View view) {
        String username = usernameInput.getText().toString();
        String name = nameInput.getText().toString();
        int age = Integer.parseInt(ageInput.getText().toString());

        User user = new User(username, name, age);
        Intent intent = new Intent(this, ProfileParcelableActivity.class);
        intent.putExtra("user", user);
        startActivity(intent);
    }
}