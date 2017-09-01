package com.cxz.videoplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cxz.videoplayer.utils.MockUtils;
import com.library.videoplayer.VideoDetailInfo;
import com.library.videoplayer.ui.VideoPlayActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoDetailInfo info = MockUtils.mockData(VideoDetailInfo.class);
                VideoPlayActivity.start(MainActivity.this, info);

//                String filePath = Environment.getExternalStorageDirectory()+"/DCIM/Camera/Video/111.mp4";
//                boolean is = new File(filePath).exists();
//                Log.e("TAG","------------------------>"+is);
//                VideoDetailInfo info = new VideoDetailInfo();
//                info.setTitle("");
//                info.setVideoPath(filePath);
//                VideoPlayActivity.start(MainActivity.this, info);
            }
        });

    }
}
