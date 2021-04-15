package edu.csumb.randomapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class RandoActivity extends AppCompatActivity {
    private int counting = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rando);
        TextView textView = findViewById(R.id.rando_text);

        Button button = findViewById(R.id.rando_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                counting++;
                int sum = addition(1, counting);
                textView.setText(""+counting+"\n"+sum);
            }
        });

    }

    public int addition(int num1, int num2){
        return num1+num2;
    }

}
