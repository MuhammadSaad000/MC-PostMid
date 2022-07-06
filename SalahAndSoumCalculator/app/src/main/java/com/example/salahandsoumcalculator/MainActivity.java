package com.example.salahandsoumcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText days;
    TextView amount;

    RadioGroup radioGroup;
    RadioButton salahBtn,siyamBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        days = (EditText)findViewById(R.id.noOfDays);
        amount = (TextView) findViewById(R.id.totalAmount);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        //making amount readable only

        amount.setEnabled(false);
        days.setOnEditorActionListener(editorActionListener);

        salahBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String d = days.getText().toString();
                int finalDays = Integer.parseInt(d);
                int amnt = finalDays*6*190;
                amount.setText("Rs. "+  amnt);

            }
        });


    }

    private TextView.OnEditorActionListener editorActionListener = new TextView.OnEditorActionListener() {
        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            v.clearFocus();
            radioGroup.requestFocus();
            return false;
        }
    };

}