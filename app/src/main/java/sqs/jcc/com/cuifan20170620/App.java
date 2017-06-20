package sqs.jcc.com.cuifan20170620;

import android.app.Application;

import org.xutils.x;


/**
 * data:2017/6/20
 * author:崔帆(Administrator)
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);

    }
}
