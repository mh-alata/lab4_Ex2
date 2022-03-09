package com.example.lab4_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player = new MediaPlayer();
    int status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = this.findViewById(R.id.button);
        TextView txt = this.findViewById(R.id.textView);

        btn.setTextColor(Color.WHITE);

        player = MediaPlayer.create(this, R.raw.azan);
        status=0;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(status==0){
                    player.start();
                    txt.setText(R.string.az_st);
                    status=1;
                }
                else{
                    player.pause();
                    txt.setText(R.string.az_pa);
                    status=0;
                }

            }
        });
    }
}