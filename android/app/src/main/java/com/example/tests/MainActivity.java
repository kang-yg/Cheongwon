package com.example.tests;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    long now = System.currentTimeMillis();   // 현재시간을 msec형식으로 함
    Date date = new Date(now); // 현재시간을 date 변수에 저장
    SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String formatDate = sdfNow.format(date);   // nowDate 변수에 값을 저장

    TextView dateNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateNow = (TextView) findViewById(R.id.dateNow);
        dateNow.setText(formatDate);    // TextView 에 현재 시간 문자열 할당
        //한달후
    }

}
