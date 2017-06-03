package com.kumar.user.seekbarsampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    TextView niceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar= (SeekBar) findViewById(R.id.seekBar);
        niceText= (TextView) findViewById(R.id.niceTextView);
        niceText.setText("Niceness: " + seekBar.getProgress()+ "/" + seekBar.getMax());
  seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
      @Override
      public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
          niceText.setText("Niceness: " + progress+ "/" + seekBar.getMax());
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {
          Toast.makeText(MainActivity.this, "Start Tracking", Toast.LENGTH_SHORT).show();
      }

      @Override
      public void onStopTrackingTouch(SeekBar seekBar) {
          Toast.makeText(MainActivity.this, "Stop Tracking", Toast.LENGTH_SHORT).show();

      }
  });
    }
}
