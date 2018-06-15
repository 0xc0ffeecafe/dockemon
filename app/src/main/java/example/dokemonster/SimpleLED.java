package example.dokemonster;

import android.util.Log;

public class SimpleLED{

    private int cnt = 0;
    static{
        System.loadLibrary("simpleLED");
    }

    public native boolean simpleLEDControl(int stage);

    public boolean display(int count){
        if(count == 1 || count == 4 || count == 7)
            return simpleLEDControl(0x07);
        else if(count == 2 || count == 5 || count == 8)
            return simpleLEDControl(0x3f);
        else
            return simpleLEDControl(0xff);
    }
}