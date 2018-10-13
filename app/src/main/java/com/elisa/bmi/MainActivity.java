package com.elisa.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view){
        Log.d("MainActivity","bmi");
        EditText edWeight = findViewById(R.id.ed_weight);
        EditText edHeight = findViewById(R.id.ed_height);
        String w =edWeight.getText().toString();
        String h =edHeight.getText().toString();
        Log.d("MainActivity",w+"/"+h);
        float weight = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        float bmi = weight/(height*height);
        Log.d("MainActivity",bmi+"");
       Toast.makeText(this,"Your BMI is"+bmi,Toast.LENGTH_LONG).show();
       new AlerDialog.Builder(this)
               .setMessage("Your BMI is"+bmi)
               .setTitle("BMI")
               .setPositiveButton("OK",null)
               .setNegativeButton("clear",new DialogInterface.OnClickListener(){
           @Override
                   public void onClick(DialogInterface dialogInterface,int i){
               edWeight.setText(" ");
               edHeight.setText(" ");
            }
        })
               .show();
    }
}
