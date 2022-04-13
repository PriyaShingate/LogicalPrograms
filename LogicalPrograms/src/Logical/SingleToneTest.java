package Logical;

public class SingleToneTest {
	public static void main(String[] args) {
		
		SingleTone single=SingleTone.getInstance(); //new singletone not created because constructor is private
		System.out.println(single);
	
		SingleTone single1=SingleTone.getInstance(); 
		System.out.println(single);
	
	}

}

  //output=1.Logical.SingleTone@7de26db8 output of both references are same so only one object created i.e.it is singletone
      //   2.Logical.SingleTone@7de26db8
   //steps:1.make constructor private
   //      2.make method static (no need to create object:new Singletone)with 
    // class name also we can call method,because constructor is private not created object.to call the method without object creation we make method static
    //     3.we can use single memory only multiple times