package cn.edu.imu.shell.impl;

import cn.edu.imu.shell.ShellSort;

public class ShellSortImpl implements ShellSort {

	@Override
	public void sort(int[] arrays) {
		/**
		 * 希尔排序算法的实现
		 */
		if (arrays == null || arrays.length <= 1) {
			return;
		}
		// 增量
		int incrementNum = arrays.length / 2;
		while (incrementNum >= 1) {
			for (int i = 0; i < arrays.length; i++) {
				// 进行插入排序
				for (int j = i; j < arrays.length - incrementNum; j = j
						+ incrementNum) {
					if (arrays[j] > arrays[j + incrementNum]) {
						int temple = arrays[j];
						arrays[j] = arrays[j + incrementNum];
						arrays[j + incrementNum] = temple;
					}
				}
			}
			// 设置新的增量
			incrementNum = incrementNum / 2;
		}
	}
}
