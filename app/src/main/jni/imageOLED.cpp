#include <stdlib.h>
#include "example_dokemonster_ImageOLED.h"

/*
JNIEXPORT void JNICALL Java_example_dokemonster_ImageOLED_OLEDControl
(JNIEnv *env, jobject obj, jintArray image){
    int ret, temp, fd = -1;
    unsigned short buf[128*128];
    unsigned short r = 0, g = 0, b = 0;

    int *data;
    data = (int*) (*env).GetIntArrayElements(image, 0);

    fd = open("/dev/fpga_oled", O_WRONLY | O_NDELAY);
    if(fd != -1){
        for (int i = 0; i < 128*128; i++){
            temp = data[i];
            b = (unsigned short)((temp & 0x000000FF) >> 3);
            g = (unsigned short)((temp & 0x0000FF00) >> 5);
            r = (unsigned short)((temp & 0x00FF0000) >> 8);
            buf[i] = ((r&0xf800) | (g&0x07e0) | (b&0x001f));
        }
        ret = write (fd, buf, 128*128*2);
    }
    close(fd);
    (*env).ReleaseIntArrayElements(image, data, 0);
}*/

JNIEXPORT void JNICALL Java_example_dokemonster_ImageOLED_OLEDControl(JNIEnv *env, jobject instance, jint num){
    switch((int)num){
        case 0:
            system("sh -c \"/data/local/tmp/oled_control /data/local/tmp/stage1_img.raw &\"");
            break;

        case 1:
            system("sh -c \"/data/local/tmp/oled_control /data/local/tmp/stage2_img.raw &\"");
            break;

        case 2:
            system("sh -c \"/data/local/tmp/oled_control /data/local/tmp/stage3_img.raw &\"");
            break;

        case 3:
            system("sh -c \"/data/local/tmp/oled_control /data/local/tmp/clear_img.raw &\"");
            break;

        default:
            system("sh -c \"/data/local/tmp/oled_clear &\"");
            break;
    }
}
