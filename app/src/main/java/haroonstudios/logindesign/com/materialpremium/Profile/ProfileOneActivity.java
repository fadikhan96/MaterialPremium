package haroonstudios.logindesign.com.materialpremium.Profile;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import haroonstudios.logindesign.com.materialpremium.R;


public class ProfileOneActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_one);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Profile Dashboard");
        setSupportActionBar(toolbar);
    }
}
