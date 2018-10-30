package com.example.lzdd.uicustomviews;

        import android.content.Context;
        import android.drm.DrmStore;
        import android.support.v7.app.ActionBar;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.AttributeSet;
        import android.widget.LinearLayout;

        import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null)
            actionbar.hide();
    }
}
