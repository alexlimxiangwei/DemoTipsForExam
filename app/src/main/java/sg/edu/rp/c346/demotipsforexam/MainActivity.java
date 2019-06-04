package sg.edu.rp.c346.demotipsforexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.lvExamTips);

        String[] examTips = new String[5];
        examTips[0] = "Prepare";
        examTips[1] = "Practice";
        examTips[2] = "Seek help";
        examTips[3] = "Template";
        examTips[4] = "create empty proj";

        ArrayAdapter<String> adaptedArray = new ArrayAdapter<String>(MainActivity.this, R.layout.text_view, examTips);
        lvExamTips.setAdapter(adaptedArray);

    }
}
