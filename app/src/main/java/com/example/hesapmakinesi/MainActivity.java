package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_C,button_open,button_close,button_div;
    Button button_eight,button_seven,button_nine,button_multi;
    Button button_four,button_five,button_six,button_minus;
    Button button_one,button_two,button_three,button_plus;
    Button button_AC,button_zero,button_dot,button_equal;
     TextView result,solution;
boolean plus,minus,div,multi;
float valuOne,valuTwo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.result);
        solution=findViewById(R.id.solution);
        button_C=(Button) findViewById(R.id.button_C);
        button_open=(Button) findViewById(R.id.button_open);
        button_close=(Button) findViewById(R.id.button_close);
        button_div=(Button) findViewById(R.id.button_div);
        button_eight=(Button) findViewById(R.id.button_eight);
        button_seven=(Button) findViewById(R.id.button_seven);
        button_nine=(Button) findViewById(R.id.button_nine);
        button_multi=(Button) findViewById(R.id.button_multi);
        button_four=(Button) findViewById(R.id.button_four);
        button_five=(Button) findViewById(R.id.button_five);
        button_six=(Button) findViewById(R.id.button_six);
        button_minus=(Button) findViewById(R.id.button_minus);
        button_one=(Button) findViewById(R.id.button_one);
        button_two=(Button) findViewById(R.id.button_two);
        button_three=(Button) findViewById(R.id.button_three);
        button_plus=(Button) findViewById(R.id.button_plus);
        button_AC=(Button) findViewById(R.id.button_AC);
        button_zero=(Button) findViewById(R.id.button_zero);
        button_dot=(Button) findViewById(R.id.button_dot);
        button_equal=(Button) findViewById(R.id.button_equal);

button_one.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        result.setText(result.getText()+"1");
        solution.setText(solution.getText());

    }
});
button_two.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        result.setText(result.getText()+"2");
        solution.setText(solution.getText());

    }
});
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
                solution.setText(solution.getText());

            }
        });
        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
                solution.setText(solution.getText());

            }
        });
        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
                solution.setText(solution.getText());

            }
        });
        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
                solution.setText(solution.getText());

            }
        });
        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
                solution.setText(solution.getText());

            }
        });

        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
                solution.setText(solution.getText());

            }
        });

        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
                solution.setText(solution.getText());

            }
        });
        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
                solution.setText(solution.getText());

            }
        });
        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
                solution.setText(solution.getText());

            }
        });
        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(" ");

            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().toString().isEmpty()){
                    result.setText(" ");
                } else {
                    valuOne = Float.parseFloat(result.getText().toString());
                    plus = true;
                    result.setText("");
                }
            }
        });
        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuOne=Float.parseFloat(result.getText()+" ");
minus=true;
result.setText(null);

            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuOne=Float.parseFloat(result.getText()+" ");
div=true;
result.setText(null);
            }
        });
        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuOne = Float.parseFloat(result.getText().toString());
                multi = true;
                result.setText("");  // Burada result'ı temizlemeniz gerekiyor.
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valuTwo = Float.parseFloat(result.getText().toString());
                if (plus) {
                    result.setText(String.valueOf(valuOne + valuTwo));
                    solution.setText(valuOne + "+" + valuTwo);
                    plus = false;
                } else if (minus) {
                    result.setText(String.valueOf(valuOne - valuTwo));
                    solution.setText(valuOne + "-" + valuTwo);
                    minus = false;
                } else if (div) {
                    result.setText(String.valueOf(valuOne / valuTwo));
                    solution.setText(valuOne + "/" + valuTwo);
                    div = false;
                } else if (multi) {
                    result.setText(String.valueOf(valuOne * valuTwo));
                    solution.setText(valuOne + "*" + valuTwo);
                    multi = false;
                }
            }
        });

    }
}