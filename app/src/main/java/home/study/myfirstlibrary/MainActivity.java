package home.study.myfirstlibrary;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import home.study.library2.ToastLibrary2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToastLibrary2.printlog("start...");
        String message = "First message";
        ToastLibrary2.toast2(this, R.string.app_name);
        ToastLibrary2.printlog("end...");

    }
}
