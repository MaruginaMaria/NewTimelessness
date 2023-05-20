package com.example.timelessness;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.timelessness.databinding.PrologueActivityBinding;

public class PrologueActivity extends AppCompatActivity {
private PrologueActivityBinding binding;
    int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = PrologueActivityBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        ImageButton backBlack = (ImageButton)findViewById(R.id.black);
        ImageButton home1 = (ImageButton)findViewById(R.id.home1);
        View txtWindow = (View)findViewById(R.id.txtWindow);
        TextView txtWords = (TextView) findViewById(R.id.words);
        TextView txtPerson = (TextView) findViewById(R.id.person);
binding.black.setOnClickListener(view -> {
    n++;
    switch (n){
        case 1:
            ObjectAnimator alphaBlack = ObjectAnimator.ofFloat(
                    findViewById(R.id.txtWindow),
                    "alpha",
                    0.0f,
                    1f
            );
            alphaBlack.setDuration(1000);
            alphaBlack.setInterpolator(new LinearInterpolator());
            alphaBlack.start();
            txtPerson.setText("???");
            txtWords.setText("это проект");
            break;
        case 2:
            txtPerson.setText("???");
            txtWords.setText("ура");
            break;
        case 3:
            txtPerson.setText("???");
            txtWords.setText("тяжело(");
            break;
        case 4:
            ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(
                    findViewById(R.id.black),
                    "alpha",
                    1.0f,
                    0.0f
            );
            alphaAnim.setDuration(1000);
            alphaAnim.setInterpolator(new LinearInterpolator());
            alphaAnim.start();
        case 5:
            txtPerson.setText("???");
            txtWords.setText("еще нажатие");
            break;
        case 6:
            txtWords.setText(null);
            home1.setImageResource(R.drawable.zayats);
            break;
        case 7:
            txtWords.setText(null);
            home1.setImageDrawable(null);
            txtWindow.setBackgroundDrawable(null);
            break;
    }

});
    }
}