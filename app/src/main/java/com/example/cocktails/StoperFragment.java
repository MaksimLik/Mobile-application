package com.example.cocktails;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.content.res.Resources;


import android.support.v4.app.Fragment;


public class StoperFragment extends Fragment implements View.OnClickListener {
    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;
    private EditText timeEdit;

    private MediaPlayer mediaPlayer;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
    }


    private void runStoper(View view) {
        final TextView timeView = (TextView) view.findViewById(R.id.time_view);
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.signal);

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);

                if (running == true && seconds > 0){
                    if (seconds == 1){
                        mediaPlayer.start();
                    }
                    seconds--;
                }
                else {
                    running = false;
                }


                handler.postDelayed(this, 1000);
            }
        });
    }


    private void onClickStart() {
        running = true;
    }

    private void onClickStop() {
        running = false;
    }

    private void onClickReset() {
        running = false;
        seconds = 0;
    }


    // create a function to get a value from timeEdit and set it to seconds

//    private void onClicktime(){
//        running = true;
//        String time = timeEdit.getText().toString();
//        System.out.println(time);
//        seconds = Integer.parseInt(time);
//        System.out.println(seconds);
//        // clear a variable timeEdit
//        timeEdit.setText("");
//        time = timeEdit.getText().toString();
//        System.out.println(time);
//    }
    private void onClicktime() {
        String time = timeEdit.getText().toString();
        String[] timeArray = time.split(":");
        int hours = Integer.parseInt(timeArray[0]);
        int minutes = Integer.parseInt(timeArray[1]);
        int secs = Integer.parseInt(timeArray[2]);
        seconds = hours * 3600 + minutes * 60 + secs;
//        running = true;

    }





    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start_button:
                onClickStart();
                break;
            case R.id.stop_button:
                onClickStop();
                break;
            case R.id.reset_button:
                onClickReset();
                break;
            case R.id.accept_button:
                onClicktime();
                break;
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_stoper, container, false);
        timeEdit = (EditText) layout.findViewById(R.id.time_edit);

        runStoper(layout);
        Button startButton = (Button)layout.findViewById(R.id.start_button);
        startButton.setOnClickListener(this);
        Button stopButton = (Button)layout.findViewById(R.id.stop_button);
        stopButton.setOnClickListener(this);
        Button resetButton = (Button)layout.findViewById(R.id.reset_button);
        resetButton.setOnClickListener(this);
        Button acceptButton = layout.findViewById(R.id.accept_button);
        acceptButton.setOnClickListener(this);




        return layout;
    }

    @Override
    public void onPause() {
        super.onPause();
        wasRunning = running;
        running = false;
    }
    @Override
    public void onResume() {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }


}
