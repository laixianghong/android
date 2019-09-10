package yoona.jingle.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        final Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        Log.d("SecondActivity", "onCreate: extra_data = " + data);
        Log.d("SecondActivity", "onCreate: Task id is " + getTaskId());

        Button btn2 = (Button)findViewById(R.id.button_2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_ret = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent_ret);
                //intent_ret.putExtra("data_return","Hello FirstActivity!");
                //setResult(RESULT_OK,intent_ret);
                //finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent_ret = new Intent();
        intent_ret.putExtra("data_return","Hello FirstActivity!");
        setResult(RESULT_OK,intent_ret);
        super.onBackPressed();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("SecondActivity", "onDestroy: 第二个活动销毁！");
    }
}
