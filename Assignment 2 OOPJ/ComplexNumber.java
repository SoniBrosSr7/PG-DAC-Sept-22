class ComplexNumber{
	int r,i;
	ComplexNumber()
	{
		this.r=0;
		this.i=0;
	}
	ComplexNumber(int r)
	{
		this.r=r;
		this.i=0;
	}
	ComplexNumber(int r,int i)
	{
		this.r=r;
		this.i=i;
	}
	static void addPrint(ComplexNumber a,ComplexNumber b)
	{
		System.out.println(a.r+b.r+"+"+(a.i+b.i)+"i");
	}
	
	static void multiplicationPrint(ComplexNumber a,ComplexNumber b)
	{
		System.out.println((a.r*b.r-a.i*b.i)+"+i"+(a.r*b.i+a.i*b.r));
	}
	public static void main(String args[])
	{
		ComplexNumber cn1=new ComplexNumber(3,2);
		ComplexNumber cn2=new ComplexNumber(4,-2);
		ComplexNumber.addPrint(cn1,cn2);
		ComplexNumber.multiplicationPrint(cn1,cn2);
	}
	
}