package home.study.my_toast_library;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

public class ToastLibrary {

    public static void toast1(Context context, String message) {
        if (context != null && !TextUtils.isEmpty(message)) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }

    public static void toast2(Context context, int message) {
        if (context != null && message > 0) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }

    public static void printlog(String message) {
        if (!TextUtils.isEmpty(message)) {
            Log.d("LOG_LIBRARY", message);
        }
    }




}
