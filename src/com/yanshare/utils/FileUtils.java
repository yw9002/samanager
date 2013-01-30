package com.yanshare.utils;

import java.io.File;

public class FileUtils {
	private static boolean flag = false;
	public static boolean deleteFile(String sPath) {   
	    File file = new File(sPath);   
	    // 路径为文件且不为空则进行删除   
	    if (file.isFile() && file.exists()) {   
	        file.delete();   
	        flag = true;   
	    }   
	    return flag;   
	}
}
