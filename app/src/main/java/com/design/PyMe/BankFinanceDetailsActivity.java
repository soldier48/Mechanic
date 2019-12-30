package com.design.PyMe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BankFinanceDetailsActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_finance_details);

        title = findViewById(R.id.title);
        title.setText("Bank Finance");
    }
}
