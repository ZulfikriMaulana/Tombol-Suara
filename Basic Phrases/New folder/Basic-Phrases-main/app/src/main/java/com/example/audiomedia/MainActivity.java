package com.example.audiomedia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }

    public void caraBaca(View view)
    {
        int id = view.getId();
        String semuaId = "";
        semuaId = view.getResources().getResourceEntryName(id);

        int resource = getResources().getIdentifier(semuaId,"raw","com.example.audiomedia");

        MediaPlayer sound = MediaPlayer.create(this, resource);
        sound.start();

        sound.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                sound.release();
            }
        });


    }

}