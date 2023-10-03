package com.example.lab2_231003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {
    //计数器
    private int count = 0;
    //这里不可以tvCount = findViewById(R.id.tvCount); 否则会抛出空指针异常。未解决
    private TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        tvCount = findViewById(R.id.tvCount);

        Button addCount = findViewById(R.id.Add);
        addCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*通过弹窗的方式显示，下同
                Toast.makeText(CounterActivity.this, "The current number is：" + Integer.toString(++count),
                        Toast.LENGTH_SHORT).show();*/
                //通过修改textview显示，下同
                tvCount.setText("The current number is: " + Integer.toString(++count));
            }
            });

        Button reduceCount = findViewById(R.id.Reduce);
        reduceCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(CounterActivity.this, "The current number is：" + Integer.toString(--count),
//                        Toast.LENGTH_SHORT).show();
                tvCount.setText("The current number is: " + Integer.toString(--count));
            }
        });

        Button clearCount = findViewById(R.id.Clear);
        clearCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                /*Toast.makeText(CounterActivity.this, "The current number is：" + Integer.toString(count),
                        Toast.LENGTH_SHORT).show();*/
                tvCount.setText("The current number is: " + Integer.toString(count));
            }
        });


        }
}