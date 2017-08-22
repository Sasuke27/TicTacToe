package khentarjiel.cabural.com.example.khent.tictactoeapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Arrays;


public class TicTacToeAppMainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int NextTurn = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe_app_main);



        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);





        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn1.getText().toString().equals("")) {
                    if (NextTurn == 1) {
                        NextTurn = 2;
                        btn1.setText("X");

                    } else if (NextTurn == 2) {
                        NextTurn = 1;
                        btn1.setText("O");

                    }
                }
                winOrlose();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn2.getText().toString().equals("")) {
                    if (NextTurn == 1) {
                        NextTurn = 2;
                        btn2.setText("X");

                    } else if (NextTurn == 2) {
                        NextTurn = 1;
                        btn2.setText("O");

                    }
                }
                winOrlose();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn3.getText().toString().equals("")) {
                    if (NextTurn == 1) {
                        NextTurn = 2;
                        btn3.setText("X");

                    } else if (NextTurn == 2) {
                        NextTurn = 1;
                        btn3.setText("O");

                    }

                }
                winOrlose();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn4.getText().toString().equals("")) {
                    if (NextTurn == 1) {
                        NextTurn = 2;
                        btn4.setText("X");

                    } else if (NextTurn == 2) {
                        NextTurn = 1;
                        btn4.setText("O");

                    }
                }
                winOrlose();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn5.getText().toString().equals("")) {
                    if (NextTurn == 1) {
                        NextTurn = 2;
                        btn5.setText("X");

                    } else if (NextTurn == 2) {
                        NextTurn = 1;
                        btn5.setText("O");

                    }
                }
                winOrlose();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn6.getText().toString().equals("")) {
                    if (NextTurn == 1) {
                        NextTurn = 2;
                        btn6.setText("X");

                    } else if (NextTurn == 2) {
                        NextTurn = 1;
                        btn6.setText("O");

                    }
                }
                winOrlose();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn7.getText().toString().equals("")) {
                    if (NextTurn == 1) {
                        NextTurn = 2;
                        btn7.setText("X");

                    } else if (NextTurn == 2) {
                        NextTurn = 1;
                        btn7.setText("O");

                    }
                }
                winOrlose();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn8.getText().toString().equals("")) {
                    if (NextTurn == 1) {
                        NextTurn = 2;
                        btn8.setText("X");

                    } else if (NextTurn == 2) {
                        NextTurn = 1;
                        btn8.setText("O");

                    }
                }
                winOrlose();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn9.getText().toString().equals("")) {
                    if (NextTurn == 1) {
                        NextTurn = 2;
                        btn9.setText("X");

                    } else if (NextTurn == 2) {
                        NextTurn = 1;
                        btn9.setText("O");

                    }
                }
                winOrlose();
            }
        });

    }


    public void winOrlose() {

        String a, b, c, d, e, f, g, h, i;
        int end = 0;

        a = btn1.getText().toString();
        b = btn2.getText().toString();
        c = btn3.getText().toString();
        d = btn4.getText().toString();
        e = btn5.getText().toString();
        f = btn6.getText().toString();
        g = btn7.getText().toString();
        h = btn8.getText().toString();
        i = btn9.getText().toString();

        if(!a.isEmpty() && !b.isEmpty() && !c.isEmpty() && !d.isEmpty()
                && !e.isEmpty() && !f.isEmpty() && !g.isEmpty() && !h.isEmpty() && !i.isEmpty()){
            end = 3;
        }

        if (a.trim().equals("X") && b.trim().equals("X") && c.trim().equals("X")){
            end = 1;
        } else if (a.equals("X") && d.equals("X") && g.equals("X")){
            end = 1;
        } else if (a.equals("X") && i.equals("X") && e.equals("X")){
            end = 1;
        } else if (a.equals("O") && b.equals("O") && c.equals("O")){
            end = 2;
        } else if (a.equals("O") && d.equals("O") && g.equals("O")){
            end = 2;
        } else if (a.equals("O") && e.equals("O") && i.equals("O")){
            end = 2;
        } else if (d.equals("X") && e.equals("X") && f.equals("X")){
            end = 1;
        } else if (g.equals("X") && h.equals("X") && i.equals("X")){
            end = 1;
        } else if (d.equals("O") && e.equals("O") && f.equals("O")){
            end = 2;
        } else if (g.equals("O") && h.equals("O") && i.equals("O")) {
            end = 2;
        } else if (b.equals("X") && e.equals("X") && h.equals("X")){
            end = 1;
        } else if (b.equals("O") && e.equals("O") && h.equals("O")) {
            end = 2;
        } else if (c.equals("X") && e.equals("X") && g.equals("X")){
            end = 1;
        } else if (c.equals("X") && f.equals("X") && i.equals("X")) {
            end = 1;
        } else if (c.equals("O") && e.equals("O") && g.equals("O")){
            end = 2;
        } else if (c.equals("O") && f.equals("O") && i.equals("O")) {
            end = 2;
        }
        AlertDialog.Builder alert = new AlertDialog.Builder(this);



        if(end == 1){
            alert
                    .setTitle("GAME OVER!")
                    .setMessage("X PLAYER WINS!")
                    .setCancelable(false)
                    .setPositiveButton("NEW GAME",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(getApplicationContext(),TicTacToeAppMainActivity.class));
                                    finish();
                                }
                            })
                    .setNegativeButton("QUIT GAME",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    System.exit(0);
                                }
                            });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        } else if(end == 2){


            alert
                    .setTitle("GAME OVER!")
                    .setMessage("O PLAYER WINS!")
                    .setCancelable(false)
                    .setPositiveButton("NEW GAME",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(getApplicationContext(),TicTacToeAppMainActivity.class));
                                    finish();
                                }
                            })
                    .setNegativeButton("QUIT GAME",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    System.exit(0);
                                }
                            });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        } else if(end == 3){
            alert
                    .setTitle("GAME OVER!")
                    .setMessage("DRAW!")
                    .setCancelable(false)
                    .setPositiveButton("NEW GAME",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(getApplicationContext(),TicTacToeAppMainActivity.class));
                                    finish();
                                }
                            })
                    .setNegativeButton("QUIT GAME",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    System.exit(0);
                                }
                            });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        }
    }



}
