package com.example.kotharudratej.minicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private TextView t1,t2;
    private Button clear,Add,Mul,Div,Sub,Mod,equals,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bdot;
    Float mValueOne,mValueTwo;
    boolean Addition,Subtraction,Multiplication,Division,Modulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        t1=(TextView)findViewById(R.id.tv_userInput);
        clear=(Button)findViewById(R.id.btn_clear);
        Add=(Button)findViewById(R.id.btn_Add);
        Mul=(Button)findViewById(R.id.btn_Multiply);
        Div=(Button)findViewById(R.id.btn_divide);
        Sub=(Button)findViewById(R.id.btn_Sub);
        Mod=(Button)findViewById(R.id.btn_Mod);
        equals=(Button)findViewById(R.id.btn_Equals);
        b1=(Button)findViewById(R.id.btn_one);
        b2=(Button)findViewById(R.id.btn_Two);
        b3=(Button)findViewById(R.id.btn_Three);
        b4=(Button)findViewById(R.id.btn_Four);
        b5=(Button)findViewById(R.id.btn_Five);
        b6=(Button)findViewById(R.id.btn_six);
        b7=(Button)findViewById(R.id.btn_seven);
        b8=(Button)findViewById(R.id.btn_Eight);
        b9=(Button)findViewById(R.id.btn_Nine);
        b0=(Button)findViewById(R.id.btn_zero);
        b00=(Button)findViewById(R.id.btn_zeroo);
        bdot=(Button)findViewById(R.id.btn_dot);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
                }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"0");
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"00");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+".");
            }
        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (t1 == null) {
                    t1.setText("");
                } else {
                    mValueOne = Float.parseFloat(t1.getText() + "");
                    Addition = true;
                    t1.setText(null);
                }
            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (t1 == null) {
                    t1.setText("");
                } else {
                    mValueOne = Float.parseFloat(t1.getText() + "");
                    Subtraction = true;
                    t1.setText(null);
                }
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (t1 == null) {
                    t1.setText("");
                } else {
                    mValueOne = Float.parseFloat(t1.getText() + "");
                    Multiplication = true;
                    t1.setText(null);
                }
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (t1 == null) {
                    t1.setText("");
                } else {
                    mValueOne = Float.parseFloat(t1.getText() + "");
                    Division= true;
                    t1.setText(null);
                }
            }
        });
        Mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (t1 == null) {
                    t1.setText("");
                } else {
                    mValueOne = Float.parseFloat(t1.getText() + "");
                    Modulo = true;
                    t1.setText(null);
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(t1.getText() + "");

                if (Addition == true) {
                    t1.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (Subtraction == true) {
                    t1.setText(mValueOne - mValueTwo + "");
                    Subtraction = false;
                }

                if (Multiplication == true) {
                    t1.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    t1.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
                if (Modulo == true) {
                    t1.setText(mValueOne % mValueTwo + "");
                    Modulo = false;
                }
            }

    });
clear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        t1.setText("");
    }
});


    }
}
