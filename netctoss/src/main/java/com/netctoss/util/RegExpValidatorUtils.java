package com.netctoss.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpValidatorUtils {
	/**
	 * 
	 * @param regex
	 * 正则表达式字符串
	 * @param str
	 * 要匹配的字符串
	 * @return
	 * 如果str 符合 regex的正则表达式格式,返回true, 否则返回 false;
	 */
	private static boolean match(String regex, String str) {
		Pattern pattern  = Pattern.compile(regex);
		Matcher matcher  = pattern.matcher(str);
		return matcher.matches();
	}
	/**
	 * 姓名验证
	 * @param str
	 * @return
	 */
	public static boolean isName(String str){
		String regex = "^[\u4e00-\u9fa5A-Za-z0-9]{2,20}$";
		return match(regex, str);
	}
	/**
	 * 电话验证
	 * @param str
	 * @return
	 */
	public static boolean isPhone(String str){
		String regex = "^1\\d{10}$";
		return match(regex, str);
	}
	/**
	 * 身份证验证
	 * @param str
	 * @return
	 */
	public static boolean isIdc(String str){
		String regex = "^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$";
		return match(regex, str);
	}
	/**
	 * 登录账号验证
	 * @param str
	 * @return
	 */
	public static boolean isLogin(String str){
		String regex = "^\\w{3,15}$";
		return match(regex, str);
	}
	/**
	 * 登录密码验证
	 * @param str
	 * @return
	 */
	public static boolean isPsw(String str){
		String regex = "^\\w{3,30}$";
		return match(regex, str);
	}
	/**
	 * 重复密码验证
	 * @param str
	 * @param str2
	 * @return
	 */
	public static boolean rePsw(String str,String str2){
		if(str.equals(str2)){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * email验证
	 * @param str
	 * @return
	 */
	public static boolean isEmail(String str) {
		String regex = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		return match(regex, str);
	}
	/**
	 * 地址验证
	 * @param str
	 * @return
	 */
	public static boolean isAddr(String str){
		String regex = "^[a-zA-Z0-9\u4e00-\u9fa5]{2,50}$";
		return match(regex, str);
	}
	/**
	 * 邮箱验证
	 * @param str
	 * @return
	 */
	public static boolean isPost(String str){
		String regex = "^[1-9][0-9]{5}$";
		return match(regex, str);
	}
	/**
	 * qq验证
	 * @param str
	 * @return
	 */
	public static boolean isQq(String str){
		String regex = "^[1-9][0-9]{4,12}";
		return match(regex, str);
	}
}
