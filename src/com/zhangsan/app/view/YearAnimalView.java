package com.zhangsan.app.view;

import com.zhangsan.app.model.YearAnimalModel;
import com.zhangsan.common.util.ConsoleUtil;

public class YearAnimalView {

	
	public static void paint() {
		//1 欢迎语
		System.out.println("欢迎使用是生肖计算器V1.0");
		//2获取用户输入的年龄
		int age=getAge();
		//3 调用业务模型
		char animal=YearAnimalModel.judgeYearAnimalByAge(age);
		//4 显示结果
		System.out.println("你的所属生肖是:"+animal);
		System.out.println("欢迎再次使用，再见");
		
	}
	/**
	 * 从控制台读取用户输入的年龄
	 * @return age
	 */
	public static int getAge() {
		int age=0;
		while(true) {
			age=ConsoleUtil.readInt("请输入您的年龄(0-150)>",-1);
			//3 必须大于0小于150
			if(0<age&&age<150) {
				break;
			}else {
				System.out.println("输入年龄范围错误，请重新输入(0-150)之间的整数");
			}
		}
		return age;
	}
	
	
	
}
