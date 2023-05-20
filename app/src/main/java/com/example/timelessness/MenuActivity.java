package com.example.timelessness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.timelessness.databinding.MenuActivityBinding;

public class MenuActivity extends AppCompatActivity {
    private MenuActivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = MenuActivityBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        Button start = (Button) findViewById(R.id.startButton);
        binding.startButton.setOnClickListener(view -> {
            Intent startPrologue = new Intent(getApplicationContext(), PrologueActivity.class);
            startActivity(startPrologue);
        });
    }
}