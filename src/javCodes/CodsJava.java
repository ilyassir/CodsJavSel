package javCodes;

//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.Month;
//import java.time.Period;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.function.Predicate;

//import polymorph.Animal;
//import polymorph.Cat;
//import polymorph.Cow;
//import polymorph.Dog;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

//import java.util.Random;
//import java.util.Scanner;

//import day18.StackAndHeap;
//
//public class CodsJava {
//public static void main(String[] args) {





//The equals methods of all wrapper classes first check if the two object are of same class or not. If not, they immediately return false.

																	//IMPORT

//Interfaces, classes, and enums are all "types". Java allows a class to implement multiple interfaces. In this way, Java supports multiple inheritance of types. 
//"State", on the other hand, is represented by instance fields. Only a class can have instance fields and therefore, only a class can have a state. (Fields defined 
//in an interface are always implicitly static, even if you don't specify the keyword static explicitly. 
//Therefore, an interface does not have any state.) Since a class is allowed to extend only from one class at the most, it can inherit only one state. 
//Thus, Java does not support multiple inheritance of state.
//Java allows a class to implement multiple interfaces. In this way, Java supports multiple inheritance of types.
//Java supports multiple type inheritance but not multiple state inheritance.

//Java does not support multiple inheritance of state. Java supports multiple inheritance of types.

//you cannot import a package statically. You can only import static members of a class statically.
//import static <package>.<classname>.*; or import static <package>.<classname>.<fieldname>;

//you cannot use wildcards anyplace other than the end of an import statement.

//If you are not importing a class or the package of the class, you need to use the class's fully qualified name while using it.
// Here, you need to use util.log4j.Logger instead of just log4j.Logger: util.log4j.Logger logger = new util.log4j.Logger();
//Using a fully qualified class name always works irrespective of whether you import the package or not.  In this case, all classes of package util are available in 
//TestClass without any import statement but Logger is in util.log4j.
//Therefore, the use of fully qualified class name for Logger, which is util.log4j.Logger, makes it work.


																			//JAVAC
//The javac command compiles a .java file to a .class file
//javac Manager.java====>java Manager
//java package.Class deer "white tail" cute
//To run a class from the command line, you need a main(String[] args) method that takes an array of Strings array not just a String. 
//Therefore, an exception will be thrown at runtime saying no main(String[] ) method found. Note that String[] and String... are equivalent and so 
//parameter type of String... is also valid for main method. When you use String... the compiler allows you to pass any number of 
//String arguments to that method but internally, compiler converts String... to String[]. It also wraps the arguments into a String[] and invokes the String[] method. 
//The JVM has no idea about String... It sees only String[]


																		//CONSTRUCTOR	
//A default no args constructor will be provided if not defined any.
//A constructor can declare a return value.
//All non-final instance variables get default values if not explicitly initialized.
//A constructor is non-static, and so it can access directly both the static and non-static members of the class.
//Constructors need not initialize *all* the member variables of the class. A non-final member(i.e. an instance) variable will 
//be assigned a default value if not explicitly initialized.
//A constructor cannot be final, static or abstract.
//A constructor cannot return anything.
// if the parent class doesn’t define a no-argument constructor, the first line of a child class constructor should be an explicit call
//to super(int age).

//It is a compile-time error if a default constructor is implicitly declared but the superclass does not have an accessible constructor that takes no arguments and has no throws clause.  
//It follows that if the nullary constructor of the superclass has a throws clause, then a compile-time error will occur.



																		//STRING
//Actually, String class itself is final and so all of its methods are implicitly final.
//These are the six facts on Strings:
//1. Literal strings within the same class in the same package represent references to the same String object. 
//2. Literal strings within different classes in the same package represent references to the same String object. 
//3. Literal strings within different classes in different packages likewise represent references to the same String object. 
//4. Strings computed by constant expressions are computed at compile time and then treated as if they were literals. 
//5. Strings computed at run time are newly created and therefore are distinct. (So line 4 prints false.)
//6. The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents. (So line 5 prints true.)
	
//String is immutable  Actually, String class itself is final and so all of its methods are implicitly final.

//     \n==adds a blank line in print line. 
	
	//Substring
	//str="Java is fun";
	//str.substring(5,7)="is"
	//str.substring(8,8)=  blank line
	//str.substring(8)="fun"
	//String[] arr=str.split(" ")=will create an array of 3 elements, by dividing str from the spaces.[java][is][fun]
	//String[] arr=str.split=("is")=[java][fun]

//A String is immutable while a StringBuilder is not.

//Instance String variables(class) has null value if not instantiated, if they are in the local area then they they wont have a default value.
//System.out.println("a" + "b" + 3); // ab3
//System.out.println(1 + 2 + "c"); // 3c

//A String concatenated with any other type gives a String;
//String a = "";
//a += 2;
//a += 'c';
//a += false;
//sysout(a)="2cfalse"



																	//STRINGBUILDER
//Stringbuilder class itself is final and so all of its methods are implicitly final.
//StringBuilder extends Object
	//StringBuilder sb=new StringBuilder();first way
	//StringBuilder sentence=new StringBuilder("StringBuilder is mutable");second way
	//stb.insert(0, "Java ")== inserting a string to the begining of a str builder.
	//"java is fun".delete(5, 7);=="java fun" (deleting like substring
	//strbuilder.reverse="reversed strbuilder";
	//strbuilder.toString()// this is very important for comparisons(==)
	//if(panind.toString().equals(panind.reverse().toString());

//StringBuilder b = "rumble"; this does not work we cannot do a SB like this.

//public StringBuilder(int capacity)
//Constructs a string builder with no characters in it and an initial capacity specified by the capacity argument.
//A String is immutable while a StringBuilder is not.
																		//PRIMITIVES
//Data Type	Default Value (for fields-instance-class level-!!not local!!) if these are local there is no default value, comp error.
//byte           	0
//short				0
//int				0
//long				0L
//float				0.0f WE MUST USE F
//double			0.0d
//char				'\u0000'
//String (or any object)  	null
//boolean			false

//byte<char<short<int<long<float<double

//The code fails to compile if a local variable is not explicitly initialized. If this question
//were about instance variables, options D and F would be correct. A boolean primitive
//defaults to false and a float primitive defaults to 0.0.

//Underscores are allowed as long as they are directly between two other digits. they are not allowed at the end or beginning.
//Java is platform independent.
//finalize() method may not be called or may be called, if called, it cannot be called more than once.

//Remember these rules for primitive types: 
//1. Anything bigger than an int can NEVER be assigned to an int or anything smaller than int ( byte, char, or short) without explicit cast. 
//2. CONSTANT values up to int can be assigned (without cast) to variables of lesser size (for example, short to byte) if the value is representable by the variable.
//( that is, if it fits into the size of the variable). 
//3. operands of mathematical operators are ALWAYS promoted to AT LEAST int. (i.e. for byte * byte both bytes will be first promoted to int.) 
//and the return value will be AT LEAST int. 
//4. Compound assignment operators ( +=, *= etc)  have strange ways so read this carefully:  
//A compound assignment expression of the form E1 op= E2 is equivalent 
//to E1 = (T)((E1) op (E2)), where T is the type of E1, except that E1 is evaluated only once. Note that the implied cast to type T may be either an
// identity conversion or a narrowing primitive conversion. 
//For example, the following code is correct:  short x = 3; x += 4.6;  
//and results in x having the value 7 because it is equivalent to:  short x = 3; x = (short)(x + 4.6);

//chaining to use a value of a variable at the time of declaration is not allowed. For example, int a = b = c = 100; is invalid if b and c are not already declared. 
//Had b and c been already declared,
// int a = b = c = 100; would have been valid.

																	//NAMING
//identifier name can start with a letter, $, or_. Numbers not permitted as the first char.
//Class names begin with UpperCase(not has to) but absolutely no numbers at the start(has to), variable names start with lower case letters.

	

																		//INTS
//int dimes, quarters,nickels;
//dimes= quarters=nickels=0;
//int i=Integer.parseInt("2146634678");
//Chaining to use a value of a variable at the time of declaration is not allowed. Had b and c been already declared, it would have been valid. For
// example, the following is valid:   int  b = 0, c = 0;   int a = b = c = 100;
// Even the following is valid:   int  b , c;  //Not initializing b and c here. int a = b = c = 100; //declaring a and initializing c, b, and a at the same
// time. Notice the order of initialization of the variables - c is initialized first, b is initialized next by assigning to it the value of c. Finally, a is
// initialized.
	
																		//SCANNER
	
//	Scanner kb=new Scanner(System.in);
//	int a=kb.nextInt();if entry is int
//	Double d=kb.nextDouble();if entry is double
//	String str=kb.nextLine();if entry is a String
																		//RANDOM
	
	//Random random=new Random();
	//int secretnum=random.nextInt(100);
	
	
	
																		//ARRAYS
//      .length   !!!!!!!!!!!!1NOT .length();!!!!!!!!!!

//all arrays(itselves) are objects not primitives
//array braces[] can appear before or after the array name
//Java allows arrays of length zero to be created. 
//Here is an example: 
//int[] zeroLengthArray1 = new int[0]; System.out.println(zeroLengthArray1.length); //will print 0 
//String[] zeroLengthArray2 = new String[0]; System.out.println(zeroLengthArray2.length);  will print 0
//an empty array prints [] not 0;
//When you create an array of Objects ( here, Strings) all the elements are initialized to null
//Elements of Arrays of primitive types are initialized to their default value ( i.e. 0 for integral types, 0.0 for float/double and false for boolean)
//Elements of Arrays of non-primitive types are initialized to null.


//All the arrays are initialized to contain the default values of their type. 
//This means, int[] iA = new int[10]; will contain 10 integers with a value of 0. 
//Object[] oA = new Object[10]; will contain 10 object references pointing to null.
//boolean[] bA = new boolean[10] will contain 10 booleans of value false.
//It will not throw NullPointerException because args[] is never null. If no argument is given (as in option a) 
//then the length of args is 0.



//When Printing do not forget to use Arrays.toString(arr); if you forget, it will print ;[Ljava.lang.String;@7852e922

//FIRST WAY	
//	String[] creditcards=new String[3];
//	creditcards[0]="zira";
//	creditcards[1]="vaki"; if we dont create [1] and leave it blank it will print [null] for String, [0] for int
//	creditcards[2]="isba";
	//no .add(); here
//SECOND WAY
//	String [] days={"Monday", "Tuesday", ...};
//THIRD WAY
//	long[] abc= new long[] {2232,45675,878061,3454333,4233445};

//PRINTING AN ARRAY WITH FOR LOOP
//	System.out.println("my shopping list is: ");
//	for(int i=0; i<shoplist.length; i++) {
//			System.out.println(shoplist[i]);}
//Size of the array is NEVER specified on the Left Hand Side.

//CONVERTING AN ARRAY TO A STRING
//	Arrays.toString(names)	
//BINARY SEARCH
//	(Arrays.binarySearch(int, 2));

//If a number or other object isn’t in the list, we will put it to where it should be then we will extract 1 and put - to the beginning.
//example   int[] arr={2,4,6}//(Arrays.binarySearch(arr, 1)==-1. here there is no 1 but it would be the 0th element if it were there. 
//So we extracxt 1 and put - to the beginning and the result will be -1.
//when sorting; numbers sort before letters and strings sort alphabetically.
//for search binarySerach(); for sort sort();
//if elements of the aray are strings, then the sort method uses alphabetical order

//CONVERTING
//String[] str= {"Ali", "Veli","Durali"};
//System.out.println(Arrays.toString(str));


//PRINTING AN ARRAY WITH FOR EACH LOOP
//	String[] mydaughters=new String[3];
//	mydaughters[0]="ayca";
//	mydaughters[1]="defne";
//	mydaughters[2]="sedef";
//	for
//	(String s:mydaughters)
//	{System.out.println(s);}
	
//	twoDimLong[1][1]=135;
//	System.out.println(Arrays.deepToString(twoDimLong));
	
//When we print cards, it will be in paranthesis.[]	

//array is fixed size --> array list resizable
//array can contain primitives --> arrray list can only hold objects, if you want to use primitives in ArrList, you must use wrappers
//both can contain duplicates
//both keep ordering
//array can be multidimensional

//how to convert ArrayList to Array
		//lst.toArray()
//how to convert Array to ArrayList
		//Arrays.asList(lst)
//how to find element
		//index of method or Binary search
//how to delete element
		//remove all and/or clear.
//anyway(work around) to resize an array?
		//int[] nums={23,6,2,1}
		//nums=Arrays.copyOf(nums, nums.length+1)

//Arrays have a method named length;   
//String[] sa = { "a", "b" }; int k = sa.length; 
//k will be assigned a value of 2.
//Size of the array is NEVER specified on the Left Hand Side.

//Difference between the placement of square brackets:
//int[] i, j; //here i and j are both array of integers. 
//int i[], j; //here only i is an array of integers. j is just an integer.

//an array of integers IS an Object : Object obj = new int[]{ 1, 2, 3 }; // is valid. 
//But it is not an array of objects. Object[] o = new int[10]; // is not valid.

//{} is not a valid way to create an Object here. However, it is valid while creating an array. 
//For example, the following are valid: String[] sa = { }; 
//assigns a valid String[] object of length 0 to sa Object arr[][] = new Object[][] {new String[5], {} }; 
//assigns a valid Object[] object of length 0 to arr[1].	

//For a multi dimensional array, to reach an individual item, you need to specify index for each dimension. 
//For example, since matrix is a two dimensional array, matrix is an array of array 
//and matrix[0] will give you the first array of the arrays. 
//matrix[0][0] will give you the first element of the first array of the arrays.

//This shows that while creating a one dimensional array, the length must be specified but while creating multidimensional arrays, 
//the length of the last dimension can be left unspecified. Further, the length of multiple higher dimensions 
//after the first one can also be left unspecified if none of the dimensions are specified after it. 
//So for example, a[][][][] = new int[4][3][3][5]; is same as a[][][][] = new int[4][][][]; (Note that the first dimension must be specified.)  
//Thus,  multidimensional arrays do not have to be symmetrical.
//Although it is legal to leave out the size for later dimensions of a multidimensional array, the first one is required.
																				


																				//ARRAYLIST
//.size()   !!!!!!!!!!!!!!!NOT .size;!!!!!!!!!!!!!!11



//import java.util.* // import whole package including ArrayList
//import java.util.ArrayList; // import just ArrayList


//List is an interface that cannot be instantiated. This is not true; List a=new List();
//The ArrayList class implements a growable array of objects.  
//ArrayLists cannot hold primitive data types such as int, double, char, and long 
//(they can hold String since String is an object, and wrapper class objects (Double, Integer).
//ArrayList has a method named size() that returns the number of elements in the ArrayList
//ArrayList is a subclass of Abstract class List.
//an ArrayList is a List so you can use it where ever a List is required. This include Collections methods such as sort, reverse, and shuffle.

//	ArrayList cards=new ArrayList();
//	cards.add
//  cards.add(2, 678);
//here we can put anything to the cards as we did not mention any type on declaration.
//  System.out.println(cards.get(5));
//firstway
//  ArrayList<String> srtList=new ArrayList<>(); here we can only add strings to the srtList
	//srtList.add();
	//srtList.set(2, "tomatoes")==> to change the 3rd element with tomatoes.
	//System.out.println("line 64"+shoppingList+", "); we can print like this. In the Arrays we had to use Arrays.ToString.
//srtList.remove();
//srtList.contains();
//shoppingList.isEmpty();

//secondWay
	//String[] str= {"ali", "veli"};
	//List<String> namesList=Arrays.asList(str);//we created a arraylist but we cannot add anything to it. This is our sacrifice
//third Way
	//List<Integer> nums = Arrays.asList(12,343,45,56,564,23,434);
	//	System.out.println(nums);==>prints[12,...]

//to convert ArrayList to Array
	//List<String> days = new ArrayList<>();

	//String[] daysArr = days.toArray(new String[0]);
	//System.out.println(Arrays.toString(daysArr));==>prints[]
	
//comparing two ArrLists
	//booksinShelf1.equals(booksinShelf2)==>equals method; checks if lists contain the same values in the same indexes. 
//Even if one word changes, or the index is different, it will be false.
	//booksinShelf1.containsAll(booksinShelf2))==>containsAll method. Here we will just look for the items not the indexes. 
//here we look whether list 1 is including list2. List 2 may be smaller. So we should be carefull/

	
	
																		//IF STATEMENT
	
//	if (examResult > 90) {do this}
//	else if (examResult > 80) {do it}
//	else if (examResult > 70) {do that}
//	else if (examResult > 65) {do these}
//	else {do these}

//if-clause and the else-clause can have empty statements. Empty statement ( i.e. just ; ) is a valid statement. 
//But this is illegal : if (true) else; because the if part doesn't contain any valid statement.
//(A statement cannot start with an else!) 
//So, the following is valid. if(true) if(false); because if(false); is a valid statement.
																	//WHILE

//It is not possible to break out of an if statement. But if the if statement is placed within a switch statement or a loop construct, it is possible
//a while condition expects a boolean or Boolean value.
//break; leaves the loop
//continue; leaves current variable and goes on to the next one
	
	
	//while(CONDITION) {
		//System.out.print();}
	
	//while(num<=100) {
		//if (num % 2 == 0) {
			//if(num>8){
			//System.out.print(num+", ");}}}

																	//DO WHILE
//	int a=10;
//	do {
//	System.out.print(a+",");
//	a--;
//	}while(a>=1);
//	System.out.println("----------");
	
	
																		//FOR LOOP
	

//	for (int i=10; i>=0; i-=2) {
//		System.out.print(i+",");
//PRINTING AN ARRAY WITH FOR LOOP
//	System.out.println("my shopping list is: ");
//	for(int i=0; i<shoplist.length; i++) {
//			System.out.println(shoplist[i]);}
	
																		//FOR EACH LOOP
	
//	String[] mydaughters=new String[3];
//	mydaughters[0]="ayca";
//	mydaughters[1]="defne";
//	mydaughters[2]="sedef";
//	for
//	(String s:mydaughters)
//	{System.out.println(s);}
	
	
	//BOOLEAN
// Boolean class has two constructors - Boolean(String) and Boolean(boolean) The
// String constructor allocates a Boolean object representing the value true if
// the string argument is not null and is equal, ignoring case, to the string
// "true". Otherwise, allocate a Boolean object representing the value false.
// Examples: new Boolean("True") produces a Boolean object that represents true.
//as the same (new Boolean("TrUE")) wil be true too.
// new Boolean("yes") produces a Boolean object that represents false. 
//The boolean constructor is self explanatory. 2. Boolean class has two static
// helper methods for creating booleans - parseBoolean and valueOf.
// Boolean.parseBoolean(String ) method returns a primitive boolean and not a
// Boolean object (Note - Same is with the case with other parseXXX methods such
// as Integer.parseInt - they return primitives and not objects). The boolean
// returned represents the value true if the string argument is not null and is
// equal, ignoring case, to the string "true". Boolean.valueOf(String ) and its
// overloaded Boolean.valueOf(boolean ) version, on the other hand, work
// similarly but return a reference to either Boolean.TRUE or Boolean.FALSE
// wrapper objects. Observe that they dont create a new Boolean object but just
// return the static constants TRUE or FALSE defined in Boolean class. 3. When
// you use the equality operator ( == ) with booleans, if exactly one of the
// operands is a Boolean wrapper, it is first unboxed into a boolean primitive
// and then the two are compared (JLS 15.21.2). If both are Boolean wrappers,
// then their references are compared just like in the case of other objects.
// Thus, new Boolean("true") == new Boolean("true") is false, but new
// Boolean("true") == Boolean.parseBoolean("true") is true.	
	
														//TERNARY CODE
	
//System.out.println((order>0) ? "correct":"incorrect");
//System.out.println((num>2) ? "positive":"negative");
//both right side operands must be the same type this is not good="positive":30;
														//MATHS
	
//ppl+=3; // ppl*2 //ppl*=2
	
//all the values smaller than int become int after an operation. byte q=4; byte w=9; does not work byte d=q+w; must be like this=	int r=q+w;
														//	EXPLICIT CASTING
	
//	int Num=100; double d= Num; (burada buyugun icine koyuyorum)	==>         int i= (int) d;(burada kucultup eski yerine koyuyorum)
//  byte b= 50;  								                	==>			short s= (byte) b;
	
														//polymorphism casting	

//Here are some basic rules to keep in mind when casting variables:
//1. Casting an object from a subclass to a superclass doesn’t require an explicit cast. car=mercedes==> all merecedes are cars
//2. Casting an object from a superclass to a subclass requires an explicit cast. (mercedes) car==> because not all cars are mercedes
//3. The compiler will not allow casts to unrelated types.
//4. Even when the code compiles without issue, an exception may be thrown at runtime if
//the object being cast is not actually an instance of that class.
//If you’re casting from a subtype to a supertype, an explicit cast is not required.
//A x=new B(); method comes from B class and variable comes from A class.



														//STACK AND HEAP
//StackAndHeap emp1=new StackAndHeap();//right side will be in Heap. Left side will be in Stack==>objects are in the heap, refrences are in the stack
	
														//LOGICAL OPERATORS
//The == operator compares whether the two references are pointing to the same object or not. Here, they are not, so it returns false.
//Note that both equals() and hashCode() methods can be overridden by the programmer so you can't say anything about what they will return without looking at the code.

//"&&" will not go to the right side if left side is false "&" will still go to the right side even if right side is false.
// logical &= must be everything true in the same time. other wise it will be false
//		System.out.println("true&true:"+ (true&true));
//		System.out.println("true&false:"+ (true&false));
//		System.out.println("false&true:"+ (false&true));
//		System.out.println("false&false:"+ (false&false));
// logical |= one of the sides must be true. other wise it will be false
//		System.out.println("true|true:"+ (true|true));
//		System.out.println("true|false:"+ (true|false));
//		System.out.println("false|true:"+ (false|true));
//		System.out.println("false|false:"+ (false|false));
// logical ^= must be one side true. other wise it will be false
//		System.out.println("true^true:"+ (true^true));
//		System.out.println("true^false:"+ (true^false));
//		System.out.println("false^true:"+ (false^true));
//		System.out.println("false^false:"+ (false^false));

															//SWITCH
//We cannot use long, double, float or boolean in Switch. You cannot use a boolean expression in a switch statement and for case statements.
//byte, char, short, int, String, and enums. Wrapper classes Byte, Character, Short, and Integer are allowed as well. 
//Switch statments may have 0 or 100 cases but can have only 1 default.
//Default can take place anywehere we want
//be carefull about the return type string should be string and int should be int.

//	String selection2=scanner.next(); 
//	switch(selection2) {
//	case "strawberry":
//	break;
//	default:

//The type of the switch expression must be String, char, byte, short, or int (and their wrapper classes), or an enum or a compile-time error occurs. 

//All of the following must be true, or a compile-time error will result:
//1. Every case constant expression associated with a switch statement must be assignable (5.2) to the type of the switch Expression.
//2. No two of the case constant expressions associated with a switch statement may have the same value.
//3. At most one default label may be associated with the same switch statement.

//Basically it looks for a matching case or if no match is found it goes to default. (If default is also not found it does nothing)
//Then it executes the statements till it reaches a break or end of the switch statement.

//Here are the rules for a switch statement:
//1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. (String is allowed only since Java 7). 
//2. The case constants must be assignable to the switch variable. For example, if your switch variable is of class String, your case labels must use Strings as well.
//3. The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535.
//4.  All case labels should be COMPILE TIME CONSTANTS. must be set like int a=8; not like int a;
//5. No two of the case constant expressions associated with a switch statement may have the same value.
//6. At most one default label may be associated with the same switch statement.
	
															//WRAPPER CLASS
	
//String, StringBuilder, and StringBuffer - all are final classes.

//1. Remember that wrapper classes (java.lang.Boolean, java.lang.Integer, java.lang.Long, java.lang.Short etc.) are also final and so they cannot be extended. 
//2. java.lang.Number, however, is not final. Integer, Long, Double etc. extend Number.
//3. java.lang.System is final as well.

//All the wrapper objects are immutable	
//	Integer i=new Integer(1200);			//first method to create a wrapper int
//	String str="hurr";
//	Integer n=123;							//second method to create a wrapper
//	Integer count=Integer.valueOf(4000);	//3#rd method is using value of
	
//Wrapper class           Converting String to primitive         Converting String to wrapper class
//Boolean                  Boolean.parseBoolean("true");                Boolean.valueOf("TRUE");
//Byte                      Byte.parseByte("1");                        Byte.valueOf("2");
//Short 					Short.parseShort("1"); 						Short.valueOf("2");
//Integer 					Integer.parseInt("1"); 						Integer.valueOf("2");
//Long 						Long.parseLong("1"); 						Long.valueOf("2");
//Float 					Float.parseFloat("1"); 						Float.valueOf("2.2");
//Double					Double.parseDouble("1");					Double.valueOf("2.2");
//Character					None										None

//	Integer num=new Integer(80);
//	int num2=num;// Unboxing from Integer object to primitive

//	int k=345;
//	Integer k1=k;//autoboxing





//The parseInt() method return a primitive(int, long vs), th evalueOf() method return a wrapper class Object.  int i=Integer.parseInt("2146634678");
//Each wrapper class has a constructor that takes primitive equivalent.
	
															//	STATIC METHODS
//flag is not static and so it can be accessed only from a non-static block. loop is static so can be accessed from any block.
//If the instance method or variable is static, I can call it without creating an object of that class
//if it is not static, then I have to create an object and call it that way like; str.variable.	
//an instance method can call another instance method
//an instance method can call a static method in same class
//a static method can not call an instance method in same class
//a static method can call another static method in the same class. 
//if we don`t have an object but trying to call a method it will lead to null exception.\\

//static variables can be left without being explicitly initialized. (They will get default values).
//final variables must be explicitly initialized.
//If you declare a field to be final, it must be explicitly initialized by the time the creation of an object of the class is complete. So you can either 
//initialize it immediately: private final double ANGLE = 0; or you can initialize it in the constructor or an instance block.

//Remember that static and instance variables are automatically assigned a value even if you don't initialize them 
//explicitly but local variables must be initialized explicitly before they are used.
//'this' is assigned a reference to the current object automatically by the JVM. Thus, within an instance method foo, calling this.foo(); is same as calling foo();  
//Since there is no current object available for a static method, 'this' reference is not available in static methods and therefore it can only be used within instance methods.
//For the same reason, static methods cannot access non static fields or methods of that class directly i.e. without a reference to an instance of that class.
//Note : you can't reassign 'this' like this: this = new Object(); 
//Static final variables must be set when declared or init must be in a static block.  
//a non-static method (i.e. an instance method) can only be called on an instance of that class. Whether the caller itself is a 
//static method or not, is immaterial.  The main method is calling ref.func(); - 
//this means the main method is calling a non-static method on an actual instance of the class TestClass (referred to by 'ref').

															//GETTERS AND SETTERS
//public int getnumberofCylinder() {//getter for numberofCylinder
//return numberofCylinder;  }

//public void sethorsepower(int horsepower) {//setter for first nam
//this.horsepower=horsepower;}
															//OVERLOADING
	
//You cannot have more than one method in a class with the same signature. Method signature includes method name and the argument list but does not include return type. 

//Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.

//3 METHODS:

//1)add(int, int)
				//add(int, int, int)

//2)add(long, int)
				//	add(int, float)

//3)add(int, float)
				//	add(float, int)

//You cannot have two methods with the same signature (name and parameter types) in one class. 
//Also, even if you put one sayHello() method in other class which is a subclass of this class, 
//it won't compile because you cannot override/hide a static method with a non static method and vice versa.															


																//OVERRIDING(inheritance)

//1 The method in the child class must have the same signature as the method in the parent class.Examp; 
//public visit(int distance, String city)===>public visit(int distance, String city)
//2.the method in the child class must be at least as accessible or more accessible than the
//method in the parent class.
//3. The method in the child class may not throw a checked exception that is new or
//broader than the class of any exception thrown in the parent class method.
//4. If the method returns a value, it must be the same or a subclass of the method in the
//parent class, known as covariant return types.


//Over riding occurs when there is an inheritabce relation. Original method resides in the parent class and in the child class we override it.

//@Override
//public void doDaily() {
//System.out.println(position+" developing");}

//A method can be overridden by defining a method with the same signature(i.e. name and parameter list) and return type as the method in a superclass.
//The return type can also be a subclass of the original method's return type.
//Only methods that are accessible can be overridden. A private method cannot, therefore, be overridden in subclasses, 
//but the subclasses are allowed to define a new method with exactly the same signature. 

//A final method cannot be overridden. 
//An overriding method cannot exhibit behavior that contradicts the declaration of the original method. 
//An overriding method therefore cannot return a different type (except a subtype) or throw a wider spectrum of 
//exceptions than the original method in the superclass. This, of course, applies only to checked exceptions 
//because unchecked exceptions are not required to be declared at all.
//A subclass may have a static method with the same signature as a static method in the base class but it is not 
//called overriding. It is called hiding because the concept of polymorphism doesn't apply to static members.
//protected and public methods may be overridden, not hidden. 
//private methods are always hidden in a subclass. static methods cannot be overridden, only hidden. 
//variables may only be hidden, regardless of the access modifier.
//private methods may only be hidden, not overridden.

//In case of overriding, the return type of the overriding method must match exactly to the return type of the overridden method if the return type is a primitive.
//(In case of objects, the return type of the overriding method may be a subclass of the return type of the overridden method.)

//again:
	//In case of overriding, the return type of the overriding method must match exactly to the return type of the overridden 
	//method if the return type is a primitive.
	//(In case of objects, the return type of the overriding method may be a subclass of the return type of the overridden method.)

//There are 2 important concepts involved here:

//1. The overriding method must have same return type in case of primitives (a subclass is allowed in case of classes) 
//(Therefore, the choices returning int are not valid.) and the parameter list must be the same 
//(The name of the parameter does not matter, just the Type is important). 

//In case of overriding, the return type of the overriding method must match exactly to the return type of the overridden method if the return type is a primitive.
//(In case of objects, the return type of the overriding method may be a subclass of the return type of the overridden method.)

//2. The overriding method can throw a subset of the exception or subclass of the exceptions thrown by the overridden 
//class. Having no throws clause is also valid since an empty set is a valid subset. 

//private methods are not inherited at all so there is no question of overriding or hiding a private method. 
//A subclass is free to have a static or instance method with the same signature as that of a private instance or static method of a super class. 
//The subclass method will neither override nor hide the superclass's method in such a case.
																		
																	//METHOD HIDING


//Hiding occurs in inheritance. original variable resides on parent class, we create the same variable in the child class.
//protected String position= "developer";//here I am hiding the variable in the Parent class.In the main class it was
//protected String position="scrum member"
//hiding depends on where you are calling it from. It will look for the closest(the same class`s) variable`s value
//this is also used for the static methods which cannot be overridden.

//private methods are always hidden in a subclass.they cannot be overridden
//static methods cannot be overridden, only hidden.
//variables may only be hidden, regardless of the access modifier.

//With hidden methods, the specific method used depends on where it is referenced. 
//It depends on which class you call, it will go to the closest class.




																	//Hiding Static Methods

//A hidden method occurs when a child class defines a static method with the same name
//and signature as a static method defined in a parent class. Method hiding is similar but
//not exactly the same as method overriding. First, the four previous rules for overriding a
//method must be followed when a method is hidden. In addition, a new rule is added for
//hiding a method, namely that the usage of the static keyword must be the same between
//parent and child classes. The following list summarizes the five rules for hiding a method:
//1. The method in the child class must have the same signature as the method in the parent class.
//2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
//3. The method in the child class may not throw a checked exception that is new or
//broader than the class of any exception thrown in the parent class method.
//4. If the method returns a value, it must be the same or a subclass of the method in the
//parent class, known as covariant return types.
//5. The method defined in the child class must be marked as static if it is marked as
//static in the parent class (method hiding). Likewise, the method must not be marked
//as static in the child class if it is not marked as static in the parent class (method
//overriding).

																//INPUT STREAM (SFWSRC)

//String filePath="C:\\Users\\sir\\Desktop\\DataTable1.xlsx";//make them \\ or / not else
//FileInputStream inStream=new FileInputStream(filePath); //open file and convert to a stream of data
//Workbook workbook=WorkbookFactory.create(inStream);//take the stream of data and use it as WorkBook
//Sheet worksheet=workbook.getSheetAt(0);//get the worksheet from the workbook
//Row row=worksheet.getRow(0);//goto first row
//Cell cell=row.getCell(0);//goto first cell
		
																//OUTPUT STREAM(SFWFW)

//String testDataPath="./src/test/resources/testData/DataTable1.xlsx";//insetad of project name we add "."
//FileInputStream inStream=new FileInputStream(testDataPath);
//Workbook workbook=WorkbookFactory.create(inStream);
//Sheet worksheet=workbook.getSheet("Sheet1"); //this I use the name of the sheet. in read, I used index number=0;
//Cell job= worksheet.getRow(6).getCell(2);
//job.setCellValue("Architecture Engineer");//I change his job
//FileOutputStream outStream=new FileOutputStream(testDataPath);
//workbook.write(outStream);
																	//ABSTRACT CLASSES

//Abstract classes includes abstract methods that must be implemented by the child classes. ??after Java8 it can also have nonabstract methods too??
//we cannot instantiate the abstract classes like= "new AbstractClass();" because its aim  is to be extended not anything else.
//when we extend to an abstract class, we receive the warning to implement the methods which lie in the parent abstract class 

//interface and abstract classes cannot be instantiated.

//abstracts can extend to eachother, donot implement.

//In Java, you can accomplish this task by using an abstract class and abstract method. An
//abstract class is a class that is marked with the abstract keyword and cannot be instantiated.

//An abstract method is a method marked with the abstract keyword defined in an
//abstract class, for which no implementation is provided in the class in which it is declared.

//Abstract Class Definition Rules:
//1. Abstract classes cannot be instantiated directly.
//2. Abstract classes may be defined with any number, including zero, of abstract and nonabstract
//methods.
//3. Abstract classes and methods may not be marked as private or final.
//4. An abstract class that extends another abstract class inherits all of its abstract methods
//as its own abstract methods.
//5. The first concrete class that extends an abstract class must provide an implementation
//for all of the inherited abstract methods.
//Abstract Method Definition Rules:
//1. Abstract methods may only be defined in abstract classes.
//2. Abstract methods may not be declared private or final. If declared they cannot be overridden, if we try to override will lead to compile error
//3. Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.
//4. Implementing an abstract method in a subclass follows the same rules for overriding a
//method. For example, the name and signature must be the same, and the visibility of
//the method in the subclass must be at least as accessible as the method in the parent class.
//abstract methods may be protected or public. They cannot be final private or default
//Both abstract classes and interfaces can contain static methods,
																
																		//EXTEND
//String, StringBuilder, and StringBuffer - all are final classes.  
//1. Remember that wrapper classes for primitives (java.lang.Boolean, java.lang.Integer, java.lang.Long, java.lang.Short etc.) are also final and so they cannot be extended. 
//java.lang.System is final as well.


																		//INTERFACE
//all variables in interfaces are assumed to be public static final,
//interface and abstract classes cannot be instantiated. after Java8 static and default methods are possible on interfaces.
//interfaces extend to eachother, donot implement. Normal classes first extend abstract then implement interface

//public interface Flyable {
//public static final int winCount=2; a field in an interface is automatically public static and final.
//int tailCount=1; this is automatically public static final.

//interface class is public or default= public interface asdf{ or interface asdf{

//void fly(); a normal method is always public and abstract even if it is not stated.they cannot be final or static.//even if I dont state it is abstract.
//Fields in an interface are implicitly public, static and final. Although you can put these words in the interface definition but it is not a good practice to do so
//We can also have normal methods in Interface classes so they are allways public and default. Default must be declared in the signature and they must have a body.
//default void doSuper(){
//	System.out.println("default stop");}

//When I override a method from an interface, @Override//must have the same signature.return must be the same or co-variant(subtype).
//it should not have less visible access modifier
//public static void practise() {//static methods with bodies(not an abstract method) must have a body and they are not inherited to sub classes. 
//these are called with class names like Bike.practise.
//System.out.println(" ");

//Both abstract classes and interfaces can contain static methods,

//Interfaces cannot be instantiated directly.
//2. An interface is not required to have any methods.
//3. An interface may not be marked as final.
//4. All top-level interfaces are assumed to have public or default access, and they must
//include the abstract modifier in their definition. Therefore, marking an interface as
//private, protected, or final will trigger a compiler error, since this is incompatible
//with these assumptions.
//5. All nondefault methods in an interface are assumed to have the modifiers abstract
//and public in their definition. Therefore, marking a method as private, protected,
//or final will trigger compiler errors as these are incompatible with the abstract and
//public keywords.
//interface variables are implicitly public, static and final.


//When you mark a method in an interface as default, you are basically trying to provide a default implementation of that method so that any class that 
//implements this interface doesn't necessarily have to provide its own implementation. Thus, a default method without a method body doesn't make sense. 
//default void compute(){ } would be valid.  
//Remember that default keyword can occur for a method only in an interface and NOT in an abstract class.
//An interface can have a static method but the method must have a body in that case because a static method cannot be abstract.
//An interface method cannot be default and static at the same time because a default method is always an instance method.

															//POLYMORPHISM

//Cat ca=new Cat();Animal a2=new Cat();//the same here as dog class extends to Animal. this is a "is a relation". So I create a Dog Animal.(Dog is an Animal)
//Cow co=new Cow();//Animal a3=new Cow();
//java allows multiinheritance using interfaces
//!!!!when it is variables, look at the reference type. When it is methods look at the object type. !!!!
//reference to an object requires an explicit cast if referenced with a subclass.
//If the cast is to a superclass reference, then an explicit cast is
//not required. Because of polymorphic parameters, if a method takes the superclass of
//an object as a parameter, then any subclass references may be used without a cast, 
//All objects extend java.lang.Object, so if a method takes Object type, any valid object, including null, may be passed as a reference;
//a null value can always be passed as an object value, regardless of type,



																	//EXCEPTIONS

/*
 * try
 * {code}
 * catch(exception e)
 * {}
 * 
 */

//throwable, exceptions and runtime exceptions are in java.lang which comes automatically with the Java no need to import them.
//For checked exceptions, Java requires the code to either handle them or declare them
//in the method signature.
//String v=null;
//v.length=nullpointer exception.

//Instance variables and methods must be called on a non-null reference. If the reference is
//null, the JVM will throw a NullPointerException.

//public String name;
//int x = Integer.parseInt(name);==>numberFormatException,



//When you’re calling a method that throws an exception, the rules are the same as within a method.

//smtimes we may need read a txt file from smwher If that file is not there, it gives an excepion 
//this is a checked exception. SO we have to handle it. Or it will not compile

//	String filePath="//users//cybertek//notes.txt";
//	try {
//	FileReader fs=new FileReader(filePath);
//	BufferedReader reader=new BufferedReader(fs);
//	String line=reader.readLine();}
//	catch(IOException a)
//	{System.out.println("I found the exception");}

//URL url=new URL("Hello");
//} catch (MalformedURLException e) {

//System.out.println(strA.get(0));}
//catch(IndexOutOfBoundsException a) {
	
//FileReader fs=new FileReader("filePath");
//catch(IOException a)

//if we have only 5 elements in array and want to see the sixth one;
//int[5]
// ArrayIndexOutOfBoundsException

//java.lang.ArithmeticException

//{finally {  finally will run even if exception was not caught. it runs at all cases except when we use exit;


//If we use(multi-catch blocks) sub-types they should be siblings or the second one should be broader 
//because the first one may catch all and there may be no need for the second or third.

//System.out.println("Exception message is: "+ ex.getMessage());//here I see the messsage
//ex.printStackTrace();//here I want to see what was wrong. 
//I would not be able to see it because of try message.

//when we override a method from parent class. We can leave it empty(it will be the same exception), throw the same exc. throw a narrower exc.
//we cannot declare smt broader, we cannot put siblings or unrelated exceptions
//we cannot throw a checked exception however we can throw anykind of unchecked exceptions

//if
//(c.getAge()<18)
//{throw new ArithmeticException("Dear "+c.getName()+" you are not old enough to vote");}//this is an unchecked exception.

//*************************
//If we dont try-catch this method,it will break all the code and nothing else will be executed
//*************************
//Scanner kb=new Scanner(System.in);
//System.out.println("please enter your id");
//String userID=kb.nextLine();	
//if
//(! userID.equalsIgnoreCase(USERID))
//{throw new RuntimeException("Wrong User ID");}//these are unchecked exceptions. Here I stop program my self.
//When one of these are caught, the rest will not run.
	
//throw new RuntimeException(); when we declare an unchecked exception we dont have to handle it or we dont have to use throws in the signature
//throw new IllegalArgumentException("Invalid Input");//here we create an exception obj and sending invalid input arg to the constructor.

//throwable=>Exception=>IOException=>FileNotFoundException(this is a checked exception)

//Exception is used by the programmer as well as the JVM when it encounters exceptional situation in the program.
//Exception and its subclasses (except RuntimeException) are called Checked Exceptions. 
//Checked exceptions need to be declared in a method or constructor's throws clause if they can be thrown by the 
//execution of the method or constructor and propagate outside the method or constructor boundary. 
//For example, java.io.IOException.  RuntimeException extends Exception, which is used to report exceptional 
//situations that cannot be predetermined at compile time. For example, IndexOutOfBoundsException or NullPointerException.
//RuntimeException and its subclasses are unchecked exceptions.
//Unchecked exceptions do not need to be declared in a method or constructor's throws clause.

//classcastexception, arrayoutofboundsexception and ilegalargument exceptions are unchecked and can be thrown at any time.



//finally is always executed (even if you throw an exception in try or catch) but this is the exception to the rule;
//When you call System.exit(...); The JVM exits so there is no way to execute the finally block.
//A try block must include either a catch or finally block.
//1. try{ } 
//catch(Exception e){  }          
// no finally  
//2. try{ } 
//finally{  }         
// no catch  
//3. try{ } 
//catch(Exception e){  } 
//finally{  } 
// 4. A catch can catch multiple exceptions: 
//try{ } 
//catch(Exception1|Exception2|Exception3 e){  } 
//When you use System.out.println(exception), a stack trace is not printed. Just the name of the exception class and the 
//message is printed. it is like this:exceptions.MyException: Exception from foo
//When you use exception.printStackTrace(), a complete chain of the names of the methods called, along 
//with the line numbers, is printed. It contains the names of the methods in the chain of method calls that led to the place 
//where the exception was created going back up to the point where the thread, in which the exception was created, was started.

//Java has a java.lang.SecurityException. 
//You can use Throwable as well as Exception as both of them are super classes of MyException. RuntimeException (and its subclasses 
//such as NullPointerException and ArrayIndexOutOfBoundsException) is not a checked exception. 
//So it cannot cover for MyException which is a checked exception
//exceptional conditions external to an application that a well written application should anticipate and from which it can recover.
//The main(String[] args) method is the last point in your program where any unhandled checked exception can bubble up to. After that the exception is
//thrown to the JVM and the JVM kills the thread.

//It will not throw NullPointerException because args[] is never null. If no argument is given (as in option a) 
//then the length of args is 0. args[] is never null. If no argument is given (as in option a) then the length of args is 0.
//Even if the program is executed without any arguments, the 'args' is NOT NULL. In such case it will be initialized to an array of Strings containing zero elements.


//RunTime Exceptions(Unchecked)
//SecurityException extends RuntimeException: 
//ClassCastException extends RuntimeException:
//NullPointerException extends RuntimeException
//IndexOutOfBoundsException extends RuntimeException
//
//



																		//Date-Time
//date time classes are immutable, changes must be refrred to them like date=date.plusDays(2);
//Date-Time API of Java 8 uses the calendar system defined in ISO-8601 as the default calendar.
//Most of the actual date related classes in the Date-Time API such as LocalDate, LocalTime, and LocalDateTime are immutable.
//These classes do not have any setters. Once created you cannot change their contents. Even their constructors are private.
//None of LocalDate, LocalDateTime, or LocalTime store zone information.
//java.time.ZonedDateTime does. ZonedDateTime is an immutable representation of a date-time with a time-zone. This class stores all date and time fields,
// to a precision of nanoseconds, and a time-zone, with a 
//zone offset used to handle ambiguous local date-times. For example, the value "2nd October 2007 at 13:45.30.123456789 +02:00 in the Europe/Paris time-zone"
// can be stored in a ZonedDateTime.
//These classes do not have any public constructors. 
//You need to use their static factory methods to get their instances. 
//For example:  java.time.LocalDate d1 = java.time.LocalDate.of(2015, Month.JANUARY, 31);  java.time.LocalDateTime d2 = java.time.LocalDateTime.of(2015, Month.JANUARY, 31, 10, 56);  
//java.time.LocalDateTime d3 = java.time.LocalDateTime.parse("2015-01-02T17:13:50"); //Note that this will throw a  java.time.format.DateTimeParseException
// if the input string lacks the time component i.e.T17:13:50 
// java.time.LocalDate d4 = java.time.LocalDate.parse("2015-01-02"); //Note that this will throw a  java.time.format.DateTimeParseException if the input string 
//contains the time component  
//java.time.LocalTime d5 = java.time.LocalTime.parse("02:13:59.985"); //Note that this will throw a  java.time.format.DateTimeParseException if the input string 
//contains the Date component 

//None of the new date related classes have public constructors. So using "new" to create their instances would be invalid.

//LocalDate d = new LocalDate(); // DOES NOT COMPILE
//LocalDate.of(2015, Month.JANUARY, 32) // throws DateTimeException
//System.out.println(LocalDate.now()); 2015-01-20
//System.out.println(LocalTime.now()); 12:45:18.401
//System.out.println(LocalDateTime.now()); 2015-01-20T12:45:18.401

//LocalDate date2 = LocalDate.of(2015, 1, 20);


//LocalDate birthday=LocalDate.of(1981, Month.APRIL, 01);
//LocalTime lunchTime1=LocalTime.of(3, 2, 4);
//System.out.println(LocalDate.now());
//System.out.println(LocalTime.now());
//System.out.println(LocalDateTime.now());

		//period

//Period is a day or more of time so we can use it for date and datetime but not for time.
//there is no chaining here we can use it with only LocalDate and LocalDateTime no LocalTime.
//if we chain it will take only the second one
//Period gor=Period.ofYears(2);
//LocalDate afterWhile=birthday.plus(gor);


//LocalDate today3=LocalDate.of(2018, 02, 11);
//DateTimeFormatter format=DateTimeFormatter.ISO_WEEK_DATE;
//System.out.println(format.format(today3));


//Here I give it my own format I receive a String here.
//LocalDate birthday1=LocalDate.of(1981, Month.APRIL, 01);
//LocalTime dsaat=LocalTime.of(13, 22);
//LocalDateTime bds=LocalDateTime.of(birthday1, dsaat);
//System.out.println(bds);
//DateTimeFormatter custom=DateTimeFormatter.ofPattern("yyyy//dd//MMMM//hh:mm");
//DateTimeFormatter custom2=DateTimeFormatter.ofPattern("dd  MM  1981");
//System.out.println(custom.format(bds));
//System.out.println(custom2.format(birthday));

//Here I will pass a String to get Local obj
//DateTimeFormatter StrToObj=DateTimeFormatter.ofPattern("yyyy,MM,dd");
//LocalDate today=LocalDate.parse("2018,02,11", StrToObj);
//LocalTime lunchtime=LocalTime.parse("13:00");//noe this is a LocalTime object.
//System.out.println(today);
//System.out.println(lunchtime);

//Most of the actual date related classes in the Date-Time API such as LocalDate, LocalTime, and LocalDateTime are immutable.
//LOCAL_DATE_TIME is not a valid formatter. ISO_LOCAL_DATE_TIME is valid though
//DATE_TIME is not a valid formatter ISO-DATE-TIME is.

																		//LAMBDA
//Lambda expression is an example of Functional Interface. A functional interface is an interface that contains one and only one abstract method
//if Moveable is an Interface; in which there is a move method takes int distance variable
//Moveable dyu=new Moveable() in fact  this would not be possible as interface and abstarct classes cannot be instantiated.
//I can do it with Lambda;
//functional interface=it has only one single abstract method
//it can have @FunctionallInterface annotation
//===============
//Moveable dyu=new Moveable(){
	//		@Override
	//		public void move(int distance){
	//		System.out.println("Moveable moving");
	//		}
	//		};
//===================

//Moveable dyu=(int distance) -> {System.out.println("Moveable moving");}

//here I could also use Moveable dyu=(distance) -> { without "int" 

	//	Moveable dyu=(distance) -> {System.out.println("Moveable moving");}

//here I could also take the paranthesis out too, and I could even take {} out too

	//	Moveable dyu=distance -> System.out.println("Moveable moving");
//after these my Lambda could be;
	
	//	Moveable dyu= distance -> System.out.println("Moveable moving");

//=====================================
//interface MathOperation {
//    int operation(int a, int b);======>

//MathOperation addition = (int a, int b) -> a + b; veya (No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.)
//MathOperation addition = (a, b) -> a + b; veya (No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.)
//MathOperation addition = (int a, int b) -> { return a + b; }; (No need to use curly braces in expression body if the body contains a single statement.)

//The compiler automatically returns the value if the body has a single expression to return the value. Curly braces are required to indicate that expression returns
//a value.
//whenever the method of a functional interface takes more than one parameter, you need to put the arguments within brackets.
//When your method body comprises only a single expression, you must omit the semi-colon. 


																		//PREDICATE
//Public static void main(String[] args) {
//	//Predicate, Consumer, Supplier, Function
//	//all comes from java util class to be imported.
//	List <Integer> lst=new ArrayList<>();
//	lst.add(3);
//	lst.add(33);
//	lst.add(13);
//	lst.add(4);
//	lst.add(2);
//	Predicate <Integer> numMoreThan10=num->num>20;
//	for(Integer num:lst)
//		if(numMoreThan10.test(num)) {
//			System.out.println(num);}


//java.util.function.Predicate is one of the several functional interfaces that have been added to Java 8. 
//This interface has exactly one abstract method named test, which takes any object as input and returns a boolean. 
//This comes in very handy when you have a collection of objects and you want to go through each object of that collection 
//and see if that object satisfies some criteria. For example, you may have a collection of Employee objects and, in one place of 
//your application, you want to remove all such employees whose age is below 50, while in other place, you want to remove all such
// employees whose salary is above 100,000. In both cases, you want to go through your collection of employees, and check each 
//Employee object to determine if it fits the criteria. This can be implemented by writing an interface named CheckEmployee and having 
//a method check(Employee ) which would return true if the passed object satisfies the criteria. The following code fragments 
//illustrate how it can be done -

//In a Lambda you cannot reuse the variable names that have already been used to define new variables in your argument list . 
//Here, observe that the variable d is already defined so your argument list cannot use d as a variable name.

//When all your method does is return the value of an expression, you can omit the curly braces, the return keyword,
// and the semi-colon from the method body part. //Thus, instead of { return x.value%2 == 0; }, you can just write x.value%2 == 0

//If you write return statement in your method body, you must enclose it within curly braces and include the semi-colon.
//If you write return, the compiler assumes that you are writing the complete method body and so it expects the curly braces as well as the semi-colon.

//To satisfy the Predicate interface, your lambda expression must return a boolean


																		//INSTANCE OF
//Left operand of instanceof MUST be an object and not a primitive.
//Right operand of instanceof MUST be a class name.

//if C1 extends B1. Therefore, anything that is a C1 is a B1. 
//It is like saying a Dog is a Pet or a Cat is a Pet, if Dog and Cat extend from Pet.

//For any non-null reference o1, the expression (o1 instanceof Object) will always yield true. 
//Because all objects in Java derive from Object class.

//D extends C, which extends B, which extends A. This means, D is-a C, C is-a B, and B is-a A. 
//Therefore, D is-a A. Hence, d instanceof A will return true.

//Since A implements both T1 and T2 (a instanceof T1) will return true and (a instanceof T2) will return true.

	
																		//SPECIAL CODES
																			//Pyramid
//	int a=1;
//	String stars="";
//		while(a<20) {
//		stars=stars+"*";in the first loop stars=*, in th escond added one more *==**
//		System.out.println(stars);
//		a++;}

																	//	Printing even numbers(Cift)
//	for(int i=0;i<30;i++) {
//		if(i%2!=0) {
//			continue;}
//	System.out.println(i);
	//	}
	
																	//	Printing odd numbers(Tek)
//	for(int i=0;i<30;i++) {
//		if(i%2!=1) {
//			continue;}
//	System.out.println(i);
	//	}
																//printing numbers with exceptions
//	for(int i=10; i>0; i--) {//here I continue without the numbers divided by 3
//		if (i%3==0) {
//	continue;
//		}
//		if (i%5==0) {//here I continue with the numbers divided by 5
//			continue;
//		}
//		if(i%2==0) {//here I continue with the numbers divided by 2
//			continue;
//		}
//	System.out.println(i);
//	}
															 //printing a string several times
//	String accumulator="";//you can take this out
//	for(int a=1; a<=entryn;a++) {
//		//System.out.print(entrys);//bring this back
//		accumulator+=entrys;//you can take this out
//	}
//System.out.println(accumulator); //here we craeted a String accumulator that increases everytime after it runs.
	
																	//Prime Numbers
//	boolean prime=true;
//	if( entry<=1) {
//		System.out.println("it is not prime");
//	}else if (entry%2==0&&entry!=2){
//		System.out.println("it is not prime too");
//	
//	}else {
//		for (int n=2;n<entry;n++) {
//			if (entry % n==0) {
//				prime=false;
//				System.out.println("ohh!!this is not prime too");
//				break;
//			}
//		}
//		if (prime) {
//			System.out.println("it is prime");
//		}
//	}
	
														//comparing two arrays with looping in each
//	for(String fru1:fruits1) {
//		boolean found=false;
//		for (String fru2:fruits2) {
//			if (fru1.equals(fru2)) {
//				found=true;
//				break;
//			}
//		}
//		if(found) 
//		{System.out.println(fru1+" is in the box");}
//		else
//		{System.out.println(fru1+" is not in the box");}
	
																		//times table
	
//	for( int number=1;number<=10;number++)	{
//		if(number!=3 &&number!=5 &&number!=7) {
//			continue;
//		}
//			for (int i=1;i<=10;) {
//			System.out.println(number+"*"+i+"="+(number*i));
//			i++;
//		}
																	//pyramid numbers
	//for(int outer=1; outer<=10;outer++) {
	//for(int inner=1;inner<=outer;inner++) {
	//System.out.print(inner);}
	//System.out.println();}
															//finding how many words in a sentence
//FIRST WAY
//	String sentence1="if you have a sentence. how can you find out how many words you have in it?";
//	int a=sentence1.length();
//	System.out.println(a);
//	sentence1=sentence1.replaceAll(" ","");
//	int b=sentence1.length();
//	System.out.println(b);
//	int c=(a-b)+1;
//	System.out.println("we have "+ c + " " + "words");
//SECOND WAY
//	String sentence2="if you have a sentence. how can you find out how many words you have in it?";
//	String[] arrWords=sentence2.split(" ");
//	System.out.println(arrWords.length);
//	for (String word:arrWords) {
//	System.out.print(word);

	
																		//cell(1,1), cell(1,2)
//	int row=5;
//	int col=4;
//	Stop:
//	for (int i=1; i<row;i++) {
//	if (i==4)
//		continue;
//				System.out.println("---at row number  "+i );
//				for(int j=1;j<=col; j++) {
//				if(j==3)
//					break;
//					System.out.print("Cell("+ i+","+j+"),");

																//reversing a String
//First Way SytringBuffer(str).reverse().toString();
//		String reversed=new StringBuffer(sent).reverse().toString();
//		System.out.println(reversed); 
//		if(sent.equals(reversed)) { 
//		System.out.println("It's a palindrome!"); } 
//		else { System.out.println("Not a palindrome");}
//Second Way Looping
//		String rvrs= "";//here we craete a blank string so we can use it to add chars into it.
//	 	for(int i=se.length()-1;i>=0;i--) {
//		rvrs=rvrs+se.charAt(i);



																			//POLINDROME
/*
* public static boolean isPalindrome(String str) {
if (str == null)
return false;
StringBuilder strBuilder = new StringBuilder(str);
strBuilder.reverse();
return strBuilder.toString().equals(str);
}
*/

																//HOW TO REVERSE A STRING IN 2 DIFF WAYS
/*
* StringBuilder stringBuilder = new StringBuilder();
String[] words = string.split(" ");
for (int j = words.length-1; j >= 0; j--) {
stringBuilder.append(words[j]).append(“ ”);
}
System.out.println("Reverse words: " + stringBuilder.toString().trim());
*/




																	//WRAPPER, STRING, AND COMPARISONS
	//String str="1234";//lets look if it is bigger than 0.
	//converting str to int
	//Integer nu=Integer.valueOf(str);//"1234" is now a an Integer to. value of converts the string to the wrapper integer
	//int nu1=Integer.parseInt(str);//it will convert a string to a primitive int.  
	//if
	//(nu>0)
	//{System.out.println("it is positive");}
	//else
	//{System.out.println("it is negative");}
	//String searchCount="123456";
	//int num3=Integer.parseInt(searchCount);//I used the same String to create a primitive int 
	//Integer num4=Integer.valueOf(searchCount);//I used the same string to create a wrapper class
	
	//System.out.println(num3.);//gives back nothing because it is int
	//System.out.println(num4.); gives formulas

/*





Long long ago , far far away , there was a town called Objectville. There was a Person called foo , 
foo is a Doctor , interestingly every doctor in Objectville is also a Motorcyclist Some know foo as 
just a Person like themselves who eat() , sleep() Others know him as Doctor as he is and know he can 
doOperation(); His Motorcycle group know him as a Motorcyclist who can ride(). So we can extract this 
from this passage : Doctor extends Person implements Motorcyclist { } At hospital Doctor foo = new Doctor(); 
foo can do everything a Person , Doctor and Motorcyclist can do if you call him doctor Outside Hospital 
Person pFoo = (Person) foo; or Person pFoo = foo; foo can only do general Person related if you refer him 
as Person In his motorcycle group Motorcyclist mFoo = (Motorcyclist) foo ; or Motorcyclist mFoo = foo; 
foo can only do Motorcyclist behavior if you refer him as Motorcyclist One day foo was heading home by bus 
with full of others (each of them sub class of Person and implicitly upcasted to Person) 
Person[] people = { new FireFighter(), new Teacher() ,foo, new Student().. } ; 
Suddenly someone faint and need an operation ASAP. In order to help the man the Person has to be Doctor , 
So bus driver tried to cast each of them to check whether one can help the man.
 First Person : Person person1 = people[0] ; Doctor d1 = (Doctor) person1; BOOM ClassCastException 
 at RUNTIME! cant cast a firefighter to a doctor Second Person : Person person2 = people[1] ; 
 Doctor d2 = (Doctor) person2 BOOM ClassCastException at RUNTIME! cant cast a teacher to a doctor 
 Third Person : Person person3 = people[2] ; Doctor d3 = (Doctor) person3 YAY! person3 is foo and he 
 is a Doctor , cast successful ! He can doOperation! foo did the operation and saved the day, even 
 he was just a Person , underlining identity is a Doctor. Now the man is saved ,he need to be at
  hospital for final checkup. Bus driver asked again is there any Motorcyclist , Having hit class 
  cast exception few times before finding foo , Bus driver decide to check each person with instanceof 
  keyword before casting them for safety. person1 instanceof Motorcyclist and he tried same thing for 
  everyone . It turned out foo is also a Motorcyclist along with few others who implemented Motorcyclist 
  interface. So he took the man to hospital as Motorcyclist Motorcyclist m = foo ; At hospital , 
  he was told only doctors are allowed in with him and he need to be downcasted
   Doctor docFoo = (Doctor) m ; Since underlying identity of foo is still Doctor , 
   he was successfully downcasted to Doctor. From the beginning till end there was only 
   one object foo has been pointing to, What a Polymorphic Day ! What did you learn from this

*/
//
//
//
//
//}
//}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
	
	
	
	
	

	
