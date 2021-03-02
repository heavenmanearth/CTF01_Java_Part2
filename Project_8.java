
public class Project_8 {

	public static void main(String[] args) {

		/*
		 * 1. ทดลองสร้างอาเรย์ 2 มิติ และวนลูปแล้ว print ให้ ครบทุกจํานวน
		 * (หน้าที่แล้ว)
		 */

		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 }, { 10, 11, 12, 13, 14 } };
		for (int[] x : twoD_Array) {
			for (int y : x) {
				System.out.print(y);
				System.out.print("\t");
			}
		}
		System.out.println();
		/*
		 * 2. ทดลองดึงค่าในอาเรย์ 2 มิติ เอาสมาชิกตัวสุดท้าย
		 * ของแต่ละแถวจากการวนลูป มาบวกกัน และแสดง ผลลัพธ์จากการบวกกันบน Console
		 * 
		 */
		int sum = 0;
		for (int[] x : twoD_Array) {
			sum += x[x.length - 1];

		}
		System.out.println(sum);
	}
}