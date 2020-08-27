package studio.okaria.partyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ButtonSpinBottle = findViewById(R.id.spinbottle);
        ButtonSpinBottle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    openSpinBottle();
            }
        });
    }

    public void openSpinBottle(){
        Intent intent = new Intent(this,SpinBottleActivity.class);
        startActivity(intent);
    }
}
