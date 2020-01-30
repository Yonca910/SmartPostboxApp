package com.example.smartpostbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Anmeldung1 extends AppCompatActivity {

    private Button btnWeiterAnm1;
    private Button btnZuruckAnm1;
    private TextView TVPasswortAnm1;
    private TextView TVBenutzernameAnm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anmeldung1);

        btnWeiterAnm1 = (Button) findViewById(R.id.btnWeiterAnm1);
        btnZuruckAnm1 = (Button) findViewById(R.id.btnZuruckAnm1);
        TVPasswortAnm1 = (TextView) findViewById(R.id.TVPasswortAnm1);
        TVBenutzernameAnm1 = (TextView) findViewById(R.id.TVPasswortAnm1);


        btnWeiterAnm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TVPasswortAnm1.getText().toString().equals("123") && (TVPasswortAnm1.getText().toString().equals("123"))){
                    Intent go = new Intent(Anmeldung1.this, SmartpostboxMain.class);
                    startActivity(go);
                    System.out.println("je");
                }else{
                    System.out.println(TVBenutzernameAnm1.getText().toString());
                    System.out.println(TVPasswortAnm1.getText().toString());
                    System.out.println("no");
                }
            }
        });

        btnZuruckAnm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Anmeldung1.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}
