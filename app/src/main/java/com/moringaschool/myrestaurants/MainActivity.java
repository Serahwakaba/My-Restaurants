package com.moringaschool.myrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    //using findviewbyid
//    public static final String TAG = MainActivity.class.getSimpleName();
//    private Button mFindRestaurantsButton;
//    private EditText mLocationEditText;
    //using butterknife
    @BindView(R.id.findRestaurantsButton) Button mFindRestaurantsButton;
    @BindView(R.id.locationEditText) EditText mLocationEditText;
//    @BindView(R.id.appNameTextView) TextView mAppNameTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        mLocationEditText = (EditText) findViewById(R.id.locationEditText);
//        mFindRestaurantsButton = (Button)findViewById(R.id.findRestaurantsButton);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
//              Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
//                Intent intent = getIntent();
//                String location = intent.getStringExtra("location");
                String location = mLocationEditText.getText().toString();
//                Log.d(TAG, location);
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                intent.putExtra("location", location);
                startActivity(intent);
                Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();
            }
        });
    }
}