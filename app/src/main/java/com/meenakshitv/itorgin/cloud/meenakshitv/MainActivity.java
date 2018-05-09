package com.meenakshitv.itorgin.cloud.meenakshitv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(R.layout.activity_main);
    new Timer().schedule(new TimerTask()
    {
      public void run()
      {
        Intent localIntent = new Intent(MainActivity.this.getApplicationContext(), VideoActivity.class);
        MainActivity.this.startActivityForResult(localIntent, 0);
      }
    }, 4000L);
  }
}
