package chapter01;

public class ArrayUtil {
	public static int[] concat(int[] a, int[] b){	// a+b
		int[] c = null;
		int len = a.length+b.length;
		c = new int[len];
		
		for(int i=0; i<len; i++){
			if(i<a.length){
				c[i] = a[i];
			}else{
				c[i] = b[a.length+i-len];
			}
		}
		return c;
	}
	
	public static int[] concat2(final int[] a, final int[] b){	//선생님
		int length = ((a==null)?0:a.length)+((b==null)?0:b.length);
		int[] dest = new int[length];
		int destPos =0;
		if(a!=null){
			System.arraycopy(a, 0, dest, destPos, a.length);
			destPos = a.length;
		}
		if(b!=null){
			System.arraycopy(b, 0, dest, destPos, b.length);
		
		}
		
		return dest;
	}
	
	
	public static boolean equals(int[] a, int[] b) {
		if (a == null || b == null) {
			return false;
		}

		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}

		return true;
	}

}
