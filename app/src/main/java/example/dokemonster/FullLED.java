package example.dokemonster;

public class FullLED {
    static{
        System.loadLibrary("fullLED");

    }

    public native boolean fullLEDControl(int lednum, int val1, int val2, int val3);

    public void display(int case_num) {
        int red = 0, green = 0, blue = 0;

        switch(case_num){
            case 1:
                try {
                    for(int i = 0; i < 3; i++){
                        red = 255;
                        green = 0;
                        blue = 0;
                        fullLEDControl(9, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(8, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(6, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(7, red, green, blue);
                        Thread.sleep(200);
                        red = 0;
                        green = 0;
                        blue = 0;
                        fullLEDControl(9, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(8, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(6, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(7, red, green, blue);
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    for(int i = 0; i < 3; i++){
                        red = 0;
                        green = 255;
                        blue = 0;
                        fullLEDControl(9, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(8, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(6, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(7, red, green, blue);
                        Thread.sleep(200);
                        red = 0;
                        green = 0;
                        blue = 0;
                        fullLEDControl(9, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(8, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(6, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(7, red, green, blue);
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 3:
                try {
                    for(int i = 0; i < 3; i++){
                        red = 255;
                        green = 255;
                        blue = 255;
                        fullLEDControl(5, red, green, blue);
                        Thread.sleep(200);
                        fullLEDControl(5, 0, 0, 0);
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case 4:
                red = 255;
                green = 255;
                blue = 255;
                fullLEDControl(5, red, green, blue);
                break;
        }
    }
}
