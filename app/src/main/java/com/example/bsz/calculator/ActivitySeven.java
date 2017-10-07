package com.example.bsz.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ActivitySeven extends AppCompatActivity {

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
           /* case R.id.option7:
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

    double rate1 = 1.0;
    double rate2 = 1.0;
    double rate3 = 1.0;


    EditText editText1;
    EditText editText2;
    EditText editText3;
    String text = " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        editText1 = (EditText)findViewById(R.id.edit_text7_1);
        editText1.setInputType(InputType.TYPE_NULL);
        editText1.setText("0");
        editText2 = (EditText)findViewById(R.id.edit_text7_2);
        editText2.setInputType(InputType.TYPE_NULL);
        editText2.setText("0");
        editText3 = (EditText)findViewById(R.id.edit_text7_3);
        editText3.setInputType(InputType.TYPE_NULL);
        editText3.setText("0");

        Spinner spinner1 = (Spinner)findViewById(R.id.spinner7_1);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:rate1 =1.0;break;
                    case 1:rate1 =0.1503;break;
                    case 2:rate1 =1.1737;break;
                    case 3:rate1 =0.1280;break;
                    case 4:rate1 =16.9096;break;
                    case 5:rate1 =0.1142;break;
                }
                text = editText1.getText().toString();
                double temp = Double.parseDouble(text)/rate1;
                editText2.setText(String.valueOf(temp*rate2));
                editText3.setText(String.valueOf(temp*rate3));
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        Spinner spinner2 = (Spinner)findViewById(R.id.spinner7_2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:rate2 =1.0;break;
                    case 1:rate2 =0.1503;break;
                    case 2:rate2 =1.1737;break;
                    case 3:rate2 =0.1280;break;
                    case 4:rate2 =16.9096;break;
                    case 5:rate2 =0.1142;break;
                }
                text = editText2.getText().toString();
                double temp = Double.parseDouble(text)/rate2;
                editText1.setText(String.valueOf(temp*rate1));
                editText3.setText(String.valueOf(temp*rate3));
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        Spinner spinner3 = (Spinner)findViewById(R.id.spinner7_3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:rate3 =1.0;break;
                    case 1:rate3 =0.1503;break;
                    case 2:rate3 =1.1737;break;
                    case 3:rate3 =0.1280;break;
                    case 4:rate3 =16.9096;break;
                    case 5:rate3 =0.1142;break;
                }
                text = editText3.getText().toString();
                double temp = Double.parseDouble(text)/rate3;
                editText1.setText(String.valueOf(temp*rate1));
                editText2.setText(String.valueOf(temp*rate2));
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        Button button1 = (Button)findViewById(R.id.button7_1);
        buttonAction(button1,"7");

        Button button2 = (Button)findViewById(R.id.button7_2);
        buttonAction(button2,"8");

        Button button3 = (Button)findViewById(R.id.button7_3);
        buttonAction(button3,"9");

        Button button4 = (Button)findViewById(R.id.button7_4);
        buttonAction(button4,"4");

        Button button5 = (Button)findViewById(R.id.button7_5);
        buttonAction(button5,"5");

        Button button6 = (Button)findViewById(R.id.button7_6);
        buttonAction(button6,"6");

        Button button7 = (Button)findViewById(R.id.button7_7);
        buttonAction(button7,"1");

        Button button8 = (Button)findViewById(R.id.button7_8);
        buttonAction(button8,"2");

        Button button9 = (Button)findViewById(R.id.button7_9);
        buttonAction(button9,"3");

        Button button10 = (Button)findViewById(R.id.button7_10);
        buttonAction(button10,"0");

        Button button11 = (Button)findViewById(R.id.button7_11);
        buttonAction(button11,"00");

        Button button12 = (Button)findViewById(R.id.button7_12);
        buttonAction(button12,".");

        Button button13 = (Button)findViewById(R.id.button7_13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.isFocused()) {
                    editText1.setFocusable(true);
                    text = editText1.getText().toString();
                    if(text.equals("0"))
                        text = "0";
                    else
                        text=text.substring(0,text.length()-1);
                    editText1.setText(text);
                    double temp = Double.parseDouble(text)/rate1;
                    editText2.setText(String.valueOf(temp*rate2));
                    editText3.setText(String.valueOf(temp*rate3));
                }
                else if(editText2.isFocused()) {
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0"))
                        text = "0";
                    else
                        text=text.substring(0,text.length()-1);
                    editText2.setText(text);
                    double temp = Double.parseDouble(text)/rate2;
                    editText1.setText(String.valueOf(temp*rate1));
                    editText3.setText(String.valueOf(temp*rate3));
                }
                if(editText3.isFocused()) {
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0"))
                        text = "0";
                    else
                        text=text.substring(0,text.length()-1);
                    editText3.setText(text);
                    double temp = Double.parseDouble(text)/rate3;
                    editText1.setText(String.valueOf(temp*rate1));
                    editText2.setText(String.valueOf(temp*rate2));
                }

            }
        });

        Button button14 = (Button)findViewById(R.id.button7_14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("0");
                editText2.setText("0");
                editText3.setText("0");
            }
        });
    }
    private void buttonAction(Button bt,final String str){
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.isFocused()){
                    editText1.setFocusable(true);
                    text = editText1.getText().toString();
                    if(text.equals("0")){
                        if(str.equals("00")||str.equals("."))
                            text = "0";
                        else
                            text = str;
                    }

                    else
                        text = text + str;
                    editText1.setText(text);
                    double temp = Double.parseDouble(text)/rate1;
                    editText2.setText(String.valueOf(temp*rate2));
                    editText3.setText(String.valueOf(temp*rate3));
                }
                else if(editText2.isFocused()){
                    editText2.setFocusable(true);
                    text = editText2.getText().toString();
                    if(text.equals("0")){
                        if(str.equals("00")||str.equals("."))
                            text = "0";
                        else
                            text = str;
                    }
                    else
                        text = text + str;
                    editText2.setText(text);
                    double temp = Double.parseDouble(text)/rate2;
                    editText1.setText(String.valueOf(temp*rate1));
                    editText3.setText(String.valueOf(temp*rate3));
                }
                else if(editText3.isFocused()){
                    editText3.setFocusable(true);
                    text = editText3.getText().toString();
                    if(text.equals("0")){
                        if(str.equals("00")||str.equals("."))
                            text = "0";
                        else
                            text = str;
                    }
                    else
                        text = text + str;
                    editText3.setText(text);
                    double temp = Double.parseDouble(text)/rate3;
                    editText1.setText(String.valueOf(temp*rate1));
                    editText2.setText(String.valueOf(temp*rate2));
                }
            }
        });

    }
}
