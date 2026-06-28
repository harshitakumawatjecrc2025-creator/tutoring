package com.tutoring.app;

import android.os.Bundle;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TutorListActivity extends AppCompatActivity {

    private RecyclerView tutorListRecyclerView;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_list);

        tutorListRecyclerView = findViewById(R.id.rv_tutor_list);
        searchView = findViewById(R.id.sv_search);

        tutorListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // TODO: Implement search functionality
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // TODO: Implement real-time search
                return false;
            }
        });
    }
}
