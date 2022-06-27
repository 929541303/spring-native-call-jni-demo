#include <jni.h>
#include <stdio.h>
#include "com_server_mediamanager_HelloWorld.h"

JNIEXPORT void JNICALL
Java_com_server_mediamanager_HelloWorld_print(JNIEnv *env, jobject obj) {

        printf("Hello world; this is C talking!\n");
        return;
}

