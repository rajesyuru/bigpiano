package com.rajes.bigpiano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonC = findViewById(R.id.C);
        Button buttonD = findViewById(R.id.D);
        Button buttonE = findViewById(R.id.E);
        Button buttonF = findViewById(R.id.F);
        Button buttonG = findViewById(R.id.G);
        Button buttonA = findViewById(R.id.A);
        Button buttonB = findViewById(R.id.B);

        final SoundPool pianosounds = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);

        final int NoteC = pianosounds.load(getApplicationContext(), R.raw.note1_c, 1);
        final int NoteD = pianosounds.load(getApplicationContext(), R.raw.note2_d, 1);
        final int NoteE = pianosounds.load(getApplicationContext(), R.raw.note3_e, 1);
        final int NoteF = pianosounds.load(getApplicationContext(), R.raw.note4_f, 1);
        final int NoteG = pianosounds.load(getApplicationContext(), R.raw.note5_g, 1);
        final int NoteA = pianosounds.load(getApplicationContext(), R.raw.note6_a, 1);
        final int NoteB = pianosounds.load(getApplicationContext(), R.raw.note7_b, 1);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pianosounds.play(NoteC, 1f, 1f, 1, 0, 1);
            }
        });
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pianosounds.play(NoteD, 1f, 1f, 1, 0, 1);
            }
        });
        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pianosounds.play(NoteE, 1f, 1f, 1, 0, 1);
            }
        });
        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pianosounds.play(NoteF, 1f, 1f, 1, 0, 1);
            }
        });
        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pianosounds.play(NoteG, 1f, 1f, 1, 0, 1);
            }
        });
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pianosounds.play(NoteA, 1f, 1f, 1, 0, 1);
            }
        });
        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pianosounds.play(NoteB, 1f, 1f, 1, 0, 1);
            }
        });

    }
}
