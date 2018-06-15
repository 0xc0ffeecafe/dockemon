package example.dokemonster;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

public class ImageOLED {
    static {
        System.loadLibrary("imageOLED");
    }

   // public native void OLEDControl(int[] image);
    public native void OLEDControl(int num);
    private Context context;
    private Bitmap bm;

    ImageOLED(Context ctx) {
        context = ctx;
    }

    public boolean display(int count) {

/*        java.io.InputStream stage1 = context.getResources().openRawResource(R.raw.stage1_img);
        java.io.InputStream stage2 = context.getResources().openRawResource(R.raw.stage2_img);
        java.io.InputStream stage3 = context.getResources().openRawResource(R.raw.stage3_img);
        java.io.InputStream clear = context.getResources().openRawResource(R.raw.clear_img);
        switch (count) {
            case 1:
                bm = BitmapFactory.decodeStream(stage1);
                break;
//            case 2:
//                close();
//                break;
            case 4:
                bm = BitmapFactory.decodeStream(stage2);
                break;
//            case 5:
//                close();
//                break;
            case 7:
                bm = BitmapFactory.decodeStream(stage3);
                break;
//            case 8:
//                close();
//                break;
            case 10:
                bm = BitmapFactory.decodeStream(clear);
                break;
        }

        if (count == 1 || count == 4 || count == 7 || count == 10) {
            int width = bm.getWidth();
            int height = bm.getHeight();
            final int[] pixels = new int[width * height];
            bm.getPixels(pixels, 0, width, 0, 0, width, height);

            OLEDControl(pixels);
        }
        return true;*/
        Log.e("OLEDControl Input", Integer.toString(count));
        if (count == 1) {
            OLEDControl(0);
        } else if (count == 4) {
            OLEDControl(1);
        } else if (count == 7) {
            OLEDControl(2);
        } else if (count == 10) {
            OLEDControl(3);
        }

        return true;
    }
}