/*
 * 아이스크림 몇 개 구입할꺼야? : 4
 * 
 * ***1번째 아이스크림 구매정보 입력 ***
 * 아이스크림명 :  비비빅
 * 아이스크림 가격 : 800
 * 
 *  ***2번째 아이스크림 구매정보 입력 ***
 * 아이스크림명 :  브라보콘
 * 아이스크림 가격 : 1500
 * 
 * ***3번째 아이스크림 구매정보 입력 ***
 * 아이스크림명 :  구구콘
 * 아이스크림 가격 : 2000
 * 
 * 
 *  * ***4번째 아이스크림 구매정보 입력 ***
 * 아이스크림명 :  메로나
 * 아이스크림 가격 : 800
 * 
 * 
 * 
 * 
 * >>>출력되는 것
 * 
 * <총 4개의 아이스크릠 구매정보 출력>
 * 번호 아이스크림명 아이스크림 가격
 * 1	비비빅     800
 * 2	브라보콘	 1500
 * 3	구구콘	 2000
 * 4	메로나	 800
 * 
 * 총계 : 5100원
 * 
 * 
 */

package sugang0315;

import java.util.Scanner;

public class IceCreamMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("아이스크림 구입 개수 :"); // 키보드 입력받으면서 문제가 발생할 예정임.. 알아서 해결해보기
		int iceNum = sc.nextInt();

		IceCream[] iceArr = new IceCream[iceNum];

		for (int j = 0; j < iceNum; j++) {
			iceArr[j] = new IceCream(); // 실제 메모리값을 만듦
		}

		// iceArr 을 iceNum만큼 생성해야함

		int icesum = 0;
		int n = 0;
		int d = 1;

		for (int i = 0; i < iceArr.length; i++) {
			n++;

			System.out.println("***" + n + "번 째 아이스크림 구매 정보 입력");

			System.out.println("아이스크림명 :");
			iceArr[i].name = sc.next(); // next는 공백없이 받아야함

			System.out.println("아이스크림 가격: ");
			iceArr[i].price = sc.nextInt();

			icesum += iceArr[i].price;

		}
		System.out.println("번호  아이스크림명  아이스크림 가격");

		for (int i = 0; i < iceArr.length; i++) {
			System.out.println((i + 1) + "    " + iceArr[i].name + "         " + iceArr[i].price);
		}
		System.out.println("총합 :" + icesum);

	}
}
