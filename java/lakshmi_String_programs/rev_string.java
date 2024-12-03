package lakshmi_String_programs;

public class rev_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "janardhannaidu";
		String reve = " ";
		for(int i=str.length()-1;i>=0;i--)
		{
			reve = reve +str.charAt(i);
		}
		System.out.println(reve);
		
//		for(int i = 0;i<=str.length()-1;i+=2)
//		{
//			System.out.println(str.charAt(i));
//		}
//		System.out.println("=====");
//		for(int i = 1;i<=str.length()-1;i+=2)
//		{
//			System.out.println(str.charAt(i));
//		}
		for(int i=0;i<=str.length();i++)
		{
		for(int j = 0;j<=i;i++)
		{
			if(i==j)
			{
				break;
			}
			if (j == i)
			{
//				 str[index++] = str[i];
			}
		       
		}
		}
	}

}
