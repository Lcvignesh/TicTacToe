package com.example.tictactoe;

import android.app.Dialog;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game extends AppCompatActivity {

    Button b11,b12,b13,b21,b22,b23,b31,b32,b33;
    String ch,opt;
    int avail;
    ImageButton restart;
    Chronometer chronometer;
    boolean running;
    long pauseOffset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b21 = (Button) findViewById(R.id.button21);
        b22 = (Button) findViewById(R.id.button22);
        b23 = (Button) findViewById(R.id.button23);
        b31 = (Button) findViewById(R.id.button31);
        b32 = (Button) findViewById(R.id.button32);
        b33 = (Button) findViewById(R.id.button33);

        chronometer = (Chronometer) findViewById(R.id.chronometer);


        restart = (ImageButton) findViewById(R.id.imageButton6);

        startChronometer(chronometer);

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
            }
        });



        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) b11.getText();
                if(ch.equals("O")) {
                   Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                   toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    b11.setTextSize(35);
                    b11.setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        playComputer();
                        opt = "O";
                    }
                    checkwinner(opt);
                }
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) b12.getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    b12.setTextSize(35);
                    b12.setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        playComputer();
                        opt = "O";
                    }
                    checkwinner(opt);
                }
            }

        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ch = (String) b13.getText();
            if(ch.equals("O")) {
                Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                toast.show();}
            else if(ch.equals("X")) {
                Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                toast.show();
            }
            else
            {
                b13.setTextSize(35);
                b13.setText("X");
                opt = "X";
                checkwinner(opt);
                avail = checkavailability();
                if(avail>0) {
                    playComputer();
                    opt = "O";
                }
                checkwinner(opt);
            }
        }

        });


        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) b21.getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    b21.setTextSize(35);
                    b21.setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        playComputer();
                        opt = "O";
                    }
                    checkwinner(opt);
                }
            }

        });


        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) b22.getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    b22.setTextSize(35);
                    b22.setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        playComputer();
                        opt = "O";
                    }
                    checkwinner(opt);
                }
            }
        });


        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) b23.getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    b23.setTextSize(35);
                    b23.setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        playComputer();
                        opt = "O";
                    }
                    checkwinner(opt);
                }
            }
        });


        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) b31.getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    b31.setTextSize(35);
                    b31.setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        playComputer();
                        opt = "O";
                    }
                    checkwinner(opt);
                }
            }
        });

        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) b32.getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();

                }
                else
                {
                    b32.setTextSize(35);
                    b32.setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        playComputer();
                        opt = "O";
                    }
                    checkwinner(opt);
                }
            }
        });

        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {  ch = (String) b33.getText();
                if(ch.equals("O")) {
                Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                toast.show();}
                else if(ch.equals("X")) {
                Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                toast.show();
            }
                else
            {
                b33.setTextSize(35);
                b33.setText("X");
                opt = "X";
                checkwinner(opt);
                avail = checkavailability();
                if(avail>0) {
                    playComputer();
                    opt = "O";
                }
                checkwinner(opt);
            }
        }
        });




    }

    public void startChronometer(View view)
    {
        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime()-pauseOffset);
            chronometer.start();
            running = true;
        }
    }

    public void pauseChronometer(View view)
    {
        if(running){
            chronometer.stop();
            pauseOffset = SystemClock.elapsedRealtime()-chronometer.getBase();
            running = false;
            String pause = String.valueOf(pauseOffset);

            Toast.makeText(getApplicationContext()," "+pause,Toast.LENGTH_SHORT).show();
        }

    }

    public void resetChronometer(View view)
    {
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
    }


    public void playComputer()
    {
        int i=0,j=0,k,check=0,v;
        String s ;
        Random rand = new Random();
        i = rand.nextInt(3)+1;
        j = rand.nextInt(3)+1;

        k = j+(i*10);

       v = checkavailability();
        if(v<9) {
            switch (k) {
                case 11:
                    s = (String) b11.getText();
                    if (!s.equals("X"))
                        if (!s.equals("O")) {
                            b11.setTextSize(35);
                            b11.setText("O");
                            check = 1;
                        }

                    break;

                case 12:
                    s = (String) b12.getText();
                    if (!s.equals("X"))
                        if (!s.equals("O")) {
                            b12.setTextSize(35);
                            b12.setText("O");
                            check = 1;
                        }
                    break;


                case 13:
                    s = (String) b13.getText();
                    if (!s.equals("X"))
                        if (!s.equals("O")) {
                            b13.setTextSize(35);
                            b13.setText("O");
                            check = 1;
                        }
                    break;


                case 21:
                    s = (String) b21.getText();
                    if (!s.equals("X"))
                        if (!s.equals("O")) {
                            b21.setTextSize(35);
                            b21.setText("O");
                            check = 1;
                        }
                    break;


                case 22:
                    s = (String) b22.getText();
                    if (!s.equals("X"))
                        if (!s.equals("O")) {
                            b22.setTextSize(35);
                            b22.setText("O");
                            check = 1;
                        }
                    break;

                case 23:
                    s = (String) b23.getText();
                    if (!s.equals("X"))
                        if (!s.equals("O")) {
                            b23.setTextSize(35);
                            b23.setText("O");
                            check = 1;
                        }
                    break;

                case 31:
                    s = (String) b31.getText();
                    if (!s.equals("X"))
                        if (!s.equals("O")) {
                            b31.setTextSize(35);
                            b31.setText("O");
                            check = 1;
                        }
                    break;

                case 32:
                    s = (String) b32.getText();
                    if (!s.equals("X"))
                        if (!s.equals("O")) {
                            b32.setTextSize(35);
                            b32.setText("O");
                            check = 1;
                        }
                    break;

                case 33:
                    s = (String) b33.getText();
                    if (!s.equals("X"))
                        if (!s.equals("O")) {
                            b33.setTextSize(35);
                            b33.setText("O");
                            check = 1;
                        }
                    break;
            }

            if(check==0)
            {
                playComputer();
            }
        }

    }

    public int checkavailability()
    {
        String s ;
        int c = 0;
        s = (String) b11.getText();
        if(!s.equals("X"))
            if (!s.equals("O"))
            {
                c++;
            }

        s = (String) b12.getText();
        if(!s.equals("X"))
            if (!s.equals("O"))
            {
                c++;
            }

        s = (String) b13.getText();
        if(!s.equals("X"))
            if (!s.equals("O"))
            {
                c++;
            }
        s = (String) b21.getText();
        if(!s.equals("X"))
            if (!s.equals("O"))
            {
                c++;
            }

        s = (String) b22.getText();
        if(!s.equals("X"))
            if (!s.equals("O"))
            {
                c++;
            }

        s = (String) b23.getText();
        if(!s.equals("X"))
            if (!s.equals("O"))
            {
                c++;
            }

        s = (String) b31.getText();
        if(!s.equals("X"))
            if (!s.equals("O"))
            {
                c++;
            }

        s = (String) b32.getText();
        if(!s.equals("X"))
            if (!s.equals("O"))
            {
                c++;
            }

        s = (String) b33.getText();
        if(!s.equals("X"))
            if (!s.equals("O"))
            {
                c++;
            }

        return c;
    }

    public void checkwinner(String string)
    {
        String a,b,c,d,e,f,g,h,i;

        a = (String) b11.getText();
        b = (String) b12.getText();
        c = (String) b13.getText();
        d = (String) b21.getText();
        e = (String) b22.getText();
        f = (String) b23.getText();
        g = (String) b31.getText();
        h = (String) b32.getText();
        i = (String) b33.getText();

        if(comp(a,b,c,string))
        {
          Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+a, Toast.LENGTH_SHORT);
          toast.show();
          restart();
        }

        else if(comp(d,e,f,string))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+d, Toast.LENGTH_SHORT);
            toast.show();
            restart();
        }

        else if(comp(g,h,i,string))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+g, Toast.LENGTH_SHORT);
            toast.show();
            restart();

        }

        else if(comp(a,e,i,string))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+a, Toast.LENGTH_SHORT);
            toast.show();
            restart();
        }

        else if(comp(c,e,g,string))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+c, Toast.LENGTH_SHORT);
            toast.show();
            restart();
        }

        else if(comp(a,d,g,string))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+a, Toast.LENGTH_SHORT);
            toast.show();
            restart();
        }

        else if(comp(e,b,h,string))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+e, Toast.LENGTH_SHORT);
            toast.show();
            restart();
        }

        else if(comp(i,f,c,string))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+i, Toast.LENGTH_SHORT);
            toast.show();
            restart();
        }

        else
        {
            int r;
            r = checkavailability();
            if(r==0)
            {
                Toast toast = Toast.makeText(getApplicationContext(),"DRAWN",Toast.LENGTH_SHORT);
                toast.show();
                restart();
            }
        }

    }

    public boolean comp(String a, String b, String c,String string)
    {

        if(a.equals(string))
            if (b.equals(string))
                if (c.equals(string))
                {
                    return true;
                }


        return false;
    }

    public void restart()
    {

        b11.setText(" ");
        b12.setText(" ");
        b13.setText(" ");
        b21.setText(" ");
        b22.setText(" ");
        b23.setText(" ");
        b31.setText(" ");
        b32.setText(" ");
        b33.setText(" ");
        pauseChronometer(chronometer);
        resetChronometer(chronometer);

    }
}