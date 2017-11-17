package cn.xufucun.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.et_search);
        LinearLayout nowPlayLayout = findViewById(R.id.layout_now_play);
        ImageView imageView = findViewById(R.id.singer1);
        ImageView imageView2 = findViewById(R.id.singer2);
        ImageView imageView3 = findViewById(R.id.singer3);


        editText.setOnClickListener(this);
        nowPlayLayout.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.et_search:
                startActivity(new Intent(this, SearchActivity.class));
                break;
            case R.id.layout_now_play:
                startActivity(new Intent(this, NowPlayActivity.class));
                break;
            case R.id.singer1:
                startActivity(new Intent(this, AlbumActivity.class));
                break;
            case R.id.singer2:
                startActivity(new Intent(this, AlbumActivity.class));
                break;
            case R.id.singer3:
                startActivity(new Intent(this, AlbumActivity.class));
                break;

            default:
                break;

        }

    }
}
