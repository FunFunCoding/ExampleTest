package com.ebookfrenzy.javalayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;
/*branch test*/
public class JavaLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button myButton = new Button(this);
        myButton.setText("Fuck Me");
        myButton.setBackgroundColor(Color.YELLOW);
        myButton.setTransformationMethod(null);

        EditText myEditText = new EditText(this);

        myButton.setId(R.id.myButtonId);
        myEditText.setId(R.id.myEditTextId);

        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.setBackgroundColor(Color.BLACK);

        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);
        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);


        myLayout.addView(myButton,buttonParams);
        setContentView(myLayout);
    }
}
