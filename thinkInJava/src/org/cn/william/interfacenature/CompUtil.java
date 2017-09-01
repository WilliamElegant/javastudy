package org.cn.william.interfacenature;

public class CompUtil {
	public static Object max(MyComparable[] objs){
		if(objs == null || objs.length==0){
			return null;
		}
		
		MyComparable max = objs[0];
		for(int i = 0; i<objs.length; i++){
			if(max.compareTo(objs[i]) < 0){
				max = objs[i];
			}
		}
		
		return max;
	}

	public static void sort(MyComparable[] objs){
		
	}
}
