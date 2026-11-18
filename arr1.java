import javax.swing.*;
class arr1
{
	public static void main(String jk[])
	{
		int arr[]=new int[5];
		int i;
		for(i=0;i<5;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		}
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}