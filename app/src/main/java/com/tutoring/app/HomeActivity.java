package com.tutoring.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView tutorRecyclerView;
    private Button browseBtn, messageBtn, profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tutorRecyclerView = findViewById(R.id.rv_tutors);
        browseBtn = findViewById(R.id.btn_browse);
        messageBtn = findViewById(R.id.btn_messages);
        profileBtn = findViewById(R.id.btn_profile);

        tutorRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        browseBtn.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, TutorListActivity.class);
            startActivity(intent);
        });

        messageBtn.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ChatActivity.class);
            startActivity(intent);
        });

        profileBtn.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });
    }
}
