class  For_ex_method
{
	public static void main(String args[]) 
	{
		//1부터 n까지의 합을 구하는 메서드 활용

		/* for(초기식;조건식;증감식({
			실행문........
		}
		초기식->조건식(참)->실행->증감식->조건식(참)->실행->증감식->조건식....*/
		//1부터 100사이의 숫자 출력
		/*sumN(10);
		sumN(20);
		sumN(100);
		//메서드 호출
	}
	static int sumN(int num){ //void는 리턴 유형
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			sum +=i;
		}
		System.out.println(sum);
	}
	//메서드 선언*/
		System.out.println(sumN(10));
		//메서드 호출
	}
	static int sumN(int num){ //void는 리턴 유형
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			sum +=i;
		}
		return sum;
	} //주석 위 처럼 void로 주면 return값이 없어도 된다.
}
