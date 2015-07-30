package com.example.elva_yiwei.menu_order;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;


public class allorder extends TabActivity {

    private ListView listview;

    private ArrayList<String> array=new ArrayList<String>();
    //  private ArrayAdapter myAdapter;
    private Adapter adapter;

    private Button Jielanji;
    private Button Jielanniu;
    private Button Jielanxia;
    private Button Hunanji;
    private Button Hunanniu;
    private Button Hunanxia;
    private Button Shencaiji;
    private Button Shencainiu;
    private Button Shencaixia;

    Button Xihuangjiao;
    Button Chezaimian;
    Button Boluobao;
    Button Yumitang;
    Button Chashaorou;
    Button Gulaorou;
    Button Youbaoxia;
    Button Guzhifengzhua;
    Button Changfen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allorder);
        TabHost tabHost = getTabHost();


        tabHost.addTab(tabHost.newTabSpec("tab01").setIndicator("美式中餐").setContent(R.id.chinese));

        tabHost.addTab(tabHost.newTabSpec("tab02").setIndicator("川菜").setContent(R.id.sichuan));

        tabHost.addTab(tabHost.newTabSpec("tab03").setIndicator("粤菜").setContent(R.id.hongkong));

        tabHost.addTab(tabHost.newTabSpec("tab04").setIndicator("日本料理").setContent(R.id.japanese));

        tabHost.addTab(tabHost.newTabSpec("tab05").setIndicator("韩式烧烤").setContent(R.id.korea));
        Jielanji = (Button) findViewById(R.id.jielanji);
        Jielanniu = (Button) findViewById(R.id.jielanniu);
        Jielanxia = (Button) findViewById(R.id.jielanxia);

        Hunanji = (Button) findViewById(R.id.hunanji);
        Hunanniu = (Button) findViewById(R.id.hunanniu);
        Hunanxia = (Button) findViewById(R.id.hunanxia);

        Shencaiji = (Button) findViewById(R.id.shencaiji);
        Shencainiu = (Button) findViewById(R.id.shencainiu);
        Shencaixia = (Button) findViewById(R.id.shencaixia);

        listview = (ListView) findViewById(R.id.listView2);
        adapter = new Adapter(this,array);

        Jielanji.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("芥兰鸡");
                listview.setAdapter(adapter);
            }
        });

        Jielanniu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("芥兰牛");
                //   myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Jielanxia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("芥兰虾");
                //  myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Hunanji.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("湖南鸡");
                //  myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Hunanniu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("湖南牛");
                //  myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Hunanxia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("湖南虾");
                //   myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Shencaiji.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("什菜鸡");
                //     myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Shencainiu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("什菜牛");
                //  myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Shencaixia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("什菜虾");
                //   myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });
        Xihuangjiao = (Button) findViewById(R.id.xiahuangjiao);
        Boluobao = (Button) findViewById(R.id.boluobao);
        Chezaimian = (Button) findViewById(R.id.chezaimian);

        Gulaorou = (Button) findViewById(R.id.gulaorou);
        Chashaorou = (Button) findViewById(R.id.chashaorou);
        Youbaoxia = (Button) findViewById(R.id.youbaoxia);

        Changfen = (Button) findViewById(R.id.changfen);
        Yumitang = (Button) findViewById(R.id.paigutang);
        Guzhifengzhua = (Button) findViewById(R.id.fengzhua);

        Xihuangjiao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("虾皇饺");
                listview.setAdapter(adapter);
            }
        });

        Boluobao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("菠萝包");
                //   myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Chezaimian.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("车仔面");
                //  myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Gulaorou.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("咕老肉");
                //  myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Chashaorou.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("叉烧肉");
                //  myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Yumitang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("玉米排骨汤");
                //   myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Changfen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("肠粉");
                //     myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Youbaoxia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("油爆虾");
                //  myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });

        Guzhifengzhua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                array.add("鼓汁凤爪");
                //   myAdapter.notifyDataSetChanged();
                listview.setAdapter(adapter);
            }
        });



    }
    public void Submit(View view)
    {
        Intent intent;
        intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
