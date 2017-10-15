package com.example.bsz.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String text = "0";
    EditText editText1;
    EditText editText2;
    int pointCan = 0;


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
            case R.id.option1:
                intent.setClass(this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.option2:
                intent.setClass(this,ActivityOne.class);
                startActivity(intent);
                break;
            case R.id.option3:
                intent.setClass(this,ActivityTwo.class);
                startActivity(intent);
                break;
            case R.id.option4:
                intent.setClass(this,ActivityThree.class);
                startActivity(intent);
                break;
            case R.id.option5:
                intent.setClass(this,ActivityFour.class);
                startActivity(intent);
                break;
            case R.id.option6:
                intent.setClass(this,ActivityFive.class);
                startActivity(intent);
                break;
         /*   case R.id.option7:
                intent.setClass(this,ActivitySix.class);
                startActivity(intent);
                break;*/
            case R.id.option8:
                intent.setClass(this,ActivitySeven.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.textView1);
        editText2 = (EditText) findViewById(R.id.textView2);
        editText1.setInputType(InputType.TYPE_NULL);
        editText2.setInputType(InputType.TYPE_NULL);

        Button button00 = (Button) findViewById(R.id.clear);
        Button button01 = (Button) findViewById(R.id.back);
        Button button02 = (Button) findViewById(R.id.percent);
        Button button03 = (Button) findViewById(R.id.parenthesis);
        Button button04 = (Button) findViewById(R.id.pai);
        Button button10 = (Button) findViewById(R.id.sin);
        Button button11 = (Button) findViewById(R.id.radical);
        Button button12 = (Button) findViewById(R.id.square);
        Button button13 = (Button) findViewById(R.id.power);
        Button button14 = (Button) findViewById(R.id.div);
        Button button20 = (Button) findViewById(R.id.cos);
        Button button21 = (Button) findViewById(R.id.nine);
        Button button22 = (Button) findViewById(R.id.eight);
        Button button23 = (Button) findViewById(R.id.seven);
        Button button24 = (Button) findViewById(R.id.mul);
        Button button30 = (Button) findViewById(R.id.tan);
        Button button31 = (Button) findViewById(R.id.six);
        Button button32 = (Button) findViewById(R.id.fifth);
        Button button33 = (Button) findViewById(R.id.four);
        Button button34 = (Button) findViewById(R.id.sub);
        Button button40 = (Button) findViewById(R.id.ln);
        Button button41 = (Button) findViewById(R.id.three);
        Button button42 = (Button) findViewById(R.id.two);
        Button button43 = (Button) findViewById(R.id.one);
        Button button44 = (Button) findViewById(R.id.add);
        Button button50 = (Button) findViewById(R.id.lg);
        Button button51 = (Button) findViewById(R.id.e);
        Button button52 = (Button) findViewById(R.id.zero);
        Button button53 = (Button) findViewById(R.id.point);
        Button button54 = (Button) findViewById(R.id.result);

        setCharButton(button04,"π");
        setNumButton(button21,"9");
        setNumButton(button22,"8");
        setNumButton(button23,"7");
        setNumButton(button31,"6");
        setNumButton(button32,"5");
        setNumButton(button33,"4");
        setNumButton(button41,"3");
        setNumButton(button42,"2");
        setNumButton(button43,"1");
        setNumButton(button52,"0");
        setCharButton(button51,"e");
        setCharButton(button02,"%");

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text ="0";
                editText2.setText(text);
                pointCan = 0;//防止point被重复点击
            }

        });

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.charAt(text.length()-1)=='.') {
                    pointCan = 0;
                }
                text = editText2.getText().toString();
                if(text.length()==1)
                    text = "0";
                else
                    text=text.substring(0,text.length()-1);
                editText2.setText(text);
            }
        });

        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char end = text.charAt(text.length()-1);
                if(end =='1'||end == '2'||end == '3'||end == '4' ||
                        end == '5'||end == '6'||end == '7'||end == '8'||end == '9'||end == '0'
                        ||end == 'π'||end == 'e'){
                    text = text +")";
                }
                else {
                    text = text +"(";
                }
                editText2.setText(text);
                pointCan = 0;//防止point被重复点击
            }
        });

        setLeftButton(button10,"sin");
        setLeftButton(button20,"cos");
        setLeftButton(button30,"tan");
        setLeftButton(button40,"ln");
        setLeftButton(button50,"log");
        setLeftButton(button11,"√");

        setRightButton(button14,"÷");
        setRightButton(button24,"×");
        setRightButton(button34,"-");
        setRightButton(button44,"+");
        setRightButton(button13,"^");
        setRightButton(button12,"²");

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pointCan==1){
                    text = text + '.';
                    editText2.setText(text);
                    pointCan = 2;
                }
            }
        });

        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = editText2.getText().toString();
                editText1.setText(text);
                String result = new CalculateHelper().result(text);
                editText2.setText(result);
            }
        });
    }


    private void setNumButton(final Button button, final String str){
        //按钮1，2，3，4，5，6，7，8，9，0
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = editText2.getText().toString();
                char end = text.charAt(text.length()-1);
                if(text.equals("0")){
                    text="";
                }
                if(end =='π'||end=='e'||end==')') {
                    text = text + "×";
                }
                text = text +str;
                editText2.setText(text);
                //为了防止point按钮被重复点击
                if(pointCan==0) {
                    pointCan = 1;
                }
            }
        });
    }
    private void setCharButton(final Button button, final String str){
        //按钮e π  %
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = editText2.getText().toString();
                char end = text.charAt(text.length()-1);
                if(text.equals("0")) {
                    text = "";
                }
                if(end =='π'||end=='e'||end==')'||end =='0'||end =='1'
                        ||end =='2'||end =='3'||end =='4'||end =='5'
                        ||end =='6'||end =='7'||end =='8'||end =='9') {
                    text = text + "×";
                }else if(end=='.'){
                    text = text + "0×";
                }
                text = text +str;
                editText2.setText(text);
                pointCan = 0;//防止point被重复点击
            }
        });
    }

    private void setLeftButton(final Button button,final String str){
        //按钮sin,cos,tan,ln,log,√
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = editText2.getText().toString();
                char end = text.charAt(text.length()-1);
                if(text.equals("0")){
                    text = "";
                }
                if(end =='+'||end =='-'||end =='×'||end == '÷'||end=='('||text.equals("")){
                    text = text +str+"(";
                }
                else {
                    text = text +"×"+str+"(";
                }
                editText2.setText(text);
                pointCan = 0;//防止point被重复点击
            }

        });
    }
    private void setRightButton(final Button button,final String str){
        //按钮 + - × ÷ .
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = text + str;
                editText2.setText(text);
                pointCan = 0;//防止point被重复点击
            }
        });
    }
}
