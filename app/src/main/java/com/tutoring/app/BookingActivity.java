package com.tutoring.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {

    private DatePicker datePicker;
    private TimePicker timePicker;
    private Button confirmBtn, cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        datePicker = findViewById(R.id.dp_date);
        timePicker = findViewById(R.id.tp_time);
        confirmBtn = findViewById(R.id.btn_confirm);
        cancelBtn = findViewById(R.id.btn_cancel);

        confirmBtn.setOnClickListener(v -> {
            String date = datePicker.getDayOfMonth() + "/" + (datePicker.getMonth() + 1) + "/" + datePicker.getYear();
            String time = timePicker.getHour() + ":" + String.format("%02d", timePicker.getMinute());
            Toast.makeText(this, "Session booked for " + date + " at " + time, Toast.LENGTH_SHORT).show();
            finish();
        });

        cancelBtn.setOnClickListener(v -> finish());
    }
}
