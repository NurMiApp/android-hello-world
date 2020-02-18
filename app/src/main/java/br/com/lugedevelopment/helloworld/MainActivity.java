package br.com.lugedevelopment.helloworld;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
        textView = changeTextViewSettings(textView);
        printHelloWorld(textView);
    }

    private TextView changeTextViewSettings(TextView textView) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        }
        return textView;
    }

    private void printHelloWorld(TextView textView) {
        String text = "I'm not the stardard\n";
        text += getString(R.string.hello_world);
        textView.setText(text);
    }
}
