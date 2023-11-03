package com.example.coustom_toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v;
        Toast t;
        AppCompatButton b;
        TextView tv;

        b = findViewById(R.id.b);
        t = new Toast(getApplicationContext());
        v = getLayoutInflater().inflate(R.layout.coustom_toast ,(ViewGroup) findViewById(R.id.ll1));
        tv = v.findViewById(R.id.txtv);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t.setView(v);
//                t.setGravity(Gravity.TOP|Gravity.RIGHT,0,0);
                t.setGravity(Gravity.BOTTOM,20,50);
                tv.setText("Single Line");
                t.setDuration(Toast.LENGTH_LONG);
                t.show();



            }
        });

    }
}