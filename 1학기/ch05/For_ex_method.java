class  For_ex_method
{
	public static void main(String args[]) 
	{
		//1���� n������ ���� ���ϴ� �޼��� Ȱ��

		/* for(�ʱ��;���ǽ�;������({
			���๮........
		}
		�ʱ��->���ǽ�(��)->����->������->���ǽ�(��)->����->������->���ǽ�....*/
		//1���� 100������ ���� ���
		/*sumN(10);
		sumN(20);
		sumN(100);
		//�޼��� ȣ��
	}
	static int sumN(int num){ //void�� ���� ����
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			sum +=i;
		}
		System.out.println(sum);
	}
	//�޼��� ����*/
		System.out.println(sumN(10));
		//�޼��� ȣ��
	}
	static int sumN(int num){ //void�� ���� ����
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			sum +=i;
		}
		return sum;
	} //�ּ� �� ó�� void�� �ָ� return���� ��� �ȴ�.
}
