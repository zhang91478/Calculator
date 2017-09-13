package com.example.bsz.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String text = "";
    TextView textView1;
    TextView textView2;
    TextView textView3;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent = new Intent();
        switch (id){
            case R.id.option2:
                intent.setClass(this,ActivityOne.class);
                startActivity(intent);
                break;
            case R.id.option1:
                intent.setClass(this,MainActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);


        Button button00 = (Button) findViewById(R.id.clear);
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView3.setText("");//清空输入框
                text = "";//清空字符串。
            }
        });

        Button button01 = (Button) findViewById(R.id.back);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //回退一个字符。
                if(!text.isEmpty()) {
                    text=text.substring(0,text.length()-1);
                }
                //将回退的字符输出到输出框
                textView3.setText(text);
            }
        });

        Button button02 = (Button) findViewById(R.id.percent);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "%";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button03 = (Button) findViewById(R.id.parenthesis);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//需要自己判断左右括号
                text = text + "()";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button04 = (Button) findViewById(R.id.pai);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "π";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button10 = (Button) findViewById(R.id.sin);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "sin";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button11 = (Button) findViewById(R.id.radical);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "√";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button12 = (Button) findViewById(R.id.square);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "²";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button13 = (Button) findViewById(R.id.power);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "^";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button14 = (Button) findViewById(R.id.div);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "÷";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button20 = (Button) findViewById(R.id.cos);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "cos";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button21 = (Button) findViewById(R.id.seven);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "7";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button22 = (Button) findViewById(R.id.eight);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "8";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button23 = (Button) findViewById(R.id.nine);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "9";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button24 = (Button) findViewById(R.id.mul);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "×";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button30 = (Button) findViewById(R.id.tan);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "tan";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button31 = (Button) findViewById(R.id.four);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "4";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button32 = (Button) findViewById(R.id.fifth);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "5";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button33 = (Button) findViewById(R.id.six);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "6";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button34 = (Button) findViewById(R.id.sub);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "-";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button40 = (Button) findViewById(R.id.ln);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "ln";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button41 = (Button) findViewById(R.id.one);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "1";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button42 = (Button) findViewById(R.id.two);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "2";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button43 = (Button) findViewById(R.id.three);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "3";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button44 = (Button) findViewById(R.id.add);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "+";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button50 = (Button) findViewById(R.id.lg);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "log";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button51 = (Button) findViewById(R.id.e);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "e";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button52 = (Button) findViewById(R.id.zero);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "0";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button53 = (Button) findViewById(R.id.point);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "•";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });

        Button button54 = (Button) findViewById(R.id.result);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + "=";
                textView1.setText(text);
                textView2.setText(text);
                textView3.setText(text);
            }
        });
    }
}
