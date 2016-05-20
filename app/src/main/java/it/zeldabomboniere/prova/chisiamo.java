package it.zeldabomboniere.prova;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

/**
 * Created by Salvo on 18/12/15.
 */
public class chisiamo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chisiamo);

        {
            String URL ="http://zeldabomboniere.it/joomla/index.php/chi-siamo";

            WebView View = (WebView) this.findViewById(R.id.webView);
            View.getSettings().setJavaScriptEnabled(true);
            View.loadUrl(URL);

        }
    }
}
