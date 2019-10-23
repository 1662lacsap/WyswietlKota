package horyn.pl.wyswietlkota;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchCat(View view){

        ImageView image = (ImageView) findViewById(R.id.cat1ImageView);
        image.setImageResource(R.drawable.cat2);

        Log.i("Info", "Nacisnienty przycisk");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
