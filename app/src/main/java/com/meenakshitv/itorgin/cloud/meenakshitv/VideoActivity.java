package com.meenakshitv.itorgin.cloud.meenakshitv;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.VideoView;

public class VideoActivity
  extends Activity
{
  String path;
  ProgressBar progressBar = null;
  
  protected void onCreate(Bundle paramBundle1)
  {
    super.onCreate(paramBundle1);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(R.layout.activity_video);
    this.progressBar = ((ProgressBar)findViewById(R.id.progressbar));
    VideoView paramBundle = (VideoView)findViewById(R.id.videoView1);
    this.path = "http://183.82.249.171:1935/rtplive/meenakshi/live1/playlist.m3u8";
    paramBundle.setVideoURI(Uri.parse(this.path));
    paramBundle.setMediaController(new MediaController(this));
    paramBundle.requestFocus();
    paramBundle.start();
    this.progressBar.setVisibility(View.VISIBLE);
    paramBundle.setOnPreparedListener(new OnPreparedListener()
    {
      public void onPrepared(MediaPlayer paramAnonymousMediaPlayer)
      {
        VideoActivity.this.progressBar.setVisibility(View.INVISIBLE);
        paramAnonymousMediaPlayer.start();
      }
    });
  }
}
