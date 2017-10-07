package com.example.bsz.calculator;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityOne extends AppCompatActivity {
    static String text = "";
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
      /*      case R.id.option7:
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

    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        Log.v("ActivityOne","onCreate");
        editText1 = (EditText)findViewById(R.id.textViewEr);
        editText2 = (EditText)findViewById(R.id.textViewBa);
        editText3 = (EditText)findViewById(R.id.textViewSi);
        editText4 = (EditText)findViewById(R.id.textViewShiLiu);
        final Button button00 = (Button) findViewById(R.id.buttonA);
        final Button button01 = (Button) findViewById(R.id.buttonB);
        final Button button02 = (Button) findViewById(R.id.buttonC);
        final Button button03 = (Button) findViewById(R.id.buttonD);
        final Button button10 = (Button) findViewById(R.id.button9);
        final Button button11 = (Button) findViewById(R.id.button8);
        final Button button12 = (Button) findViewById(R.id.button7);
        final Button button13 = (Button) findViewById(R.id.buttonE);
        final Button button20 = (Button) findViewById(R.id.button6);
        final Button button21 = (Button) findViewById(R.id.button5);
        final Button button22 = (Button) findViewById(R.id.button4);
        final Button button23 = (Button) findViewById(R.id.buttonF);
        final Button button30 = (Button) findViewById(R.id.button3);
        final Button button31 = (Button) findViewById(R.id.button2);
        final Button button32 = (Button) findViewById(R.id.button1);
        final Button button33 = (Button) findViewById(R.id.button0);
        final Button button04 = (Button) findViewById(R.id.buttonClear);
        final Button button14 = (Button) findViewById(R.id.buttonBack);
        editText1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                buttonColor(button00,false,97,98,98);
                buttonColor(button01,false,97,98,98);
                buttonColor(button02,false,97,98,98);
                buttonColor(button03,false,97,98,98);
                buttonColor(button10,false,97,98,98);
                buttonColor(button11,false,97,98,98);
                buttonColor(button12,false,97,98,98);
                buttonColor(button13,false,97,98,98);
                buttonColor(button20,false,97,98,98);
                buttonColor(button21,false,97,98,98);
                buttonColor(button22,false,97,98,98);
                buttonColor(button23,false,97,98,98);
                buttonColor(button30,false,97,98,98);
                buttonColor(button31,false,97,98,98);
                buttonColor(button32,true,0,0,0);
                buttonColor(button33,true,0,0,0);


                editText1.setInputType(InputType.TYPE_NULL); // 关闭软键盘
                return false;
            }
        });
        editText2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                buttonColor(button00,false,97,98,98);
                buttonColor(button01,false,97,98,98);
                buttonColor(button02,false,97,98,98);
                buttonColor(button03,false,97,98,98);
                buttonColor(button10,false,97,98,98);
                buttonColor(button11,false,97,98,98);
                buttonColor(button12,true,0,0,0);
                buttonColor(button13,false,97,98,98);
                buttonColor(button20,true,0,0,0);
                buttonColor(button21,true,0,0,0);
                buttonColor(button22,true,0,0,0);
                buttonColor(button23,false,97,98,98);
                buttonColor(button30,true,0,0,0);
                buttonColor(button31,true,0,0,0);
                buttonColor(button32,true,0,0,0);
                buttonColor(button33,true,0,0,0);


                editText2.setInputType(InputType.TYPE_NULL); // 关闭软键盘
                return false;
            }
        });
        editText3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                buttonColor(button00,false,97,98,98);
                buttonColor(button01,false,97,98,98);
                buttonColor(button02,false,97,98,98);
                buttonColor(button03,false,97,98,98);
                buttonColor(button10,true,0,0,0);
                buttonColor(button11,true,0,0,0);
                buttonColor(button12,true,0,0,0);
                buttonColor(button13,false,97,98,98);
                buttonColor(button20,true,0,0,0);
                buttonColor(button21,true,0,0,0);
                buttonColor(button22,true,0,0,0);
                buttonColor(button23,false,97,98,98);
                buttonColor(button30,true,0,0,0);
                buttonColor(button31,true,0,0,0);
                buttonColor(button32,true,0,0,0);
                buttonColor(button33,true,0,0,0);


                editText3.setInputType(InputType.TYPE_NULL); // 关闭软键盘
                return false;
            }
        });
        editText4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                buttonColor(button00,true,0,0,0);
                buttonColor(button01,true,0,0,0);
                buttonColor(button02,true,0,0,0);
                buttonColor(button03,true,0,0,0);
                buttonColor(button10,true,0,0,0);
                buttonColor(button11,true,0,0,0);
                buttonColor(button12,true,0,0,0);
                buttonColor(button13,true,0,0,0);
                buttonColor(button20,true,0,0,0);
                buttonColor(button21,true,0,0,0);
                buttonColor(button22,true,0,0,0);
                buttonColor(button23,true,0,0,0);
                buttonColor(button30,true,0,0,0);
                buttonColor(button31,true,0,0,0);
                buttonColor(button32,true,0,0,0);
                buttonColor(button33,true,0,0,0);

                editText4.setInputType(InputType.TYPE_NULL); // 关闭软键盘
                return false;
            }
        });
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.isFocused()){
                    editText1.setFocusable(true);
                    text = editText1.getText().toString();
                    if(!text.isEmpty())
                        text=text.substring(0,text.length()-1);
                    if(text.isEmpty())
                        text = "0";
                    editText1.setText(text);
                    Integer temp = Integer.valueOf(text,2);
                    editText2.setText(Integer.toOctalString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                }
                else if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.isEmpty())
                        text = "0";
                    else
                        text=text.substring(0,text.length()-1);
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.isEmpty())
                        text = "0";
                    else
                        text=text.substring(0,text.length()-1);
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                 //   editText4.setSelection(text.length());
                    if(text.isEmpty())
                        text = "0";
                    else
                        text=text.substring(0,text.length()-1);
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }


        });
        buttonAction(button00,"A");
        buttonAction(button01,"B");
        buttonAction(button02,"C");
        buttonAction(button03,"D");
        buttonAction(button10,"9");
        buttonAction(button11,"8");
        buttonAction(button12,"7");
        buttonAction(button13,"E");
        buttonAction(button20,"6");
        buttonAction(button21,"5");
        buttonAction(button22,"4");
        buttonAction(button23,"F");
        buttonAction(button30,"3");
        buttonAction(button31,"2");
        buttonAction(button32,"1");
        buttonAction(button33,"0");

    }
    private void buttonColor(Button bt,boolean bl,int r,int g,int b){
        bt.setClickable(bl);
        bt.setTextColor(Color.rgb(r,g,b));
    }
    private void buttonAction(Button bt, final String str){
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText1.isFocused()){
                    editText1.setFocusable(true);
                    text = editText1.getText().toString();
                    if(text.equals("0"))
                        text = str;
                    else
                        text = text + str;
                    editText1.setText(text);
                    Integer temp = Integer.valueOf(text,2);
                    editText2.setText(Integer.toOctalString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                }
                else if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0"))
                        text = str;
                    else
                        text = text + str;
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = str;
                    else
                        text = text + str;
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = str;
                    else
                        text = text + str;
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

    }
}
