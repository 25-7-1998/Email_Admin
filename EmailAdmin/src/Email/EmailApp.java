package Email;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Name: ");
		String first=sc.nextLine();
		sc = new Scanner(System.in);
		System.out.println("Please Enter Last Name: ");
		String last=sc.nextLine();
		Email em1=new Email(first,last);
		em1.setmailboxcapacity(800);
		System.out.println("Please Enter Your Alternate Email-id: ");
		String alt=sc.nextLine();
		em1.setalternateemail(alt);
		System.out.println("Do You Want to change Password : Y or N ?: ");
		String flag =sc.nextLine();
		String ps;
		if(flag.equalsIgnoreCase("Y"))
		{
			System.out.println("Please New Password: ");
			ps =sc.nextLine();
			em1.setnewpassword(ps);
		}
		System.out.println(em1.showinfo());
		System.out.println("The mail Box Capacity is: "+em1.getmailboxcapacity());
		System.out.println("The alternate email is: "+em1.getalternateemail());
		if(flag.equalsIgnoreCase("Y"))
		{
			System.out.println("The new password is: "+em1.getnewpassword());
		}
		
		
	}

}
