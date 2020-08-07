package cn.ekgc.mystical.util;

import java.util.Properties;

/**
 * <b>系统常量工具类</b>
 * @author Dell
 * @version 1.0.0 2020-08-06
 * @since 1.0.0
 *
 * */
public class ConstantUtil {
	private static Properties props=new Properties();
	static{
		try {
			//加载配置文件
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("express.properties"));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public static final Integer PAGE_NUM=Integer.parseInt(props.getProperty("page.num"));

	public static final Integer PAGE_SIZE=Integer.parseInt(props.getProperty("page.size"));
}
