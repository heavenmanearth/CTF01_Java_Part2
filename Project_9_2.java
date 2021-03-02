
public class Project_9_2 {

	/*
	 * จงสร้าง class ชื่อ MobilePhone เป็น Class แม่ที่อยู่บนสุด ฐานที่สุด โดย
	 * MobilePhone มี Feature ดังนี้ • MobilePhone -> PhoneCall(), SMS(),
	 * InternetSurfing()
	 */
	public class MobilePhone {
		public void phoneCall() {
		};

		public void sms() {
		};

		public void internetSurfing() {
		};

	}

	/*
	 * มีโทรศัพท์มือถืออยู่ 4 รุ่น มี Feature (method) ต่างๆ ดังนี้ • SamSung
	 * Galaxy Note 8 -> UseGearVR(), TransformToPC(), UsePen(), GooglePlay() •
	 * iPhoneX -> FaceID(), AppStore() • iPhone8 -> TouchID(), AppStore() •
	 * Samsung Galaxy S8 -> UseGearVR(), TransformToPC(), GooglePlay()
	 */

	public class SamSungGalaxyNote8 extends MobilePhone {
		public void useGearVR() {
		};

		public void transformToPC() {
		};

		public void usePen() {
		};

		public void googlePlay() {
		};

	}

	public class iPhoneX extends MobilePhone {
		public void faceID() {
		};

		public void appStore() {
		};

	}

	public class iPhone8 extends MobilePhone {
		public void touchID() {
		};

		public void appStore() {
		};

	}

	public class SamSungGalaxyS8 extends MobilePhone {
		public void useGearVR() {
		};

		public void transformToPC() {
		};

		public void googlePlay() {
		};
	}

	/*
	 * จงออกแบบ class ให้กับมือถือทั้ง 4 รุ่น เพื่อให้เกิดการ reuse แบบ
	 * inheritance ให้มากที่สุด (ใช้ extend)
	 */

}
