package cn.edu.imu.test;

import org.junit.Test;

import cn.edu.imu.bubble.BubbleSort;
import cn.edu.imu.bubble.impl.BubbleSortImpl;
import cn.edu.imu.quick.QuickSort;
import cn.edu.imu.quick.impl.QuickSortImpl;
import cn.edu.imu.shell.ShellSort;
import cn.edu.imu.shell.impl.ShellSortImpl;

public class SortTest {
	/**
	 * 测试冒泡排序算法
	 */
	@Test
	public void bubbleSort() {
		int arr[] ={ 23, -45, 56, -78, 45, 0, -67, 28, 96 };
		BubbleSort bubbleSort = new BubbleSortImpl();
		bubbleSort.sort(arr);

	}

	/**
	 * 测试希尔排序算法
	 */
	@Test
	public void shellSort() {
		int arr[] = { 23, -45, 56, -78, 45, 0, -67, 28, 96 };
		System.out.println("排序前数组为：");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		ShellSort shellSort = new ShellSortImpl();
		shellSort.sort(arr);
		System.out.println("排序后的数组为：");
		for (int num : arr) {
			System.out.print(num + "  ");
		}

	}

	/**
	 * 测试快速排序算法(递归实现)
	 */
	@Test
	public void quickSort() {
		int arr[] = { 45, 89, -24, 15, -98, 47, 0, 56, -52 };
		System.out.println("排序前数组为：");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		QuickSort quickSort = new QuickSortImpl();
		quickSort.sort(arr, 0, arr.length - 1);
		System.out.println("排序后的数组为：");
		for (int num : arr) {
			System.out.print(num + "  ");
		}

	}

	/**
	 * 测试快速排序算法(非递归实现)
	 */
	@Test
	public void quickSort_not_recursion() {
		int arr[] = { 66, 34, -56, 78, 0, -23, -45, 72, 37 };
		System.out.println("排序前数组为：");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		QuickSort quickSort = new QuickSortImpl();
		quickSort.quickSort_not_recursion(arr);
		System.out.println("排序后的数组为：");
		for (int num : arr) {
			System.out.print(num + "  ");
		}

	}

	/**
	 * 测试优化后的快速排序算法(随机选取基准值base)
	 */
	@Test
	public void sort_ptimizationTest() {
		Integer arr[] = { 9, 5, 7, 1, 6, 2 };
		QuickSort quickSort = new QuickSortImpl();
		quickSort.sort_ptimization(arr);
		System.out.println("排序后的数组为：");
		for (int num : arr) {
			System.out.print(num + "  ");
		}
	}

}
