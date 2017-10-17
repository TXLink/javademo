
public class StringOption {

	public void StringCompare()
	{
		String str="Hello World";
		String anotherString="Hello world";
		Object objStr=str;
		
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));
		
	}
	
	public void SearchLastString()
	{
		String strOrig="Hello world,hello xuyinglin";
		int lastIndex=strOrig.lastIndexOf("xuyinglin");
		if(lastIndex==-1)
		{
			System.out.println("没有找到");
		}
		else {
			System.out.println("Runoob 字符串最后出现的位置:"+lastIndex);
		}
	}
	
	public static String removeCharAt(String str,int pos){
		str="this is java";
		pos=3;
		return str.substring(0,pos)+str.substring(pos+1);
	}
}
