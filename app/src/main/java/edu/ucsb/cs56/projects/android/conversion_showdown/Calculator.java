package edu.ucsb.cs56.projects.android.conversion_showdown;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;


//Java file responsible for the Calculator mode on the Application
public class Calculator extends Activity implements OnClickListener {

        Button btnStartAnotherActivity;

    /**
     * Initialize the whole activity view.
     * @param savedInstanceState
     */
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.calculator);
            btnStartAnotherActivity = (Button) findViewById(R.id.btnStartAnotherActivity);
            btnStartAnotherActivity.setOnClickListener(this);
        }

    /**
     * When clicked, start the calculation process.
     * @param view
     */
    @Override
        public void onClick(View view) {
            Intent intent = new Intent(this, QuizSelection.class);
            // calling an activity using <intent-filter> action name
            startActivity(intent);
        }

    /**
     * Check if numbers are entered into two text fields and calculate and show the result in result text field.
     * @param v
     */
    public void onButtonClick(View v){
            MyUtils.hideSoftKeyBoard( v, (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE) );
            // 2 text fields - Edit Text
            EditText a1 = (EditText)findViewById(R.id.TFnum1);
            EditText a2 = (EditText)findViewById(R.id.TFnum2);

            String sAnswer1 = a1.getText().toString();
            String sAnswer2 = a2.getText().toString();

            if(TextUtils.isEmpty(sAnswer1) ||  TextUtils.isEmpty(sAnswer2)) {
                a1.setError("Please enter a number");
                a2.setError("Please enter a number");
                return;
            }

            // 1 result label - Text View
            TextView tv = (TextView)findViewById(R.id.Lresult);

            double num1, num2, ans;
            boolean flag = false; // no division by zero error

            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());
            ans = 0;

            if(v.getId() == R.id.Badd)
                ans = num1 + num2;
            if(v.getId() == R.id.Bsub)
                ans = num1 - num2;
            if(v.getId() == R.id.Bmult)
                ans = num1 * num2;
            if(v.getId() == R.id.Bdiv)
                // divison by 0 error
                if (num2 == 0)
                    flag = true; // division by zero error
                else
                    ans = num1 / num2;

            tv.setText(ans + "");
        }
}

