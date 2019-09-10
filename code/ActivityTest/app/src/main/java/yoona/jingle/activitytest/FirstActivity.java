package yoona.jingle.activitytest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FirstActivity.this,"你按下了按钮1！",Toast.LENGTH_SHORT).show();
                //finish();
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //Intent intent = new Intent(".ACTION_START");

                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://www.baidu.com"));

                //Intent intent = new Intent(Intent.ACTION_DIAL);
                //intent.setData(Uri.parse("tel:15178967172"));

                //intent.addCategory(".MY_CATEGORY");

                //String data = "Hello SecondActivity";
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //intent.putExtra("extra_data",data);
                //Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
                startActivity(intent);
                //startActivityForResult(intent,1);
            }
        });
        Log.d("FirstActivity", "onCreate: FirstActivity create!");
        Log.d("FirstActivity", "onCreate: Task id is" + getTaskId());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
                default:
                    break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            String str = data.getStringExtra("data_return");
            Log.d("FirstActivity", "onActivityResult: " + str);
            Log.d("requestCode", "onActivityResult: requestCode =" + requestCode);
        }
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("FirstActivity", "onRestart:重启! ");
    }
}
