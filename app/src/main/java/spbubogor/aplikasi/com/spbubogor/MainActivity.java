package spbubogor.aplikasi.com.spbubogor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), CariLokasi.class);
                startActivity(i);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), InfoSpbu.class);
                startActivity(i);

            }

        });
        button3.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {

                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), About.class);
                startActivity(i);
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);
            }
        });
    }

}
