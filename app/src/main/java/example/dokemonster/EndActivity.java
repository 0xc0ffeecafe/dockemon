package example.dokemonster;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EndActivity extends AppCompatActivity {

    private ImageOLED imageOLED;
    private DotMatrix dotmatrix;
    private FullLED fullLED;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        ImageView imageView = (ImageView)findViewById(R.id.end_bg);
        imageView.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        ActivityCompat.finishAffinity(EndActivity.this);
                    }
                }
        );

        imageOLED = new ImageOLED(EndActivity.this);
        dotmatrix = new DotMatrix();
        fullLED = new FullLED();

        DisplayDotMatrix displaydotmatrix = new DisplayDotMatrix();
        displaydotmatrix.execute("Finish!");

        DisplayImage displayimage = new DisplayImage();
        displayimage.execute(9);

        DisplayFullLED displayfullled = new DisplayFullLED();
        displayfullled.execute(4);

    }

    private class DisplayDotMatrix extends AsyncTask<String, Void, Void> {
        @Override
        protected Void doInBackground(String... strings) {
            dotmatrix.display(strings[0]);
            return null;
        }
    }

    private class DisplayImage extends AsyncTask<Integer, Void, Void>{
        @Override
        protected Void doInBackground(Integer... integers) {
            imageOLED.display(integers[0] + 1);
            return null;
        }
    }

    private class DisplayFullLED extends AsyncTask<Integer, Void, Void>{
        @Override
        protected Void doInBackground(Integer... integers) {
            fullLED.display(integers[0]);
            return null;
        }
    }
}