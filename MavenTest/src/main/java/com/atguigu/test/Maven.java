package com.atguigu.test;

import org.apache.log4j.Logger;

public class Maven {
	private static final Logger logger = Logger.getLogger(Maven.class);
	public static void main(String[] args) {
		/*logger.debug("hello-----debug");
		logger.info("hello------info");
		logger.warn("hello------warn");
		logger.error("hello------error");*/
		try{
		logger.debug("1111111");
		int age = 5/0;
		logger.debug("222222222");
		logger.debug("33333333333444444");
		logger.debug("55555555555555555555555555");
		logger.debug("田伯光到此一游!");
		logger.debug("123123123！");
		}catch(Exception e){
			e.printStackTrace();
			logger.error("出错了！！！");
			logger.error(e.getMessage(),e.getCause());
		}
	}
}
