package benjamin.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button add;
    private Button sub;
    private Button mult;
    private Button div;
    private  Button clr;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);

        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        clr = (Button) findViewById(R.id.clr);
        result = (TextView) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double aResult = (oper1 + oper2);

                    result.setText(Double.toString(aResult));
                }
                else
                Toast.makeText(MainActivity.this,"Need input",Toast.LENGTH_LONG).show();
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double aResult = (oper1 - oper2);

                    result.setText(Double.toString(aResult));
                }
                else
                    Toast.makeText(MainActivity.this,"Need input",Toast.LENGTH_LONG).show();
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double aResult = (oper1 * oper2);

                    result.setText(Double.toString(aResult));
                }
                else
                    Toast.makeText(MainActivity.this,"Need input",Toast.LENGTH_LONG).show();
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length() > 0 && operand2.getText().length() > 0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double aResult = (oper1 / oper2);

                    result.setText(Double.toString(aResult));
                }
                else
                    Toast.makeText(MainActivity.this,"Need input",Toast.LENGTH_LONG).show();
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                result.setText("0.00");
                operand1.requestFocus();
            }
        });


    }

    }

