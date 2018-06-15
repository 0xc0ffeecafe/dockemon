#include "example_dokemonster_DotMatrix.h"

jint Java_example_dokemonster_DotMatrix_DotMatrixControl(JNIEnv* env, jobject thiz, jstring data){
    const char* buf;
    int dev, ret, len;
    char str[100];

    buf = (*env).GetStringUTFChars(data, 0);
    len = (*env).GetStringLength(data);

    dev = open("/dev/fpga_dotmatrix", O_RDWR | O_SYNC);

    if(dev != -1){
        ret = write(dev, buf, len);
        close(dev);
    }

    return 0;
};