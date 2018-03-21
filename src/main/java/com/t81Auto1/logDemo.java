package com.t81Auto1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class logDemo {
	private static Logger logger=LogManager.getLogger(logDemo.class.getName());
    public static void main(String args[]) {
    	logger.fatal("fatal:系统已经死机");
    	logger.error("error错误：系统。。。");
    	logger.warn("warn消息");
    	logger.info("info消息");
    	logger.debug("debug");
}
}
