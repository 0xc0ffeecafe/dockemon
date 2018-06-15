LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := simpleLED
LOCAL_SRC_FILES := simpleLED.cpp
LOCAL_LDLIBS += -llog

include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)

LOCAL_MODULE    := textLCD
LOCAL_SRC_FILES := textLCD.cpp
LOCAL_LDLIBS := -llog


include $(BUILD_SHARED_LIBRARY)


include $(CLEAR_VARS)

LOCAL_MODULE    := imageOLED
LOCAL_SRC_FILES := imageOLED.cpp
LOCAL_LDLIBS := -llog


include $(BUILD_SHARED_LIBRARY)


include $(CLEAR_VARS)

LOCAL_MODULE    := 7segment
LOCAL_SRC_FILES := segment.cpp
LOCAL_LDLIBS := -llog


include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)

LOCAL_MODULE    := dotMatrix
LOCAL_SRC_FILES := dotMatrix.cpp
LOCAL_LDLIBS := -llog


include $(BUILD_SHARED_LIBRARY)

include $(CLEAR_VARS)

LOCAL_MODULE    := fullLED
LOCAL_SRC_FILES := fullLED.cpp
LOCAL_LDLIBS := -llog


include $(BUILD_SHARED_LIBRARY)

