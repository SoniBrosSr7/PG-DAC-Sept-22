/* Write a Progtram of Employee details with 
	Emppoyee Parent class as abstract, with thier 2 child classes as regular employee and  Contract based employee.
	eployee has 4 feilds emp id, name, basic salary & gross salary
	regular employee has 170% allowance of basicsalary and Rs 800 as HRA
	Contract based emloyee has 2 subclass/interfaces -->1. CDAC Employee & 2. Third party Emp. this thould have fixed tenure of employeement
	CDAC employee has 250% allowance of basicpay and no HRA.
	Third party emloyee do not have any id only has other data with minimum wages of 150% of basic pay with no other facilities

	
*/

abstract class Employee
{
	private int id;
	private String name;
	private double basic;
	private double gross;
	
	void setData(int id,String name,double basic)
	{
		this.id=id;
		this.name=name;
		this.basic=basic;
		
	}
	
	void setGross(double gross)
	{
		this.gross=gross;
	}
	
	int getId()
	{
		return id;
	}
	
	String getName()
	{
		return name;
		
	}
	
	double getBasic()
	{
		return basic;
		
	}
	
	double getSalary()
	{
		return gross;
		
	}
	
	
	void printDetailsEMP()
	{
		System.out.println(" Id = "+ id + " Name = "+ name + " Salary = "+ gross );
	}
}

class RegularEmp extends Employee
{
	int HRA=800;
	
	RegularEmp()
	{
		
	}
	
	RegularEmp(int id, String name, int basic)
	{
		setData(id,name,basic);
		//this.id = id;
		//this.name = name;
		//this.basic=basic;
		
		double gross=(basic*1.70)+HRA;
		setGross(gross);
		
	}
	
	
	
	void printDetails()
	{   
		// System.out.println("Details of Regular Employee: ");
		System.out.println("Details of Regular Employee:\t Id = "+ getId() + " Name = "+ getName() + " Salary = "+ getSalary() );
	}
}

abstract class ContractBasedEmp extends Employee
{
    int tenure;
    
	ContractBasedEmp()
	{
		tenure = 0;
	}
    abstract void tenure();
	
	
 	
}

class CDACEmp extends ContractBasedEmp
{
	void tenure()
	{
	    
	}
	
	CDACEmp()
	{
		
	}
	
	CDACEmp(int id, String name, double basic, int tenure)
	{
	    setData(id,name,basic);
		//this.id = id;
		//this.name = name;
		//this.basic=basic;
		
		setGross(basic*2.50);
		this.tenure=tenure;
	}
	
	void printDetails()
	{
		// System.out.println("CDAC Employee Details: ");
		// System.out.println("Id= "+id + "Name= "+name + "Salary= "+gross );
		// printDetailsEMP();
		// getSalary();
		// System.out.printf("\t & Tenure is: %d Year(s)\n",tenure);
		System.out.println("CDAC Employee Details:\t Id = "+ getId() + " Name = "+ getName() + " Salary = "+ getSalary()+" & Tenure is: "+tenure+" Year(s)." );
	}
	
}

class ThirdPartyEmp extends ContractBasedEmp
{
	
	
	void tenure()
	{
	    
	}
	
	ThirdPartyEmp()
	{
		
	}
	
	ThirdPartyEmp(String name, double basic,int tenure)
	{
	    setData(0,name,basic);
		
		// this.name = name;
		// this.basic=basic;
		
		// gross=(basic*1.30);
		setGross(basic*1.30);
		this.tenure=tenure;
		
	}
	
	void printDetails()
	{
		// System.out.println("Third Party Employee Details: ");
		// System.out.println("Id= "+id + "Name= "+name + "Salary= "+gross );
		// printDetailsEMP();
		// getSalary();
		// System.out.printf("\t & Tenure is: %d",tenure);
		
		System.out.println("Third Party Employee Details\t Id = "+ getId() + " Name = "+ getName() + " Salary = "+ getSalary()+" & Tenure is: "+tenure+" Year(s)." );
	}
}


class Main
{
	public static void main(String args[])
	{
		RegularEmp obj = new RegularEmp(1,"Tarun", 100000);
		
		obj.printDetails();
		
		CDACEmp obj1 = new CDACEmp(2,"Samant",100000,2);
		obj1.printDetails();
		
		ThirdPartyEmp obj2 = new ThirdPartyEmp("Chetana",100000,1);
		obj2.printDetails();
	 }
}




/*
OUTPUT 02- USE OF PRIVATE KEYWORD IN ABSTRACT CLASS with tenure of Contract based employees

F:\CDAC\CDAC_Lab\Oct 18 2022>java Main
Details of Regular Employee:     Id = 1 Name = Rahul Salary = 170800.0
CDAC Employee Details:   Id = 2 Name = Sam Salary = 250000.0 & Tenure is: 2 Year(s).
Third Party Employee Details     Id = 0 Name = Chetan Salary = 130000.0 & Tenure is: 1 Year(s).

F:\CDAC\CDAC_Lab\Oct 18 2022>


OUTPUT 02- USE OF PRIVATE KEYWORD IN ABSTRACT CLASS without tenure of Contract based employees

F:\CDAC\CDAC_Lab\Oct 18 2022>javac Main.java

F:\CDAC\CDAC_Lab\Oct 18 2022>java Main
Details of Regular Employee:
 Id = 1 Name = Rahul Salary = 170800.0
CDAC Employee Details:
 Id = 2 Name = Sam Salary = 250000.0
Third Party Employee Details:
 Id = 0 Name = Chetan Salary = 130000.0

F:\CDAC\CDAC_Lab\Oct 18 2022>
*/