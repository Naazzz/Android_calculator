package com.example.nazrin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private float birinci_eded, ikinci_eded, beraberlik;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 =(Button) findViewById(R.id.button1);
        final Button button2 =(Button) findViewById(R.id.button2);
        final Button button3 =(Button) findViewById(R.id.button3);
        final Button button4 =(Button) findViewById(R.id.button4);
        final Button button5 =(Button) findViewById(R.id.button5);
        final Button button6 =(Button) findViewById(R.id.button6);
        final Button button7 =(Button) findViewById(R.id.button7);
        final Button button8 =(Button) findViewById(R.id.button8);
        final Button button9 =(Button) findViewById(R.id.button9);
        final Button button10 =(Button) findViewById(R.id.button10);
        final Button button_clear =(Button) findViewById(R.id.button_clear);
        final Button button_backspace =(Button) findViewById(R.id.button_backspace);
        final Button button_bolme =(Button) findViewById(R.id.button_bolme);
        final Button button_vurma =(Button) findViewById(R.id.button_vurma);
        final Button button_cixma =(Button) findViewById(R.id.button_cixma);
        final Button button_ustegelme =(Button) findViewById(R.id.button_ustegelme);
        final Button button_beraber =(Button) findViewById(R.id.button_beraber);
        final Button button_noqte =(Button) findViewById(R.id.button_noqte);

        final TextView emeliyyat = (TextView) findViewById(R.id.emeliyyat);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emeliyyat.setText(emeliyyat.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emeliyyat.setText(emeliyyat.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emeliyyat.setText(emeliyyat.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emeliyyat.setText(emeliyyat.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emeliyyat.setText(emeliyyat.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emeliyyat.setText(emeliyyat.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emeliyyat.setText(emeliyyat.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emeliyyat.setText(emeliyyat.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emeliyyat.setText(emeliyyat.getText()+"9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emeliyyat.setText(emeliyyat.getText()+"0");
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emeliyyat.setText(" ");
            }
        });
        button_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eded, yeni_eded;
                eded=emeliyyat.getText().toString();
                yeni_eded=eded.substring(0,(eded.length()-1));
                emeliyyat.setText(yeni_eded);
            }
        });
        button_noqte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emeliyyat.setText((emeliyyat.getText()+"."));
            }
        });
        button_ustegelme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birinci_eded= Float.parseFloat(emeliyyat.getText().toString());
                emeliyyat.setText("");
                operation="+";

            }
        });
        button_cixma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birinci_eded= Float.parseFloat(emeliyyat.getText().toString());
                emeliyyat.setText("");
                operation="-";
            }
        });
        button_vurma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birinci_eded= Float.parseFloat(emeliyyat.getText().toString());
                emeliyyat.setText("");
                operation="X";
            }
        });
        button_bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birinci_eded= Float.parseFloat(emeliyyat.getText().toString());
                emeliyyat.setText("");
                operation="/";
            }
        });
        button_beraber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ikinci_eded= Float.parseFloat(emeliyyat.getText().toString());
                emeliyyat.setText("");


                    if (operation.equals("+")) {
                        beraberlik = birinci_eded + ikinci_eded;
                    } else if (operation.equals("-")) {
                        beraberlik = birinci_eded - ikinci_eded;
                    } else if (operation.equals("/") && ikinci_eded != 0) {
                        beraberlik = birinci_eded / ikinci_eded;
                    } else if (operation.equals("*")) {
                        beraberlik = birinci_eded * ikinci_eded;
                    }
                    else
                        emeliyyat.setText("error");

                emeliyyat.setText(beraberlik+"");

            }
        });


    }
}
