package com.example.user.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends ListActivity {

    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();
    //使用List存入HashMap，用來顯示ListView上面的文字。

    private SimpleAdapter adapter;
    private static final String[] mPlaces = new String[] {
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣",
            "台北市", "新北市", "台南市", "高雄市", "苗粟縣"
    };

    private static final String[] mFoods = new String[] {
            "大餅包小餅", "蚵仔煎", "東山鴨頭", "臭豆腐", "潤餅",
            "豆花", "青蛙下蛋","豬血糕", "大腸包小腸", "鹹水雞",
            "烤香腸","車輪餅","珍珠奶茶","鹹酥雞","大熱狗",
            "炸雞排","山豬肉","花生冰","剉冰","水果冰",
            "包心粉圓","排骨酥","沙茶魷魚","章魚燒","度小月"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<mFoods.length;i++){
            HashMap<String,String> item = new HashMap<String, String>();
            item.put("food",mFoods[i]); //把title , text存入HashMap之中
            item.put("place",mPlaces[i]);
            list.add(item); //把HashMap存入list之中
        }
        adapter = new SimpleAdapter(
                this,
                list,
                android.R.layout.simple_list_item_2,
                new String[]{"food","place"},
                new int[]{android.R.id.text1,android.R.id.text2});
        // 5個參數 : context , List , layout , key1 & key2 , text1 & text2
        //http://aiur3908.blogspot.tw/2015/06/android-listview.html
        setListAdapter(adapter);

    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("n",position);
        startActivityForResult(intent,111);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }


