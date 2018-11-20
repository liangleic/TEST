package cn.edu.imu.quick;

public interface QuickSort {
	/**
	 * 递归实现快速排序
	 */
	public void sort(int[] array, int lo, int hi);

	/**
	 * 非递归实现快速排序
	 */
	int[] quickSort_not_recursion(int[] result);

	/**
	 * 优化后的快速排序的实现
	 */
	public void sort_ptimization(Integer[] arr);

}
