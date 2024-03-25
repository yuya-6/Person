public class Test {
	
	public static void main(String[] args){
		
		//演習①
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age=20;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		//演習②
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		Person yuya = new Person();
		yuya.name = "足立裕弥";
		yuya.age = 31;
		
		System.out.println(yuya.name);
		System.out.println(yuya.age);
		
		//演習③
		taro.phoneNumber = "123-4567-8901";
		taro.address = "東京都世田谷区";
		
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		
		//演習⑥
		taro.talk();
		taro.walk();
		
		//演習⑧
		Robot aibo = new Robot();
		aibo.name = "アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();
		
		Robot asimo = new Robot();
		asimo.name = "アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();
		
		Robot pepper = new Robot();
		pepper.name = "ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();
		
	}

}
