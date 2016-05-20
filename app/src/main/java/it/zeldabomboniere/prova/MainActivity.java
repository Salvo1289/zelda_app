package it.zeldabomboniere.prova;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
import android.app.Notification;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View;
import android.content.Intent;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.view.MenuInflater;
import android.net.Uri;
import android.widget.Toast;
import android.view.MenuItem;
import java.util.List;

public class MainActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//inizio creazione click del bottone

        ImageButton button1 = (ImageButton)findViewById(R.id.wedding);
        registerForContextMenu(button1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View a) {
                openContextMenu(a);
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.articolinatalizi);
        registerForContextMenu(button2);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View b) {
                openContextMenu(b);
            }
        });

//fine creazione click del bottone
    }
    //inizio gestione bottoni

    @Override
    public void onCreateContextMenu(ContextMenu menu,View view, ContextMenu.ContextMenuInfo menuInfo){
        if (view.getId() == R.id.wedding){

            super.onCreateContextMenu(menu, view, menuInfo);
        menu.setHeaderTitle("Addobbi Wedding");
        getMenuInflater().inflate(R.menu.contextmenu, menu);
        }
        else if (view.getId() == R.id.articolinatalizi){

            super.onCreateContextMenu(menu, view, menuInfo);
            menu.setHeaderTitle("Articoli Natalizi");
            getMenuInflater().inflate(R.menu.button2, menu);

        }
        else if (view.getId() == R.id.bomboniere){

            super.onCreateContextMenu(menu, view, menuInfo);
            menu.setHeaderTitle("Bomboniere");
            getMenuInflater().inflate(R.menu.button2, menu);

        }
    }


    @Override
    public boolean onContextItemSelected(MenuItem item)
            {
                switch (item.getItemId()){
                    case R.id.context1:
                        Intent chisiamo = new Intent(MainActivity.this, chisiamo.class);
                        startActivity(chisiamo);
                        return false;

                    case  R.id.context2:
                        break;

                    case R.id.button2_1:
                        Intent chi = new Intent(MainActivity.this, chisiamo.class);
                        startActivity(chi);
                        return false;


                }
                return super.onContextItemSelected(item);
            }
    //fine gestione bottoni


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        int id=item.getItemId();
        switch(id)
        {
            case R.id.menu1:
                Intent chisiamo = new Intent(MainActivity.this, chisiamo.class);
                startActivity(chisiamo);
                return false;

            case R.id.menu2:
                        Intent opentel=new Intent(getIntent().ACTION_DIAL, Uri.parse("tel:0766570511"));
                        startActivity(opentel);
                break;

            case R.id.menu3:
                Intent openmail=new Intent(getIntent().ACTION_SEND);
                openmail.putExtra(getIntent().EXTRA_EMAIL,"zeldabomboniere@gmail.it");
                openmail.putExtra(getIntent().EXTRA_SUBJECT, "Informazione");
                openmail.setType("text/plain");
                startActivity(openmail);

                break;

            case R.id.menu4:

            case R.id.menu5:

            case R.id.menu6:

        }
        return false;
    }
}

