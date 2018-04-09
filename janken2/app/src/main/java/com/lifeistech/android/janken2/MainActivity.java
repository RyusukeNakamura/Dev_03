package com.lifeistech.android.janken2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int num;
    ImageView cpu;
    TextView player, result, match;
    int win = 0;
    int lose=0;
    int gameNum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cpu = (ImageView) findViewById(R.id.cpu);
        player = (TextView) findViewById(R.id.player);
        result = (TextView) findViewById(R.id.result);
        match = (TextView) findViewById(R.id.match);
    }

    public void gu(View v) {
        player.setText("あなたの手はグーです");

        Log.d("test", v.toString());

        Random r = new Random();
        num = r.nextInt(3);
        if (num == 0) {
            cpu.setImageResource(R.drawable.gu);
            //cpu.setText("相手の手はグーです");
            result.setTextColor(Color.BLACK);
            result.setText("引き分けです");
        } else if (num == 1) {
            cpu.setImageResource(R.drawable.choki);
            //cpu.setText("相手の手はチョキです");
            result.setTextColor(Color.RED);
            result.setText("あなたの勝ちです");
            win++;
        } else {
            cpu.setImageResource(R.drawable.pa);
            //cpu.setText("相手の手はパーです");
            result.setTextColor(Color.BLUE);
            result.setText("あなたの負けです");
            lose++;
        }
        match.setText(String.valueOf(win+"勝"+lose)+"敗");
    }

    public void choki(View v) {
        player.setText("あなたの手はチョキです");
        Random r = new Random();
        num = r.nextInt(3);
        if (num == 0) {
            cpu.setImageResource(R.drawable.gu);
            //cpu.setText("相手の手はグーです");
            result.setTextColor(Color.BLUE);
            result.setText("あなたの負けです");
            lose++;
        } else if (num == 1) {
            cpu.setImageResource(R.drawable.choki);
            //cpu.setText("相手の手はチョキです");
            result.setTextColor(Color.BLACK);
            result.setText("引き分けです");
        } else {
            cpu.setImageResource(R.drawable.pa);
            //cpu.setText("相手の手はパーです");
            result.setTextColor(Color.RED);
            result.setText("あなたの勝ちです");
            win++;
        }
        match.setText(String.valueOf(win+"勝"+lose)+"敗");
    }

    public void pa(View v) {
        player.setText("あなたの手はパーです");
        Random r = new Random();
        num = r.nextInt(3);
        if (num == 0) {
            cpu.setImageResource(R.drawable.gu);
            //cpu.setText("相手の手はグーです");
            result.setTextColor(Color.RED);
            result.setText("あなたの勝ちです");
            win++;
        } else if (num == 1) {
            cpu.setImageResource(R.drawable.choki);
            //cpu.setText("相手の手はチョキです");
            result.setTextColor(Color.BLUE);
            result.setText("あなたの負けです");
            lose++;
        } else {
            cpu.setImageResource(R.drawable.pa);
            //cpu.setText("相手の手はパーです");
            result.setTextColor(Color.BLACK);
            result.setText("引き分けです");
        }
        match.setText(String.valueOf(win+"勝"+lose)+"敗");
    }
}
