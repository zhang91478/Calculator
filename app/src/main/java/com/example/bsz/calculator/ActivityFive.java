package com.example.bsz.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActivityFive extends AppCompatActivity {

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

    EditText editText;
    TextView textView3;
    TextView textView5;
    TextView textView7;
    TextView textView9;
    Double max =Double.MIN_VALUE;
    Double min =Double.MAX_VALUE;

    String text="";
    ArrayList<Double> re = new ArrayList<Double>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        Log.v("onCreate","onCreate");
        editText = (EditText)findViewById(R.id.edit_text5_1);
        Button button0 = (Button)findViewById(R.id.button5_0);
        textView3=(TextView)findViewById(R.id.textView5_3);
        textView5=(TextView)findViewById(R.id.textView5_5);
        textView7=(TextView)findViewById(R.id.textView5_7);
        textView9=(TextView)findViewById(R.id.textView5_9);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double temp = Double.valueOf(editText.getText().toString());
                if(temp>max)
                    max=temp;
                if(temp<min)
                    min=temp;
                re.add(temp);
                Log.e("max-min=",max.toString()+"-"+min.toString());
                textView5.setText(String.valueOf(max-min));
                Double sum=0.0;
                for(int i=0;i<re.size();++i){
                    sum = sum + re.get(i);
                }
                Double average = sum/re.size();
                textView3.setText(String.valueOf(average));
                sum = 0.0;
                for(int i=0;i<re.size();++i){
                     sum= sum + (re.get(i)-average)*(re.get(i)-average);
                }
                average = sum/re.size();
                textView7.setText(String.valueOf(Math.sqrt(average)));
                textView9.setText(String.valueOf(average));
                editText.setText("0");
            }

        });

        Button button1 = (Button)findViewById(R.id.button5_1);
        buttonAction(button1,"7");

        Button button2 = (Button)findViewById(R.id.button5_2);
        buttonAction(button2,"8");

        Button button3 = (Button)findViewById(R.id.button5_3);
        buttonAction(button3,"9");

        Button button4 = (Button)findViewById(R.id.button5_4);
        buttonAction(button4,"4");

        Button button5 = (Button)findViewById(R.id.button5_5);
        buttonAction(button5,"5");

        Button button6 = (Button)findViewById(R.id.button5_6);
        buttonAction(button6,"6");

        Button button7 = (Button)findViewById(R.id.button5_7);
        buttonAction(button7,"1");

        Button button8 = (Button)findViewById(R.id.button5_8);
        buttonAction(button8,"2");

        Button button9 = (Button)findViewById(R.id.button5_9);
        buttonAction(button9,"3");

        Button button10 = (Button)findViewById(R.id.button5_10);
        buttonAction(button10,"0");

        Button button11 = (Button)findViewById(R.id.button5_11);
        buttonAction(button11,"00");

        Button button12 = (Button)findViewById(R.id.button5_12);
        buttonAction(button12,".");

        Button button13 = (Button)findViewById(R.id.button5_13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = editText.getText().toString();
                if(!text.equals(""))
                    text=text.substring(0,text.length()-1);
                if(text.equals(""));
                    text = "0";
                editText.setText(text);
            }
        });

        Button button14 = (Button)findViewById(R.id.button5_14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("0");
                max =Double.MIN_VALUE;
                min =Double.MAX_VALUE;
                re.clear();
                textView3.setText("0");
                textView5.setText("0");
                textView7.setText("0");
                textView9.setText("0");
            }
        });



    }



    private void buttonAction(Button bt,final String str){
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = editText.getText().toString();
                if(text.equals("0")){
                    if(str.equals("00")||str.equals("."))
                        text = "0";
                    else
                        text = str;
                }
                else
                    text = text + str;
                editText.setText(text);
            }
        });
    }

}
