package debug;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.jackie.bundle_business.BusinessActivity;
import com.jackie.bundle_platform.BaseActivity;

public class LaunchActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, BusinessActivity.class);
        intent.putExtra("business","wk655");
        startActivity(intent);
        finish();
    }
}
