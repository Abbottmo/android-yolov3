package com.abbott.myyolov3;
import android.graphics.Bitmap;

public class YOLOV3 {
    static {
        System.loadLibrary("YOLOV3");
    }
    public native boolean Init(byte[] param, byte[] bin);
    public native float[] Detect(Bitmap bitmap);
    // Used to load the 'native-lib' library on application startup.



}
