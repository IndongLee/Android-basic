package com.example.a13_gridview_movielist;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("그리드뷰 영화 포스터");

        final GridView gv = (GridView) findViewById(R.id.gridView1);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);

    }

    public class MyGridAdapter extends BaseAdapter {
        Context context;
        public MyGridAdapter(Context c) {
            context = c;
        }

        Integer[] posterID = {
                R.drawable.basterds, R.drawable.callmebyyourname, R.drawable.detroit,
                R.drawable.julieta, R.drawable.lastmission, R.drawable.maggie,
                R.drawable.marriagestory, R.drawable.parasite, R.drawable.requiem
        };

        public int getCount() {
            return posterID.length;
        }

        public Object getItem(int arg0) {

            return null;
        }

        public long getItemId(int arg0) {

            return 0;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(400, 500));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(10, 10, 10, 10);

            imageView.setImageResource(posterID[position]);

            final int pos = position;
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    View dialogView = (View) View.inflate(MainActivity.this, R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    ImageView ivPoster = (ImageView) dialogView.findViewById(R.id.ivPoster);
                    ivPoster.setImageResource(posterID[pos]);
                    dlg.setTitle("포스터 크게 보기");
                    dlg.setView(dialogView);
                    dlg.setNegativeButton("닫기", null);
                    dlg.show();
                }
            });
            return imageView;
        }
    }
}
