package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kpurnomo.testproject.MyActivity;
import com.example.kpurnomo.testproject.R;

/**
 * Created by kpurnomo on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MyActivity> {

    MyActivity myActivity;

    public JUnit_test() {

        super(MyActivity.class);
    }



    public void test_first()
    {
        myActivity = getActivity();

        TextView textView = (TextView) myActivity.findViewById(R.id.txtResult);
        String tester = textView.getText().toString();

        EditText firstNumber = (EditText) myActivity.findViewById(R.id.txtNumber1);
        EditText secondNumber = (EditText) myActivity.findViewById(R.id.txtNumber2);

        double num1 = Double.parseDouble(firstNumber.getText().toString());
        double num2 = Double.parseDouble(secondNumber.getText().toString());

        assertEquals(myActivity.add(num1, num2), tester);

        // double num1 = 5;
        // double num2 = 9;
        // double sum = 14;

        //assertEquals(myActivity.add(num1, num2), sum);
    }
}