package arraye;

class Parent_class {
	String name= "Gupta Priyaka";
	String flat="Worli";
	int cars=2;
	void dialogue()
	{
		System.out.println("हर साँस में तुम्हारा नाम बसा है,\r\n"
				+ "जिंदगी की हर शाम को तुमसे रोशन किया है।\r\n"
				+ "जितनी भी मिले ये खुशियां,\r\n"
				+ "सब तुम्हारे नाम किया है।");
	}
}
class Child_class extends Parent_class
	{
		String name1="Priyanka";
		int parties=5;
		void Actor()
		{
			System.out.println("Acting!! ");
		}
	}
			public class oops{
				public static void main (String[] args) {
					Child_class obj = new Child_class();
					obj.dialogue();
					obj.Actor();
				}
	
}

