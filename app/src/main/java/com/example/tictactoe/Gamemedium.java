package com.example.tictactoe;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

import static java.lang.StrictMath.max;
import static java.lang.StrictMath.min;

public class Gamemedium extends AppCompatActivity {

    final Button[][] button = new Button[3][3];
    String ch,opt;
    int avail;
    int randx,randy;
    ImageButton restart;
    Chronometer chronometer;
    boolean running;
    long pauseOffset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        button[0][0] = (Button) findViewById(R.id.button11);
        button[0][1] = (Button) findViewById(R.id.button12);
        button[0][2] = (Button) findViewById(R.id.button13);
        button[1][0] = (Button) findViewById(R.id.button21);
        button[1][1] = (Button) findViewById(R.id.button22);
        button[1][2] = (Button) findViewById(R.id.button23);
        button[2][0] = (Button) findViewById(R.id.button31);
        button[2][1] = (Button) findViewById(R.id.button32);
        button[2][2] = (Button) findViewById(R.id.button33);

        chronometer = (Chronometer) findViewById(R.id.chronometer);


        restart = (ImageButton) findViewById(R.id.imageButton6);

        startChronometer(chronometer);

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
            }
        });



        button[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) button[0][0].getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    button[0][0].setTextSize(35);
                    button[0][0].setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        computermove();
                    }
                    opt = "O";
                    checkwinner(opt);
                }
            }
        });

        button[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) button[0][1].getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    button[0][1].setTextSize(35);
                    button[0][1].setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        computermove();
                    }
                    opt = "O";
                    checkwinner(opt);
                }
            }
        });


        button[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) button[0][2].getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    button[0][2].setTextSize(35);
                    button[0][2].setText("X");
                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        computermove();
                    }
                    opt = "O";
                    checkwinner(opt);
                }
            }
        });

        button[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) button[1][0].getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    button[1][0].setTextSize(35);
                    button[1][0].setText("X");

                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        computermove();
                    }
                    opt = "O";
                    checkwinner(opt);
                }
            }
        });

        button[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) button[1][1].getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    button[1][1].setTextSize(35);
                    button[1][1].setText("X");

                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        computermove();
                    }
                    opt = "O";
                    checkwinner(opt);
                }
            }
        });

        button[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) button[1][2].getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    button[1][2].setTextSize(35);
                    button[1][2].setText("X");

                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        computermove();
                    }
                    opt = "O";
                    checkwinner(opt);
                }
            }
        });

        button[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) button[2][0].getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    button[2][0].setTextSize(35);
                    button[2][0].setText("X");

                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        computermove();
                    }
                    opt = "O";
                    checkwinner(opt);
                }
            }
        });

        button[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) button[2][1].getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    button[2][1].setTextSize(35);
                    button[2][1].setText("X");

                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        computermove();
                    }
                    opt = "O";
                    checkwinner(opt);
                }
            }
        });

        button[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch = (String) button[2][2].getText();
                if(ch.equals("O")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY COMPUTER",Toast.LENGTH_SHORT);
                    toast.show();}
                else if(ch.equals("X")) {
                    Toast toast = Toast.makeText(getApplicationContext(),"ALREADY FILLED BY YOU",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                {
                    button[2][2].setTextSize(35);
                    button[2][2].setText("X");

                    opt = "X";
                    checkwinner(opt);
                    avail = checkavailability();
                    if(avail>0) {
                        computermove();
                    }
                    opt = "O";
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

    public void computermove()
    {


        int bestMove = findBestMove(board());

        if(bestMove == 0)
        {
            button[0][0].setTextSize(35);
            button[0][0].setText("O");
        }

        if(bestMove == 1)
        {
            button[0][1].setTextSize(35);
            button[0][1].setText("O");
        }

        if(bestMove == 2)
        {
            button[0][2].setTextSize(35);
            button[0][2].setText("O");
        }

        if(bestMove == 3)
        {
            button[1][0].setTextSize(35);
            button[1][0].setText("O");
        }

        if(bestMove == 4)
        {
            button[1][1].setTextSize(35);
            button[1][1].setText("O");
        }

        if(bestMove == 5)
        {
            button[1][2].setTextSize(35);
            button[1][2].setText("O");
        }

        if(bestMove == 6)
        {
            button[2][0].setTextSize(35);
            button[2][0].setText("O");
        }

        if(bestMove == 7)
        {
            button[2][1].setTextSize(35);
            button[2][1].setText("O");
        }

        if(bestMove == 8)
        {
            button[2][2].setTextSize(35);
            button[2][2].setText("O");
        }

    }

    public int terminalstate(String []board)
    {
        int r;
        r = checkavailability();
        if(r==0)
            return 0;
        if(checkarraywin("X",board))
        {
            return -10;
        }

        if(checkarraywin("O",board))
        {
            return 10;
        }

        return -1;
    }

    public int minmax(String[] board, int depth, boolean player)
    {

        int score = terminalstate(board());

        if(score == 10)
            return score-depth;
        if(score == -10)
            return depth-score;
        if(score == 0)
            return score;



        if(player)
        {
            int best = -1000;
            for(int i =0;i < 9;i++)
            {
                if(!board[i].equals("X")&&!board[i].equals("O"))
                {
                    board[i] = "O";
                    best = max(best,minmax(board,depth+1,!player));
                    board[i] = " ";
                }
            }
            return best;
        }

        else
        {
            int best = 1000;
            for(int i = 0;i < 9;i++)
            {
                if(!board[i].equals("X")&&!board[i].equals("O"))
                {
                    board[i] = "X";
                    best = min(best,minmax(board,depth+1,!player));
                    board[i] = " ";
                }
            }
            return best;
        }
    }

    public int findBestMove(String []board)
    {
        int bestVal = -1000;
        int bestMove = -1 ;

        for(int i =0;i < 9;i++)
        {
            if(!board[i].equals("X")&&!board[i].equals("O"))
            {
                board[i] = "O";

                int moveVal = minmax(board,0,true);

                board[i] = " ";

                if(moveVal > bestVal)
                {
                    bestMove = i;
                }
            }
        }

        return bestMove;
    }

    public boolean checkarraywin(String string,String []board)
    {


        if(comp(board[0],board[1],board[2],string))
        {
            return true;
        }

        if(comp(board[3],board[4],board[5],string))
        {
            return true;
        }

        if(comp(board[6],board[7],board[8],string))
        {
            return true;
        }

        if(comp(board[0],board[3],board[6],string))
        {
            return true;
        }

        if(comp(board[1],board[4],board[7],string))
        {
            return true;
        }

        if(comp(board[2],board[5],board[8],string))
        {
            return true;
        }

        if(comp(board[0],board[4],board[8],string))
        {
            return true;
        }


        if(comp(board[2],board[4],board[6],string))
        {
            return true;
        }

        return false;
    }


    public String[] board()
    {
        int k = 0;
        String[] board = new String[9];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                board[k++]=(String)button[i][j].getText();
            }
        }

        return board;

    }

    public int checkavailability()
    {
        String s ;
        int c = 0;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                s = (String) button[i][j].getText();
                if(s.equals("X") || s.equals("O"))
                    c++;
            }
        }
        return c;
    }

    public boolean checkwinner(String string)
    {
      for(int i = 0;i < 3;i++)
      {
          if(comp((String)button[i][0].getText(),(String)button[i][1].getText(),(String)button[i][2].getText(),string))
          {
              Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+string, Toast.LENGTH_SHORT);
              toast.show();
              restart();
              return true;
          }
      }

        for(int i = 0;i < 3;i++)
        {
            if(comp((String)button[0][i].getText(),(String)button[1][i].getText(),(String)button[2][i].getText(),string))
            {
                Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+string, Toast.LENGTH_SHORT);
                toast.show();
                restart();
                return true;
            }
        }

        if(comp((String)button[0][0].getText(),(String)button[1][1].getText(),(String)button[2][2].getText(),string))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+string, Toast.LENGTH_SHORT);
            toast.show();
            restart();
            return true;
        }

        if(comp((String)button[0][2].getText(),(String)button[1][1].getText(),(String)button[2][0].getText(),string))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "WINNER IS "+string, Toast.LENGTH_SHORT);
            toast.show();
            restart();
            return true;
        }

       return false;

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

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                button[i][j].setText(" ");
            }
        }
        pauseChronometer(chronometer);
        resetChronometer(chronometer);
    }

}
