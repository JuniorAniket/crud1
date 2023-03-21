package crud1;

import java.util.*;

public class CRUDDemo {

	public static void main(String[] args) 
	{
		List<employee> c = new ArrayList<employee>();
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		int ch;
		do 
		{
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Enter ur choice : ");
			ch = sc1.nextInt();
			
			switch(ch)
			{
			case 1:
				System.out.print("Enter Empno : ");
			    int eno = sc1.nextInt();
			    System.out.print("Enter EmpName : ");
			    String ename = sc2.nextLine();
			    System.out.print("Enter Salary : ");
			    int salary = sc1.nextInt();
			    
			    c.add(new employee(eno,ename,salary));
			break;
			case 2:
				System.out.println("------------------");
				Iterator<employee> i = c.iterator();
				while(i.hasNext())
				{
					employee e = i.next();
					System.out.println(e);
					System.out.println("------------------");
					
				}
			break;
			case 3:
				boolean found= false;
				System.out.println("Enter Empno to search : ");
				int empno = sc1.nextInt();
				System.out.println("------------------");
				i = c.iterator();
				while(i.hasNext())
				{
					employee e = i.next();
					if(e.getEmpno()==empno)
					{
						System.out.println(e);	
						found = true;
					}
				}
					
					
			if(!found)
			{
				System.out.println("Record not found");
			}
			System.out.println("------------------");
			break;
			case 4:
				found= false;
				System.out.println("Enter Empno to delete : ");
				empno = sc1.nextInt();
				System.out.println("------------------");
				i = c.iterator();
				while(i.hasNext())
				{
					employee e = i.next();
					if(e.getEmpno()==empno)
					{
						i.remove();	
						found = true;
					}
				}
					
					
			if(!found)
			{
				System.out.println("Record not found");
			}else
			{
				System.out.println("Record deleted");
			}
			System.out.println("------------------");
			break;
			case 5:
				found= false;
				System.out.println("Enter Empno to Update : ");
				empno = sc1.nextInt();
				System.out.println("------------------");
				ListIterator<employee> li = c.listIterator();
				while(li.hasNext())
				{
					employee e = li.next();
					if(e.getEmpno()==empno)
					{
						System.out.println("Enter new name : ");
						ename = sc2.nextLine();
						System.out.println("Enter new salary : ");
						salary = sc1.nextInt();
						li.set(new employee (empno,ename,salary));
						
						found = true;
					}
				}
					
					
			if(!found)
			{
				System.out.println("Record not found");
			}else
			{
				System.out.println("Record updated");
			}
			System.out.println("------------------");
			break;
			}
		}while(ch!=0);

	}

}
