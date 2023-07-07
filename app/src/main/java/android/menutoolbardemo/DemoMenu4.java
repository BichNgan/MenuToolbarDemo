package android.menutoolbardemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DemoMenu4 extends AppCompatActivity {
    TextView tvCM4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_menu4);
        tvCM4=(TextView) findViewById(R.id.tvCM4);
        registerForContextMenu(tvCM4);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.option_menu_4,menu);
        if(menu instanceof MenuBuilder)
        {
            MenuBuilder m =(MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.setting4)
        {
            Toast.makeText(getApplicationContext(),"Setting",Toast.LENGTH_SHORT).show();
        }
        else  if(id==R.id.facebook4)
        {
            Toast.makeText(getApplicationContext(),"Setting",Toast.LENGTH_SHORT).show();
        }
//        switch (id)
//        {
//            case R.id.setting4:
//
//                break;
//            case R.id.facebook4:
//                Toast.makeText(getApplicationContext(),"Facebook",Toast.LENGTH_SHORT).show();
//                break;
//        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.insert4)
        {
            Toast.makeText(getApplicationContext(),"Insert",Toast.LENGTH_SHORT).show();
        }
        else  if(id==R.id.delete4)
        {
            Toast.makeText(getApplicationContext(),"Delete4",Toast.LENGTH_SHORT).show();
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            MenuInflater menuInflater=getMenuInflater();
            menuInflater.inflate(R.menu.context_menu_4,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}