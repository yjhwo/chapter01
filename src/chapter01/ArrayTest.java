package chapter01;

import java.util.Arrays;
import java.util.Objects;

/*
 *  16.03.04
 */
public class ArrayTest {

	public static void main(String[] args) {
		char[] c = new char[3];
		
		c[0] = 'B';
		c[1] = 'I';
		c[2] = 'T';
		
		
		System.out.print(c);
		System.out.println(c.length);
		
		// 배열객체의 참조값
		System.out.println(System.identityHashCode(c));
		
		//
		String s = new String("Hello");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));	//1829164700
		System.out.println(s.hashCode());	//69609650
		
		// 배열의 선언
		int[] intArray;
		intArray = new int[10];
	
		int[] intArray2 = new int[10];
		
		int[] intArray3 = {1,2,3,4,5};
		
//		int[] intArray4;
//		intArray4 = {10,20,30};	// X
		
		// 배열 예외 - OutOfBound
		try{
			intArray[10] = 10;
		}catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("Array Index Out Of Bound Error");
		}
		
		// Array 유틸리티 클래스 사용
		int[] intArray5 = {30,20,15,10,9,8};
		int index = Arrays.binarySearch(intArray5, 15);
		System.out.println("이진 검색 결과:"+index);
		
		int[] intArray6 = {100,20,1500,20,1,5,6};
		System.out.println(Arrays.toString(intArray6));
		Arrays.sort(intArray6);		
		// ※Static은 객체 생성 안하고 클래스 이름으로 접근이 가능하다.※
		System.out.println(Arrays.toString(intArray6));
		
		
		// 두 배열 비교
		int[] intArray7 = {1,5,6,20,20,100,1500};	// 비교 시 위치도 상관 있음
		boolean b = Arrays.equals(intArray6, intArray7);
		System.out.println(b);
		
		Arrays.fill(intArray7, -10);	// 초기화
		System.out.println(Arrays.toString(intArray7));
		
		// 배열 복사
		int[] src = {10,20,30,40,50};
		int[] dest1 = src;	// 복사가 아니라 reference 하나 더 생성한 것일뿐, dest가 같은 객체를 참조하는 것 : 같은 배열 객체 참조!
		int[] dest2 = new int[src.length]; 	// 배열 복사
		System.arraycopy(src, 0, dest2, 0, src.length);
		System.out.println(Arrays.toString(dest2));
		
		
		//---------- My ArrayUtil 테스트 해보기
		boolean b2 = ArrayUtil.equals(src, dest2);
		System.out.println(b2);
		
		int[] concat = ArrayUtil.concat(src, dest2);
		System.out.println(Arrays.toString(concat));
	}

}
