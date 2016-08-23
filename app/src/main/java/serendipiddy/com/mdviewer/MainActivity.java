package serendipiddy.com.mdviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import in.uncod.android.bypass.Bypass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView) findViewById(R.id.demoText);
        Bypass bypass = new Bypass(this);
        String markdownString = "#Markdown!\n This is the demo text for **Mark***down*.\n\n![An image](an_image.png)\n\n[this in an external link](http://github.com/serendipiddy).\n\n [this is an internal link](file.md).\n";
        CharSequence string = bypass.markdownToSpannable(markdownString);
        text.setText(string);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
