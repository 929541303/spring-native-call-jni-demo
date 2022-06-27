package com.server.mediamanager;

import com.sun.jna.Native;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.nativex.hint.NativeHint;

@SpringBootApplication
//@EnableOpenApi
@Slf4j

@NativeHint(options = {
		"-H:+ReportExceptionStackTraces",
		"-H:+ReportExceptionStackTraces",
		"-H:ConfigurationFileDirectories=config-dir",
		"-H:TraceClassInitialization=true",
		"-H:+AllowVMInspection",
		"-H:+JNI"
})
public class MediamanagerApplication {



	public static void main(String[] args) {
		try{
			log.info("Media Manager Service starting.");
			log.info("Media Manager Service starting===" + System.getProperty("java.library.path"));
			ConfigurableApplicationContext mContext = SpringApplication.run(MediamanagerApplication.class, args);

			new HelloWorld().print();
		}catch (Exception e) {
			log.error("start MediamanagerApplication error", e);
		}

	}

}
