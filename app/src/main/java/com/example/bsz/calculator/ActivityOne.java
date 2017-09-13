package com.example.bsz.calculator;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
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
        setContentView(R.layout.activity_one);

        Log.v("ActivityOne","onCreate");

        final EditText editText1 = (EditText)findViewById(R.id.textViewEr);
        final EditText editText2 = (EditText)findViewById(R.id.textViewBa);
        final EditText editText3 = (EditText)findViewById(R.id.textViewSi);
        final EditText editText4 = (EditText)findViewById(R.id.textViewShiLiu);

        final  Button button00 = (Button) findViewById(R.id.buttonA);

        final  Button button01 = (Button) findViewById(R.id.buttonB);
        final Button button02 = (Button) findViewById(R.id.buttonC);
        final Button button03 = (Button) findViewById(R.id.buttonD);
        final Button button10 = (Button) findViewById(R.id.button9);
        final  Button button11 = (Button) findViewById(R.id.button8);
        final  Button button12 = (Button) findViewById(R.id.button7);
        final  Button button13 = (Button) findViewById(R.id.buttonE);
        final  Button button20 = (Button) findViewById(R.id.button6);
        final  Button button21 = (Button) findViewById(R.id.button5);
        final  Button button22 = (Button) findViewById(R.id.button4);
        final  Button button23 = (Button) findViewById(R.id.buttonF);
        final  Button button30 = (Button) findViewById(R.id.button3);
        final  Button button31 = (Button) findViewById(R.id.button2);
        final  Button button32 = (Button) findViewById(R.id.button1);
        final   Button button33 = (Button) findViewById(R.id.button0);
        final   Button button04 = (Button) findViewById(R.id.buttonClear);
        final   Button button14 = (Button) findViewById(R.id.buttonBack);


        editText1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                button00.setClickable(false);
                button00.setTextColor(Color.rgb(158,157,157));

                button01.setClickable(false);
                button01.setTextColor(Color.rgb(158,157,157));

                button02.setClickable(false);
                button02.setTextColor(Color.rgb(158,157,157));

                button03.setClickable(false);
                button03.setTextColor(Color.rgb(158,157,157));

                button10.setClickable(false);
                button10.setTextColor(Color.rgb(158,157,157));

                button11.setClickable(false);
                button11.setTextColor(Color.rgb(158,157,157));

                button12.setClickable(false);
                button12.setTextColor(Color.rgb(158,157,157));

                button13.setClickable(false);
                button13.setTextColor(Color.rgb(158,157,157));

                button20.setClickable(false);
                button20.setTextColor(Color.rgb(158,157,157));

                button21.setClickable(false);
                button21.setTextColor(Color.rgb(158,157,157));

                button22.setClickable(false);
                button22.setTextColor(Color.rgb(158,157,157));

                button23.setClickable(false);
                button23.setTextColor(Color.rgb(158,157,157));

                button23.setClickable(false);
                button23.setTextColor(Color.rgb(158,157,157));

                button30.setClickable(false);
                button30.setTextColor(Color.rgb(158,157,157));

                button31.setClickable(false);
                button31.setTextColor(Color.rgb(158,157,157));

                button32.setClickable(true);
                button32.setTextColor(Color.rgb(255,255,255));

                button33.setClickable(true);
                button33.setTextColor(Color.rgb(255,255,255));

                editText1.setInputType(InputType.TYPE_NULL); // 关闭软键盘
                return false;
            }
        });
/*
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //do nothing
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

*/
        editText2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                button00.setClickable(false);
                button00.setTextColor(Color.rgb(158,157,157));

                button01.setClickable(false);
                button01.setTextColor(Color.rgb(158,157,157));

                button02.setClickable(false);
                button02.setTextColor(Color.rgb(158,157,157));

                button03.setClickable(false);
                button03.setTextColor(Color.rgb(158,157,157));

                button10.setClickable(false);
                button10.setTextColor(Color.rgb(158,157,157));

                button11.setClickable(false);
                button11.setTextColor(Color.rgb(158,157,157));

                button12.setClickable(true);
                button12.setTextColor(Color.rgb(255,255,255));

                button13.setClickable(false);
                button13.setTextColor(Color.rgb(158,157,157));

                button20.setClickable(true);
                button20.setTextColor(Color.rgb(255,255,255));

                button21.setClickable(true);
                button21.setTextColor(Color.rgb(255,255,255));

                button22.setClickable(true);
                button22.setTextColor(Color.rgb(255,255,255));

                button23.setClickable(false);
                button23.setTextColor(Color.rgb(158,157,157));

                button23.setClickable(false);
                button23.setTextColor(Color.rgb(158,157,157));

                button30.setClickable(true);
                button30.setTextColor(Color.rgb(255,255,255));

                button31.setClickable(true);
                button31.setTextColor(Color.rgb(255,255,255));

                button32.setClickable(true);
                button32.setTextColor(Color.rgb(255,255,255));

                button33.setClickable(true);
                button33.setTextColor(Color.rgb(255,255,255));

                editText2.setInputType(InputType.TYPE_NULL); // 关闭软键盘
                return false;
            }
        });

        editText3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                button00.setClickable(false);
                button00.setTextColor(Color.rgb(158,157,157));

                button01.setClickable(false);
                button01.setTextColor(Color.rgb(158,157,157));

                button02.setClickable(false);
                button02.setTextColor(Color.rgb(158,157,157));

                button03.setClickable(false);
                button03.setTextColor(Color.rgb(158,157,157));

                button10.setClickable(true);
                button10.setTextColor(Color.rgb(255,255,255));

                button11.setClickable(true);
                button11.setTextColor(Color.rgb(255,255,255));

                button12.setClickable(true);
                button12.setTextColor(Color.rgb(255,255,255));

                button13.setClickable(false);
                button13.setTextColor(Color.rgb(158,157,157));

                button20.setClickable(true);
                button20.setTextColor(Color.rgb(255,255,255));

                button21.setClickable(true);
                button21.setTextColor(Color.rgb(255,255,255));

                button22.setClickable(true);
                button22.setTextColor(Color.rgb(255,255,255));

                button23.setClickable(false);
                button23.setTextColor(Color.rgb(158,157,157));

                button23.setClickable(false);
                button23.setTextColor(Color.rgb(158,157,157));

                button30.setClickable(true);
                button30.setTextColor(Color.rgb(255,255,255));

                button31.setClickable(true);
                button31.setTextColor(Color.rgb(255,255,255));

                button32.setClickable(true);
                button32.setTextColor(Color.rgb(255,255,255));

                button33.setClickable(true);
                button33.setTextColor(Color.rgb(255,255,255));

                editText3.setInputType(InputType.TYPE_NULL); // 关闭软键盘
                return false;
            }
        });

        editText4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                button00.setClickable(true);
                button00.setTextColor(Color.rgb(255,255,255));

                button01.setClickable(true);
                button01.setTextColor(Color.rgb(255,255,255));

                button02.setClickable(true);
                button02.setTextColor(Color.rgb(255,255,255));

                button03.setClickable(true);
                button03.setTextColor(Color.rgb(255,255,255));

                button10.setClickable(true);
                button10.setTextColor(Color.rgb(255,255,255));

                button11.setClickable(true);
                button11.setTextColor(Color.rgb(255,255,255));

                button12.setClickable(true);
                button12.setTextColor(Color.rgb(255,255,255));

                button13.setClickable(true);
                button13.setTextColor(Color.rgb(255,255,255));

                button20.setClickable(true);
                button20.setTextColor(Color.rgb(255,255,255));

                button21.setClickable(true);
                button21.setTextColor(Color.rgb(255,255,255));

                button22.setClickable(true);
                button22.setTextColor(Color.rgb(255,255,255));

                button23.setClickable(true);
                button23.setTextColor(Color.rgb(255,255,255));

                button23.setClickable(true);
                button23.setTextColor(Color.rgb(255,255,255));

                button30.setClickable(true);
                button30.setTextColor(Color.rgb(255,255,255));

                button31.setClickable(true);
                button31.setTextColor(Color.rgb(255,255,255));

                button32.setClickable(true);
                button32.setTextColor(Color.rgb(255,255,255));

                button33.setClickable(true);
                button33.setTextColor(Color.rgb(255,255,255));

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
                //    editText1.setSelection(text.length());
                    if(text.isEmpty())
                        text = "0";
                    else
                        text=text.substring(0,text.length()-1);
                    editText1.setText(text);
                    Integer temp = Integer.valueOf(text,2);
                    editText2.setText(Integer.toOctalString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                }
                else if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                //    editText2.setSelection(text.length());
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
                 //   editText3.setSelection(text.length());
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

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.isFocused()){
                    editText1.setFocusable(true);
                    text = editText1.getText().toString();
                    if(text.equals("0"))
                        text = "0";
                    else
                        text = text + "0";
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
                        text = "0";
                    else
                        text = text + "0";
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "0";
                    else
                        text = text + "0";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "0";
                    else
                        text = text + "0";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText1.isFocused()){
                    editText1.setFocusable(true);
                    text = editText1.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "1";
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
                        text = "";
                    else
                        text = text + "1";
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "1";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "1";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });


        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "2";
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "2";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "2";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "3";
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "3";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "3";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "4";
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "4";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "4";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "5";
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "5";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "5";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });


        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "6";
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "6";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "6";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "7";
                    editText2.setText(text);
                    Integer temp= Integer.valueOf(text,8);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "7";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "7";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "8";
                    editText2.setText(text);
                } else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "8";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "8";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "9";
                    editText3.setText(text);
                    Integer temp= Integer.parseInt(text);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText2.setText(Integer.toOctalString(temp));
                    editText4.setText(Integer.toHexString(temp).toUpperCase());
                } else if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "9";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "A";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "B";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "C";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "D";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "E";
                    editText4.setText(text);
                    Integer temp= Integer.valueOf(text,16);
                    editText1.setText(Integer.toBinaryString(temp));
                    editText3.setText(temp.toString());
                    editText2.setText(Integer.toOctalString(temp).toUpperCase());
                }

            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(editText4.isFocused()){
                    editText4.setFocusable(true);
                    text = editText4.getText().toString();
                    if(text.equals("0"))
                        text = "";
                    else
                        text = text + "F";
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
