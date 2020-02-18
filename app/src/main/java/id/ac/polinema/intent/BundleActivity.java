package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";


    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);

        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
        btnSubmit = findViewById(R.id.btn_submit);

//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = usernameInput.getText().toString();
//                String name = nameInput.getText().toString();
//                int age = Integer.parseInt(ageInput.getText().toString());
//
//                Intent intent = new Intent(BundleActivity.this, ProfileBundleActivity.class);
//                intent.putExtra(USERNAME_KEY, username);
//                intent.putExtra(NAME_KEY, name);
//                intent.putExtra(AGE_KEY, age);
//                startActivity(intent);
//            }
//        });

    }

    public void handleSubmit(View view) {
                String username = usernameInput.getText().toString();
                String name = nameInput.getText().toString();
                int age = Integer.parseInt(ageInput.getText().toString());

                Intent intent = new Intent(BundleActivity.this, ProfileBundleActivity.class);
                intent.putExtra(USERNAME_KEY, username);
                intent.putExtra(NAME_KEY, name);
                intent.putExtra(AGE_KEY, age);
                startActivity(intent);
    }
}
