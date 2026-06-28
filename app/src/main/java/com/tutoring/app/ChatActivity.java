package com.tutoring.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ChatActivity extends AppCompatActivity {

    private RecyclerView messageRecyclerView;
    private EditText messageInput;
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        messageRecyclerView = findViewById(R.id.rv_messages);
        messageInput = findViewById(R.id.et_message);
        sendBtn = findViewById(R.id.btn_send);

        messageRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        sendBtn.setOnClickListener(v -> {
            String message = messageInput.getText().toString().trim();
            if (!message.isEmpty()) {
                // TODO: Send message logic
                messageInput.setText("");
            }
        });
    }
}
