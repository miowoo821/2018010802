package com.example.student.a2018010802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String,Object>> mylist=new ArrayList();
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.listview);

        HashMap<String,Object> m1=new HashMap<>();
        m1.put("city","台北");
        m1.put("code","02");
        m1.put("pic",R.drawable.taipei);
        mylist.add(m1);

        HashMap<String,Object> m2=new HashMap<>();
        m2.put("city","台中");
        m2.put("code","04");
        m2.put("pic",R.drawable.tc);
        mylist.add(m2);

        HashMap<String,Object> m3=new HashMap<>();
        m3.put("city","台南");
        m3.put("code","06");
        m3.put("pic",R.drawable.tn);
        mylist.add(m3);

        SimpleAdapter adp=new SimpleAdapter(MainActivity.this,mylist, android.R.layout.simple_list_item_2,
                new String[]{"city","code","pic"},
                new int[]{android.R.id.text1,android.R.id.text2}
                );
         /*         SimpleAdapter的五個參數
                           1.作用的葉面
                           2.要放的資料(ArrayList)
                           3.放在哪個layout資源上(ID)(可自寫layout，)ITEM2是LISTVIEW預設,下面是自訂
                           4.放入陣列的字各叫甚麼(屬於字串
                           5.放入陣列的ID各是(ID是int)
                 */
        SimpleAdapter adp2=new SimpleAdapter(MainActivity.this,mylist, R.layout.myitem,
                new String[]{"city","code","pic"},
                new int[]{R.id.textView,R.id.textView2,R.id.imageView}
        );

        lv.setAdapter(adp2);

    }


}
