package sqs.jcc.com.cuifan20170620;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.lidroid.xutils.BitmapUtils;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private GridView gv;
    private GridView photo_wall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photo_wall = (GridView) findViewById(R.id.photo_wall);
        String filePath = Utils.getDiskCacheDir(this, "bitmap");
        File directory  = new File(filePath);
        if(!directory.exists())
        {
            directory.mkdirs();
        }
        BitmapUtils bitmapUtils = new BitmapUtils(this, filePath);
        GridViewAdapter adapter = new GridViewAdapter(this, Utils.imageUrls, bitmapUtils);
        photo_wall.setAdapter(adapter);
    }

}




