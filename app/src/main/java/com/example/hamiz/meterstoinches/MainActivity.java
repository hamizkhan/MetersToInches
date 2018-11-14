package com.example.hamiz.meterstoinches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView=(ImageView)findViewById(R.id.metersImageViewID);
        final EditText editText=(EditText)findViewById((R.id.metersEditTextID));
        Button button=(Button)findViewById(R.id.convertID);
        final TextView textView=(TextView)findViewById(R.id.resultID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                double result;

                text=editText.getText().toString();

                result=Double.parseDouble(text)*39.37;

                textView.setTextSize(30);
                textView.setText(String.format("%.2f inches",result));
                editText.setText("");

            }
        });




    }
}
