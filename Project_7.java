
public class Project_7 {

	public static void main(String[] args) {
		/*
		 * กําหนด String เปน็ดังนี้ String1 = ‘You and Me’ , String2 = ‘ you and
		 * me ‘ 1. ทดลองเปรียบเทียบ String 2 String ว่าเปน็ค่าเดียวกันหรือไม่ 2.
		 * ใช้คําสั่งค้นหาคําใน String และแสดงคําที่ค้นหาบนหน้าจอ 3.
		 * ใช้คําสั่งหาความยาวของ String นั้น และแสดงค่าความยาว String 4.
		 * ใช้คําสั่งตัดข้อความหรือตัด String ตําแหน่งที่ 1-4 ออก 5.
		 * ใช้คําสั่งตัดช่องว่างของประโยค 6. ใช้คําสั่งเปลี่ยน String
		 * เปน็พิมพ์ใหญ่ทั้งหมด 7. ใช้คําสั่งเปลี่ยน String2
		 * เปน็พิมพ์ใหญ่ทั้งหมด และ ไม่มีช่องว่างซ้ายขวา ด้วยการเขียน code แค่
		 * บรรทัดเดียว (ใช้ Chaining นั่นเอง)
		 */
		// 1
		String String1 = "You and Me";
		String String2 = " you and me ";
		// 2
		System.out.println(String1.equals(String2));
		System.out.println();
		if (String1.contains("and"))
			System.out.println("and");
		else
			System.out.println("Not found!");
		System.out.println();
		// 3
		System.out.println(String1.length());
		System.out.println(String2.length());
		System.out.println();
		// 4
		System.out.println(String1.substring(1, 4));
		System.out.println(String2.substring(1, 4));
		System.out.println();
		// 5
		System.out.println(String1.trim());
		System.out.println(String2.trim());
		System.out.println();
		// 6
		System.out.println(String1.toUpperCase());
		System.out.println(String2.toUpperCase());
		System.out.println();
		// 7
		System.out.println(String1.trim().toUpperCase());
		System.out.println(String2.trim().toUpperCase());

	}

}
