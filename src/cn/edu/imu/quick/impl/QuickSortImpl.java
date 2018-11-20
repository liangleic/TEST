package cn.edu.imu.quick.impl;

import java.util.Stack;

import cn.edu.imu.quick.QuickSort;

public class QuickSortImpl implements QuickSort {

	/**
	 * 递归实现快速排序
	 */
	@Override
	public void sort(int[] array, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int index = partition(array, lo, hi);
		sort(array, lo, index - 1);
		sort(array, index + 1, hi);
	}

	public int partition(int[] array, int lo, int hi) {
		// 固定的切分方式
		int key = array[lo];
		while (lo < hi) {
			while (array[hi] >= key && hi > lo) {// 从后半部分向前扫描
				hi--;
			}
			array[lo] = array[hi];
			while (array[lo] <= key && hi > lo) { // 从前半部分向后扫描
				lo++;
			}
			array[hi] = array[lo];
		}
		array[hi] = key;
		return hi;
	}

	/**
	 * 非递归实现快速排序
	 */

	@Override
	public int[] quickSort_not_recursion(int[] result) {
		int i;
		int j;
		int min;
		int max;
		int key;

		Stack<Integer> conditions = new Stack<Integer>();
		conditions.push(0);
		conditions.push(result.length - 1);
		int temp;
		while (!conditions.empty()) {
			max = conditions.pop();
			min = conditions.pop();
			key = result[min];
			i = min + 1;
			j = max;
			while (i < j) {
				while (key < result[j] && i < j) {
					j--;
				}
				while (key > result[i] && i < j) {
					i++;
				}
				temp = result[j];
				result[j] = result[i];
				result[i] = temp;
			}
			if (key > result[i]) {
				temp = result[min];
				result[min] = result[j];
				result[j] = temp;
			}
			if (min < i - 1) {
				conditions.push(min);
				conditions.push(i - 1);
			}
			if (max > i + 1) {
				conditions.push(i + 1);
				conditions.push(max);
			}
		}
		return result;
	}

	/**
	 * 优化后的快速排序的实现
	 */
	public void sort_ptimization(Integer[] arr) {
		sort_ptimization(arr, 0, arr.length - 1);
	}

	public void sort_ptimization(Integer[] arr, int left, int right) {
		if (left >= right)
			return;
		int p = partition(arr, left, right);
		sort_ptimization(arr, left, p - 1);
		sort_ptimization(arr, p + 1, right);
	}

	private int partition(Integer[] arr, int left, int right) {
		// 排序前，先让基准值和随机的一个数进行交换。这样，基准值就有随机性。
		// 就不至于在数组相对有序时，导致左右两边的递归规模不一致，产生最坏时间复杂度
		swap(arr, left, (int) (Math.random() * (right - left + 1) + left));

		Integer base = arr[left];
		int j = left;
		for (int i = left + 1; i <= right; i++) {
			if (base.compareTo(arr[i]) > 0) {
				j++;
				swap(arr, j, i);
			}
		}
		swap(arr, left, j);
		return j;// 返回一躺排序后，基准值的下角标
	}

	public static void swap(Object[] arr, int i, int j) {
		if (i != j) {
			Object temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}


}
