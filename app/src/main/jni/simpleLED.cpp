#include "example_dokemonster_SimpleLED.h"

JNIEXPORT jboolean JNICALL Java_example_dokemonster_SimpleLED_simpleLEDControl(JNIEnv *env, jobject obj, jint data) {
    int fd = -1;

    fd = open("/dev/fpga_led", O_RDWR);
    if(fd != -1){
        data &= 0xff;
        write(fd, &data, 4);
        close(fd);
    }

    return 0;
}
