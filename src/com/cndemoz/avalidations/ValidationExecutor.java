package com.cndemoz.avalidations;

import android.content.Context;

/**
 * 
 * 校验执行者
 * 
 * @author ken.cai
 * 
 */
public abstract class ValidationExecutor {
    /**
     * 规范内容长度
     * 
     * @param s
     *            输入的字符
     * @return
     */
    protected static int getWordCountRegex(String s) {
	s = s.replaceAll("[^\\x00-\\xff]", "**");
	int length = s.length();
	return length;
    }

    /**
     * 
     * 这里做校验处理
     * 
     * @return 校验成功返回true 否则返回false
     */
    public abstract boolean doValidate(Context context, String text);

}
