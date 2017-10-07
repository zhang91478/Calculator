package com.example.bsz.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class ActivitySix extends AppCompatActivity {


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
       /*     case R.id.option7:
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
        setContentView(R.layout.activity_six);
    }
}
