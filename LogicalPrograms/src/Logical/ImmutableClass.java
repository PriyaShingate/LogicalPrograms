package Logical;

public  final class ImmutableClass {  //declare class as a final so it can not be extended(no child class created)
	
	private final String name; //make variables private and final,so that value can assign only once ,no one will change the value further(thread safe)
	private  final int id,rno;
	
	public ImmutableClass(String name,int id,int rno)
	{
		super();
		this.name=name;
		this.id=id;
		this.rno=rno;
		
	}
	public String getName() //use getter method only(do not use setter method to variables)
	{
		return name;
	}
	public int getid() 
	{
		return id;
	}
	public int getRno()
	{
		return rno;
	}
	public static void main(String[] args) {
		ImmutableClass obj=new ImmutableClass("priya",11, 101);
		System.out.println("Name:"+ obj.getName());
		  System.out.println("ID:"+obj.getid());
      System.out.println("Roll No:"+obj.getRno());
      System.out.println(obj.name=="pritesh");//false  OR: System.out.println(obj.getName()=="mayur");
      System.out.println(obj.name=="priya");//initialize value is priya so giving true value.
     // System.out.println(obj.name="pritesh");another name,id,rno is not possible as we define them as a final.
	
	}

}// we can use multiple memory
