package tests;

import android.test.ActivityInstrumentationTestCase2;
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
}