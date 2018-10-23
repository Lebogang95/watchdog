package za.co.lbnkosi.watchdog.ui.navigationBar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import za.co.lbnkosi.watchdog.MainActivity;
import za.co.lbnkosi.watchdog.R;


public class SettingsActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }

        ImageView backImageView = findViewById(R.id.backicon);
        backImageView.setOnClickListener(v->{
            startActivity(new Intent(SettingsActivity.this, MainActivity.class));
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
            finish();
        });

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(SettingsActivity.this, MainActivity.class));
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        finish();
    }
}
