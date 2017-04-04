import java.util.ArrayList;
import java.util.Scanner;
class Employee
{
	protected ArrayList names;
	protected ArrayList salaries;
	protected int salary = 100000;
	public Employee(){
		names = new ArrayList();
		salaries = new ArrayList();
	}
	protected void add(String name){
		names.add(name);
		salaries.add(salary);
	}
	public String getName(int j){
		return (String)names.get(j);
	}
	public int getSalary(int j){
		return (int)salaries.get(j);
	}
	protected void raiseSalary(){
		for(int k = 0; k < salaries.size(); k++){
			salaries.set(k,getSalary(k) + (int)(getSalary(k) * 0.3));
		}
	}
	public void output(){
		for (int k = 0; k < names.size(); k++)
		{
			System.out.println(" �̸� : " + getName(k) + "  �޿� : " + getSalary(k));
		}
	}
	public String lookup(String name){
		for(int k = 0; k < names.size(); k++)
		{
			if(getName(k).equals(name))
			{
				return ("\n �̸� : " + getName(k) + "  �⺻�� : " + getSalary(k));
			}
		}
		return("\n ã�� ������ �����ϴ�.");
	}
	protected String minus(String name)
	{
		for(int k = 0; k < names.size(); k++){
			if(name.equals(getName(k))){
				names.remove(k);
				salaries.remove(k);
				return("\n �ذ��߽��ϴ�.");
			}
		}
		return("\n ã�� ������ �����ϴ�.\n");
	}
}

class Manager extends Employee
{
	protected int bonus = 50000;
	public Manager(){
		super();
	}
	protected void changeSalary(){
		salary = 200000;
	}
	protected void raiseSalary(){
		for(int k = 0; k < salaries.size(); k++){
			salaries.set(k,getSalary(k) + (int)(getSalary(k) * 0.2));
		}
	}
	public void plusSalaryOutput(){
		for (int k = 0; k < names.size(); k++)
		{
			System.out.println(" �̸� : " + getName(k) + "  �޿� : " + (getSalary(k) + bonus));
		}
	}
}

class Executive extends Manager
{
	protected int bonus = 100000;
	protected int stock_option = 100000;
	public Executive(){
		super();
	}
	protected void changeSalary(){
		salary = 400000;
	}
	protected void raiseSalary(){
		for(int k = 0; k < salaries.size(); k++){
			salaries.set(k,getSalary(k) + (int)(getSalary(k) * 0.1));
		}
	}
	public void plusSalaryOutput(){
		for (int k = 0; k < names.size(); k++)
		{
			System.out.println(" �̸� : " + getName(k) + "  �޿� : " + (getSalary(k) + bonus + stock_option));
		}
	}
}

class SalaryDriver 
{
	public static void main(String[] args) 
	{
		int count = 0;
		String name;
		String grade;
		Employee emp = new Employee();
		Manager man = new Manager();
		Executive exe = new Executive();
		man.changeSalary();
		exe.changeSalary();
		Scanner scan = new Scanner(System.in);
		System.out.println(" �������� �̸��� ������ �Է��Ͻÿ� (���� : �̸��� 0���� �Է�)\n (������ �ִ� �ο��� 10���̹Ƿ� 10���� �Ǹ� �ߴ�)\n");
		while(count<10){
			System.out.print(" �̸� : ");
			name = scan.next();
			if(name. equals("0")){
				break;
			}
			System.out.print(" ���� : ");
			grade = scan.next();
			System.out.println();
			if(grade.equals("���")){
				emp.add(name);
				count++;
			}
			else if(grade.equals("�Ŵ���")){
				man.add(name);
				count++;
			}
			else if(grade.equals("�ӿ�")){
				exe.add(name);
				count++;
			}
			else{
				System.out.println("���,�Ŵ���,�ӿ� �߿����� �Է°����մϴ�. �ٽ� �Է��Ͻÿ�.\n");
			}
		}
		System.out.println("\n ��ü����");
		emp.output();
		man.output();
		exe.output();
		while(true){
			System.out.println("\n �����Ͻÿ�.");
			System.out.println(" ----------------------------------------");
			System.out.println(" 1.�⺻�� ���\n 2.�λ��� �⺻�� ���\n 3.���ʽ��� ����ɼ� ������ �޿� ���");
			System.out.println(" 4.���� ã��\n 5.���� �߰��ϱ�\n 6.���� �ذ��ϱ�\n 0.����");
			System.out.print(" ----------------------------------------\n => ");
			int choice = scan.nextInt();
			if(choice == 0){
				System.out.println(" �����մϴ�.");
				break;
			}
			System.out.println();
			switch(choice){
				case 1:
					emp.output();
					man.output();
					exe.output();
					break;
				case 2:
					emp.raiseSalary();
					man.raiseSalary();
					exe.raiseSalary();
					emp.output();
					man.output();
					exe.output();
					break;
				case 3:
					System.out.println(" ������ ���ʽ��� ����ɼ��� ���� �⺻���� ��µ˴ϴ�.\n �Ŵ����� ����ɼ��� ���� ���ʽ��� ����� �޿��� ��µ˴ϴ�.\n");
					emp.output();
					man.plusSalaryOutput();
					exe.plusSalaryOutput();
					break;
				case 4:
					System.out.print(" ã�� ������ �̸� : ");
					name = scan.next();
					System.out.print(" ã�� ������ ���� : ");
					grade = scan.next();
					if(grade.equals("���")){
						System.out.println(emp.lookup(name));
					}
					else if(grade.equals("�Ŵ���")){
						System.out.println(man.lookup(name));
					}
					else if(grade.equals("�ӿ�")){
						System.out.println(exe.lookup(name));
					}
					else{
						System.out.println("\n �׷� ������ �����ϴ�.");
					}
					break;
				case 5:
					if(count>=10){
						System.out.println(" ������ �ִ� �ο��� 10���Դϴ�. �� �̻� �߰��� �� �����ϴ�.");
						break;
					}
					System.out.print(" �߰��� ������ �̸� : ");
					name = scan.next();
					System.out.print(" �߰��� ������ ���� : ");
					grade = scan.next();
					if(grade.equals("���")){
						emp.add(name);
					}
					else if(grade.equals("�Ŵ���")){
						man.add(name);
					}
					else if(grade.equals("�ӿ�")){
						exe.add(name);
					}
					else{
						System.out.println("\n �׷� ������ �����ϴ�.");
					}
					System.out.println("\n ��ü����");
					emp.output();
					man.output();
					exe.output();
					count++;
					break;
				case 6:
					System.out.print(" �ذ��� ������ �̸� : ");
					name = scan.next();
					System.out.print(" �ذ��� ������ ���� : ");
					grade = scan.next();
					if(grade.equals("���")){
						System.out.println(emp.minus(name));
					}
					else if(grade.equals("�Ŵ���")){
						System.out.println(man.minus(name));
					}
					else if(grade.equals("�ӿ�")){
						System.out.println(exe.minus(name));
					}
					else{
						System.out.println("\n �׷� ������ �����ϴ�.");
					}
					System.out.println("\n ��ü����");
					emp.output();
					man.output();
					exe.output();
					count--;
					break;
				default:
					System.out.println(" ��� �߿��� �����Ͻʽÿ�.");
			}
		}
	}
}
