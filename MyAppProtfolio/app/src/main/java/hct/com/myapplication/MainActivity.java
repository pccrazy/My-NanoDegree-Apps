package hct.com.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    Button app1,app2,app3,app4,app5,app6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app1=(Button)findViewById(R.id.app1);    app1.setOnClickListener(this);
        app2=(Button)findViewById(R.id.app2);    app2.setOnClickListener(this);
        app3=(Button)findViewById(R.id.app3);    app3.setOnClickListener(this);
        app4=(Button)findViewById(R.id.app4);    app4.setOnClickListener(this);
        app5=(Button)findViewById(R.id.app5);    app5.setOnClickListener(this);
        app6=(Button)findViewById(R.id.app6);    app6.setOnClickListener(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Button b=(Button)v.findViewById(v.getId());
        Toast.makeText(MainActivity.this,"You Clicked "+b.getText().toString(),Toast.LENGTH_SHORT).show();
    }
}
