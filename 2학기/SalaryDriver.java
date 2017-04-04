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
			System.out.println(" 이름 : " + getName(k) + "  급여 : " + getSalary(k));
		}
	}
	public String lookup(String name){
		for(int k = 0; k < names.size(); k++)
		{
			if(getName(k).equals(name))
			{
				return ("\n 이름 : " + getName(k) + "  기본급 : " + getSalary(k));
			}
		}
		return("\n 찾는 직원이 없습니다.");
	}
	protected String minus(String name)
	{
		for(int k = 0; k < names.size(); k++){
			if(name.equals(getName(k))){
				names.remove(k);
				salaries.remove(k);
				return("\n 해고했습니다.");
			}
		}
		return("\n 찾는 직원이 없습니다.\n");
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
			System.out.println(" 이름 : " + getName(k) + "  급여 : " + (getSalary(k) + bonus));
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
			System.out.println(" 이름 : " + getName(k) + "  급여 : " + (getSalary(k) + bonus + stock_option));
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
		System.out.println(" 직원들의 이름과 직급을 입력하시오 (종료 : 이름을 0으로 입력)\n (직원의 최대 인원은 10명이므로 10명이 되면 중단)\n");
		while(count<10){
			System.out.print(" 이름 : ");
			name = scan.next();
			if(name. equals("0")){
				break;
			}
			System.out.print(" 직급 : ");
			grade = scan.next();
			System.out.println();
			if(grade.equals("사원")){
				emp.add(name);
				count++;
			}
			else if(grade.equals("매니저")){
				man.add(name);
				count++;
			}
			else if(grade.equals("임원")){
				exe.add(name);
				count++;
			}
			else{
				System.out.println("사원,매니저,임원 중에서만 입력가능합니다. 다시 입력하시오.\n");
			}
		}
		System.out.println("\n 전체직원");
		emp.output();
		man.output();
		exe.output();
		while(true){
			System.out.println("\n 선택하시오.");
			System.out.println(" ----------------------------------------");
			System.out.println(" 1.기본급 출력\n 2.인상한 기본급 출력\n 3.보너스와 스톡옵션 적용한 급여 출력");
			System.out.println(" 4.직원 찾기\n 5.직원 추가하기\n 6.직원 해고하기\n 0.종료");
			System.out.print(" ----------------------------------------\n => ");
			int choice = scan.nextInt();
			if(choice == 0){
				System.out.println(" 종료합니다.");
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
					System.out.println(" 직원은 보너스와 스톡옵션이 없어 기본급이 출력됩니다.\n 매니저는 스톡옵션이 없어 보너스만 적용된 급여가 출력됩니다.\n");
					emp.output();
					man.plusSalaryOutput();
					exe.plusSalaryOutput();
					break;
				case 4:
					System.out.print(" 찾을 직원의 이름 : ");
					name = scan.next();
					System.out.print(" 찾을 직원의 직급 : ");
					grade = scan.next();
					if(grade.equals("사원")){
						System.out.println(emp.lookup(name));
					}
					else if(grade.equals("매니저")){
						System.out.println(man.lookup(name));
					}
					else if(grade.equals("임원")){
						System.out.println(exe.lookup(name));
					}
					else{
						System.out.println("\n 그런 직급은 없습니다.");
					}
					break;
				case 5:
					if(count>=10){
						System.out.println(" 직원의 최대 인원은 10명입니다. 더 이상 추가할 수 없습니다.");
						break;
					}
					System.out.print(" 추가할 직원의 이름 : ");
					name = scan.next();
					System.out.print(" 추가할 직원의 직급 : ");
					grade = scan.next();
					if(grade.equals("사원")){
						emp.add(name);
					}
					else if(grade.equals("매니저")){
						man.add(name);
					}
					else if(grade.equals("임원")){
						exe.add(name);
					}
					else{
						System.out.println("\n 그런 직급은 없습니다.");
					}
					System.out.println("\n 전체직원");
					emp.output();
					man.output();
					exe.output();
					count++;
					break;
				case 6:
					System.out.print(" 해고할 직원의 이름 : ");
					name = scan.next();
					System.out.print(" 해고할 직원의 직급 : ");
					grade = scan.next();
					if(grade.equals("사원")){
						System.out.println(emp.minus(name));
					}
					else if(grade.equals("매니저")){
						System.out.println(man.minus(name));
					}
					else if(grade.equals("임원")){
						System.out.println(exe.minus(name));
					}
					else{
						System.out.println("\n 그런 직급은 없습니다.");
					}
					System.out.println("\n 전체직원");
					emp.output();
					man.output();
					exe.output();
					count--;
					break;
				default:
					System.out.println(" 목록 중에서 선택하십시오.");
			}
		}
	}
}
