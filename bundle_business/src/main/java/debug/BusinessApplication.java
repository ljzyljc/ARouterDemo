package debug;

import android.util.Log;

import com.jackie.bundle_platform.BaseApplication;

public class BusinessApplication extends BaseApplication {
    private static final String TAG = "BusinessApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate: Business商业");
    }
}
