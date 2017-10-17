
public class MainRun {

	public static void main(String args[]) {
		
		mysqlTest mysql=new mysqlTest();
		mysql.connetMySql();
		
		
		/*
		String vari[]=new String[5000];
		for (int i = 0; i < vari.length; i++) {
			vari[i]="hello"+i;
			
		}
		
		for (int i = 0; i < vari.length; i++) {
			vari[i]=new String("Hello"+i);
		}
		
		for (int i = 0; i < vari.length; i++) {
			vari[i]=new String("hello");
			vari[i]=vari[i].intern();
		}
		
		
		//long startTime=System.currentTimeMillis();
		long startTime=System.nanoTime();
		System.out.println("Hello \nworld");

		StringOption stringCompareEmp = new StringOption();
		// 字符串比较
		stringCompareEmp.StringCompare();
		// 查找字符串最后一次出现的位置
		stringCompareEmp.SearchLastString();

		String str = StringOption.removeCharAt("", 0);
		System.out.println(str);

		String teststr = "Hello Hello world";
		System.out.println(teststr.replace("H", "w"));
		System.out.println(teststr.replaceAll("H", "w"));
		System.out.println(teststr.replaceFirst("H", "f"));

		String reverse = new StringBuffer(teststr).reverse().toString();
		System.out.println(reverse);

		String strsplit = "www.baidu.com";
		String[] tmpStrings;
		tmpStrings = strsplit.split("\\.");
		for (int i = 0; i < tmpStrings.length; i++) {
			System.out.println(tmpStrings[i]);
			System.out.println("");
		}

		for (String x : tmpStrings) {
			System.out.println("----");
			System.out.println(x);
		}

		String first_str = "Welcome to Microsoft";
		String second_str = "I work with microsoft";
		boolean match1 = first_str.regionMatches(11, second_str, 12, 9);
		boolean match2 = first_str.regionMatches(true, 11, second_str, 12, 9);
		System.out.println("区分大小写返回值：" + match1);
		System.out.println("不区分大小写返回值：" + match2);
		
		//long endTime=System.currentTimeMillis();
		
		String fstrss=String.format("%f,%d,%s",1001.1,100,"是吗");
		System.out.println(fstrss);
		
		
		int a=10;
		int b=++a;
		//System.out.format("a++:%d",a++);
		System.out.println();
		System.out.format("++a:%d",b);
		System.out.println();
		int c=1;
		System.out.format("a+c:%d",b+c);
		System.out.println();
				
		
		long endTime=System.nanoTime();
		System.out.println("耗费时间："
				+(endTime-startTime)
				+"微秒");
       */
	}

}
