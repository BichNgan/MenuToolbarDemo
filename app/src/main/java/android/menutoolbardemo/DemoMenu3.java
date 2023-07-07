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

public class DemoMenu3 extends AppCompatActivity {

    TextView tvCT3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_menu3);

        tvCT3=(TextView) findViewById(R.id.tvContextMenu3);
        registerForContextMenu(tvCT3);
    }
    //Hàm để gắn menu layout với activity
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.option_menu_3,menu);
        //Hiển thị icon kèm theo cho các item
        if(menu instanceof MenuBuilder)
        {
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
//        if(id==R.id.app_bar_search3)
//        {
//            Toast.makeText(getApplicationContext(),"Search", Toast.LENGTH_SHORT).show();
//        }
//        else if
        switch (id)
        {
            case R.id.app_bar_search3:
                Toast.makeText(getApplicationContext(),"Search", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting3:
                Toast.makeText(getApplicationContext(),"Setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.facebook3:
                Toast.makeText(getApplicationContext(),"Facebook", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.context_menu_3,menu);
        if(menu instanceof MenuBuilder)
        {
            MenuBuilder m =(MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
       int id=item.getItemId();
       switch (id)
       {
           case R.id.insert3:
               Toast.makeText(getApplicationContext(),"Insert", Toast.LENGTH_SHORT).show();
               break;
           case R.id.delete3:
               Toast.makeText(getApplicationContext(),"Delete", Toast.LENGTH_SHORT).show();
               break;

       }


        return super.onContextItemSelected(item);
    }
}