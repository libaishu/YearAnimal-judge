package com.zhangsan.app.model;

public class YearAnimalModel {

	/**
	 * 通过年龄判断生肖
	 * 
	 * @param age 年龄
	 * @return 生肖
	 * @throws IllegalArgumentException 如果年龄为负数
	 */
	public static char judgeYearAnimalByAge(int age) {
		// 1 验证或清理参数
		if (age < 0) {
			throw new IllegalArgumentException("age 必须大于0");
		}
		// 2 执行业务逻辑
		// 2.1 通过年龄得到出生年
		int year = 2019 - age;
		// 2.2 调用业务方法
		char result = doJudgeYearAnimalByAge(year);
		// 3 组装业务结果并返回
		return result;
	}

	/**
	 * 返回指定年的生肖
	 * 
	 * @param year 年份 0-9999
	 * @return 生肖 猴鸡狗猪鼠牛虎兔龙蛇马羊
	 */
	private static char doJudgeYearAnimalByAge(int year) {
		switch (year % 12) {
		case 0:return '猴';
		case 1:return '鸡';
		case 2:return '狗';
		case 3:return '猪';
		case 4:return '鼠';
		case 5:return '牛';
		case 6:return '虎';
		case 7:return '兔';
		case 8:return '龙';
		case 9:return '蛇';
		case 10:return '马';
		case 11:return '羊';
		}
		return 0;
	}

}
