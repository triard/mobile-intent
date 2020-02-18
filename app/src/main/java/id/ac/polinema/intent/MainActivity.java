package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleExplicitIntent(View view) {
        Intent intent = new Intent(this, ExplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleImplicit(View view) {
        Intent intent = new Intent(this, ImplicitIntentActivity.class);
        startActivity(intent);
    }

    public void handleBundle(View view) {
        startActivity(new Intent(this, BundleActivity.class));
    }

    public void handleExit(View view) {
        finish();
    }

    public void handleSubmit(View view) {
        Intent intent = new Intent(this, ParcelableActivity.class);
        startActivity(intent);
    }
}
