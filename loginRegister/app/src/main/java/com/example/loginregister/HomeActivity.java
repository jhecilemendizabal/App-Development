package com.example.loginregister;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button bPF;
    Button bLM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_home);
        getSupportActionBar().setTitle("Identikard");

        bPF = findViewById (R.id.ButtonPF);
        bLM = findViewById (R.id.ButtonLM);

        bPF.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent moveToPropertyFinder = new Intent (HomeActivity.this, Profile.class);
                startActivity (moveToPropertyFinder);

                bLM.setOnClickListener (new View.OnClickListener () {
                    @Override
                    public void onClick(View view) {
                        Intent moveToLocationMap = new Intent (HomeActivity.this, Passbook.class);
                        startActivity (moveToLocationMap);

                    }
                });
            }
        });
    }
}