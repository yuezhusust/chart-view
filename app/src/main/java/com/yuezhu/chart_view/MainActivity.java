package com.yuezhu.chart_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MyChartView chartView1,chartView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chartView1= (MyChartView) findViewById(R.id.chart_view1);
        chartView2= (MyChartView) findViewById(R.id.chart_view2);
        setData();
    }

    private void setData() {
        String title = "7日年化收益率（%）";
        String[] xLabel1 = {"12-11","12-22","12-13","12-14","12-15","12-16","12-17"};
        String[] xLabel2 ={"2-13","2-14","2-15","2-16","2-17","2-18","2-19"};
        String[] data1={"2.92","2.99","3.20","2.98","2.92","2.94","2.95"};
        String[] data2={"2.90","2.90","2.90","2.90","2.90","2.90","2.90"};
        chartView1.setxLabel(xLabel1);
        chartView1.setData(data1);
        chartView1.setTitle(title);
        chartView1.fresh();
        chartView2.setxLabel(xLabel2);
        chartView2.setData(data2);
        chartView2.setTitle(title);
        chartView2.fresh();
    }

    public void loadData(View view){
        Toast.makeText(this,"正在加载数据...",Toast.LENGTH_LONG).show();
        view.postDelayed(new Runnable() {
            @Override
            public void run() {
                setData();
                Toast.makeText(MainActivity.this, "数据加载成功", Toast.LENGTH_SHORT).show();
            }
        },3000);
    }
}
