package com.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Config_Reader {
	public static Properties prop;
	public static FileInputStream ip;

	public static Properties initialisation() throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties");
		prop.load(ip);

		return prop;
	}

}
