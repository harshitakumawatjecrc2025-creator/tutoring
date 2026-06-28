package com.tutoring.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private ImageView profileImage;
    private EditText nameInput, emailInput, bioInput;
    private Button editBtn, saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profileImage = findViewById(R.id.iv_profile_image);
        nameInput = findViewById(R.id.et_name);
        emailInput = findViewById(R.id.et_email);
        bioInput = findViewById(R.id.et_bio);
        editBtn = findViewById(R.id.btn_edit);
        saveBtn = findViewById(R.id.btn_save);

        editBtn.setOnClickListener(v -> enableEditing());
        saveBtn.setOnClickListener(v -> saveProfile());
    }

    private void enableEditing() {
        nameInput.setEnabled(true);
        bioInput.setEnabled(true);
        editBtn.setVisibility(android.view.View.GONE);
        saveBtn.setVisibility(android.view.View.VISIBLE);
    }

    private void saveProfile() {
        // TODO: Save profile changes
        Toast.makeText(this, "Profile updated", Toast.LENGTH_SHORT).show();
        nameInput.setEnabled(false);
        bioInput.setEnabled(false);
        editBtn.setVisibility(android.view.View.VISIBLE);
        saveBtn.setVisibility(android.view.View.GONE);
    }
}
