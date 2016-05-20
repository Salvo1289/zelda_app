package it.zeldabomboniere.prova;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.view.View;
import android.util.Log;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import java.util.ArrayList;
import android.net.Uri;

/**
 * Created by Salvo on 20/11/15.
 */
public class Addobbiweedding extends ActionBarActivity {
    ListView listView ;
    private ArrayAdapter<String> listviewAdapter;
    private ArrayAdapter<String> spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorie);
    }

}

