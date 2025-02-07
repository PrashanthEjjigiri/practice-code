package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       removeDuplicatesFromStringAndPrintSameOrder();
       findTheWordThatHasHighestLength();
       NthHighestLengthFromString();
       NthHighestLengthIndexFromString();
       findTheOccurenceOfEachString();
       findWordsWithSpecifiedNumOfVowels();
       devideOddsandEvensFromIntArray();
       findOccurenceOfEachChar();
       printReverseAndPropersortofIntArray();
       findSumOfUniqueElements();
       findFirstNonRepeatedCharFromString();
       findFirstRepeatedCharFromString();
       removeOneLetterfromString();
       groupNumbersByRange();//0,1,2,14,16,20,23,25  -> 012 14,16  202326
       printTheListThatContainsOnlyIntegers();
       productOfFirstTwoElementsInArray();
       groupOrPairAnagramsFromListString();
       multiplyAlternativeNumbersInAnArray();
       multipy1stAndLastAND2ndAnd2ndLastInArray();
       moveAllZerostoBeginning();
       checkAnArrayContainsAllDistnictValues();
       groupTheStringsBasedOnMiddleCharecter();
       findTheSumOfAllTheElements();
       sortListOfString();
       convertListOfIntsIntoItsSquares();
       printDistinctOddNumbers();
       unionOfTwoIntLists();
       kthSmallestElementInList();
       removeAllNonNumericCharsFromList();
       convertStringToUpperCase();
       calculateTheAvgOfAllNumbersInList();
       intersectionOfTwoLists();
       fibonacciSeries();
       printStringGroupByFirstElement();
       multiplyArrayofInts();
       convertSringToUppercaseAndConcatToOneString();
       conacatnateTwoStrings();
       printStringsStartsWithA();
       
       procductCalculations();
       
       employeeCalculatons();
       printDistnictNuminDescOrderStartsWithOne();
       printTheCountOfParticularSubString();
       printTheMiddleCharOfString();
       
   
	}

	private static void printTheMiddleCharOfString() {
		// TODO Auto-generated method stub
		String s="abcfde"; // cf
		//String s="abcde";//c
		int len=s.length();
		int mid=len/2;
		
		StringBuilder collect = IntStream.range(0, len).filter(x->x%2==0 ? (x==mid || x==mid-1) : x==mid).mapToObj(s::charAt).collect(StringBuilder :: new, StringBuilder:: append, StringBuilder:: append);
		System.out.println(collect);
		
	}

	private static void printTheCountOfParticularSubString() {
		// TODO Auto-generated method stub
		
		String s="abcdefabcabcabc";
		String check="abc";
		
		long count = IntStream.range(0, s.length()-2).filter(x->s.substring(x,x+3).equals(check)).count();
		System.out.println(count);
	}

	private static void printDistnictNuminDescOrderStartsWithOne() {
		// TODO Auto-generated method stub
		List<Integer> asList = Arrays.asList(12,12,15,4,11,13);
		List<Integer> collect = asList.stream().distinct().filter(x->String.valueOf(x).startsWith("1")).sorted((a,b)->b-a).collect(Collectors.toList());
	System.out.println(collect);
	}

	private static void employeeCalculatons() {
		// TODO Auto-generated method stub
		Employee emp=new Employee(1, "prashanth", "ejjigiri", "ep@gmail.com", "Hyd", 30, "Male", 20000l);
		Employee emp1=new Employee(2, "rama", "ejjigiri", "re@yahoo.com", "ban", 26, "FeMale", 20000l);
		Employee emp2=new Employee(3, "raju", "inda", "ri@orkut.com", "Hyd", 35, "Male", 15000l);
		Employee emp3=new Employee(4, "praveen", "dam", "pd@yahoo.com", "ban", 27, "Male", 20000l);
		Employee emp4=new Employee(5, "prashanth", "komp", "ep@gmail.com", "Del", 30, "Male", 10000l);
		List<Employee> asList = Arrays.asList(emp,emp1,emp2,emp3,emp4);
		Map<String, Long> collect = asList.stream().map(e->e.getEmail().substring(e.getEmail().indexOf("@"))).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		/*
		 * Collector<Employee, StringJoiner, String> resp=Collector.of( ()->new
		 * StringJoiner(" | "), (j,p)-> j.add(p.getname()) );
		 */
		Map<String, List<Employee>> collect2 = asList.stream().collect(Collectors.groupingBy(x->x.getCity(),Collectors.toList()));
	System.out.println(collect2);
	
	List<String> collect3 = asList.stream().filter(x->x.getAge()>=30).map(x->x.getFirstName()).distinct().sorted().collect(Collectors.toList());
	System.out.println(collect3);
	System.out.println(asList.stream().filter(x->x.getSalary()>=20000l).peek(x->x.setSalary(x.getSalary()+1000l)).collect(Collectors.toList()));
	List<Employee> collect4 = asList.stream().sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastname)).collect(Collectors.toList());
	System.out.println(collect4);
	
	
	Map<String, Double> collect5 = asList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
	System.out.println(collect5);
	}

	private static void procductCalculations() {
		// TODO Auto-generated method stub
	    Product product1 = new Product(1, "santhoor", 26, "Soap");
	       Product product2 = new Product(2, "Charger", 120, "Electronics");
	       Product product3 = new Product(3, "Dolo-650", 80, "Medicine");	
	       Product product4 = new Product(4, "Pulsar", 90, "Vehicle");
	       Product product5 = new Product(5, "Sudha", 200, "Book");	
	       List<Product> asList = Arrays.asList(product1,product2,product3,product4,product5);
	       //print the names of product whose price is below 100
	       List<String> collect = asList.stream().filter(x->x.getPrice()<100).map(x->x.getName()).collect(Collectors.toList());
		System.out.println(collect);
		List<Object> collect2 = asList.stream().map(x->{
			double d=x.getPrice()*0.80;
			x.setPrice(d);
			return x;
		}
		).collect(Collectors.toList());
		
		
		System.out.println(collect2);
		System.out.println(asList.stream().mapToDouble(Product::getPrice).average());
		System.out.println(asList.stream().min((x1,x2)->Double.compare(x1.getPrice(), x2.getPrice())).get().getPrice());
	}

	private static void printStringsStartsWithA() {
		// TODO Auto-generated method stub
		List<String> asList = Arrays.asList("abc","def","ghi");
		List<String> collect = asList.stream().filter(x->x.startsWith("a")).collect(Collectors.toList());
		System.out.println(collect);
		long count = asList.stream().filter(x->x.startsWith("a")).count();
		System.out.println(count);
	}

	private static void conacatnateTwoStrings() {
		// TODO Auto-generated method stub
		List<String> asList = Arrays.asList("abc","def","ghi");
		List<String> asList1 = Arrays.asList("abc","def","ghi");
		Stream.concat(asList.stream(), asList1.stream()).forEach(System.out::println);
	}

	private static void convertSringToUppercaseAndConcatToOneString() {
		// TODO Auto-generated method stub
		List<String> asList = Arrays.asList("abc","def","ghi");
		String string = asList.stream().map(x->x.toUpperCase()).reduce((a,b)->a+ ""+b).get();
		System.out.println(string);
	}

	private static void multiplyArrayofInts() {
		// TODO Auto-generated method stub
		List<Integer> asList = Arrays.asList(6,2,5,4,1,3);
		Integer integer = asList.stream().reduce((a,b)->a*b).get();
		System.out.println(integer);
	}

	private static void printStringGroupByFirstElement() {
		// TODO Auto-generated method stub
		List<String> asList = Arrays.asList("abc","def","ghi","abc","def","ghi");
		Map<Character, List<String>> collect = asList.stream().collect(Collectors.groupingBy(x->x.charAt(0),Collectors.toList()));
	System.out.println(collect);
	}

	private static void fibonacciSeries() {
		// TODO Auto-generated method stub
		
		List<Integer> collect = Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void intersectionOfTwoLists() {
		// TODO Auto-generated method stub
		List<Integer> asList = Arrays.asList(6,2,5,4,1,3);
		List<Integer> asList1 = Arrays.asList(4,1,3);
		
		List<Integer> collect = asList.stream().filter(asList1::contains).collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void calculateTheAvgOfAllNumbersInList() {
		// TODO Auto-generated method stub
		List<Integer> asList = Arrays.asList(6,2,5,4,1,3);
		double asDouble = asList.stream().mapToDouble(Integer :: doubleValue).average().getAsDouble();
	System.out.println(asDouble);
	}

	private static void convertStringToUpperCase() {
		// TODO Auto-generated method stub
		List<String> asList = Arrays.asList("abc","def","ghi");
		List<String> collect = asList.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void removeAllNonNumericCharsFromList() {
		// TODO Auto-generated method stub
		List<String> asList = Arrays.asList("a12df","5rt5t","jf87g");
		Pattern pattern=Pattern.compile("[^0-9]");
		List<String> collect = asList.stream().map(x->pattern.matcher(x).replaceAll("")).collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void kthSmallestElementInList() {
		// TODO Auto-generated method stub
		List<Integer> asList = Arrays.asList(6,2,5,4,1,3);
		int k=3;
		Integer integer = asList.stream().sorted().skip(k-1).findFirst().get();
		System.out.println(integer);
	}

	private static void unionOfTwoIntLists() {
		// TODO Auto-generated method stub
		  int[] arr= {1,2,3,4,5,6};
		  int[] arr1= {7,8,9,9,10};
		  List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		  List<Integer> collect1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		  List<Integer> collect2 = Stream.concat(collect.stream(), collect1.stream()).collect(Collectors.toList());
		  System.out.println(collect2);
		  
	}

	private static void printDistinctOddNumbers() {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,9,10};
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> collect2 = collect.stream().filter(x->x%2 != 0).distinct().collect(Collectors.toList());
	System.out.println(collect2);
	}

	private static void convertListOfIntsIntoItsSquares() {
		// TODO Auto-generated method stub
		int[] arr= {1,2,0,3,4};
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(collect.stream().map(x->x*x).collect(Collectors.toList()));
	}

	private static void sortListOfString() {
		// TODO Auto-generated method stub
		String[] s={"zzz","Hello", "World","java","print"};
		List<String> collect = Arrays.stream(s).map(x->x.toLowerCase()).sorted().collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void findTheSumOfAllTheElements() {
		// TODO Auto-generated method stub
		int[] arr= {1,2,0,3,4};
		
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		int sum = collect.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

	private static void groupTheStringsBasedOnMiddleCharecter() {
		// TODO Auto-generated method stub
		String[] s= {"nap","pan","pst","tsp"};
		
		Map<String, List<String>> collect = Arrays.stream(s).collect(Collectors.groupingBy(x->x.substring(1,2)));
	System.out.println(collect);
	}

	private static void checkAnArrayContainsAllDistnictValues() {
		// TODO Auto-generated method stub
		//int[] arr= {1,2,0,3,4,0,10,0,5};
		int[] arr= {1,2,0,3,4};
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Integer, Long> collect2 = collect.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		Collection<Long> values = collect2.values();
		boolean noneMatch = values.stream().noneMatch(x->x>1);
		
		System.out.println(noneMatch);
		
	}

	private static void moveAllZerostoBeginning() {
		// TODO Auto-generated method stub
		int[] arr= {1,2,0,3,4,0,10,0,5};
		
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List<Integer> zeros = collect.stream().filter(x->x==0).collect(Collectors.toList());
		List<Integer> nonzeros = collect.stream().filter(x->x!=0).collect(Collectors.toList());
		
		List<Integer> finalList=new ArrayList<>();
		finalList.addAll(zeros);
		finalList.addAll(nonzeros);
		
		System.out.println(finalList);
		
	}

	private static void multipy1stAndLastAND2ndAnd2ndLastInArray() {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,10,5};
		IntStream.range(0, arr.length/2).map(x->arr[x]*arr[arr.length-x-1]).forEach(x->System.out.println(x));
	}

	private static void multiplyAlternativeNumbersInAnArray() {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,10};
		
		int reduce = IntStream.range(0, arr.length).filter(x->x%2==0).map(x->arr[x]).reduce(1,(a,b)->a*b);
		System.out.println(reduce);
	}

	private static void groupOrPairAnagramsFromListString() {
		// TODO Auto-generated method stub
		String[] s= {"nap","pan","pat","tap"};
		List<String> asList = Arrays.asList(s);
		
		Collection<List<String>> values = asList.stream().collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList()))).values();
	
	System.out.println(values);
	}

	private static void productOfFirstTwoElementsInArray() {
		// TODO Auto-generated method stub
		int[] arr= {21,2,3,4,10,14,16,20,22,25,26};
		Integer reduce = Arrays.stream(arr).boxed().limit(2).reduce(1,(a,b)->a*b);
		System.out.println(reduce);
	}

	private static void printTheListThatContainsOnlyIntegers() {
		// TODO Auto-generated method stub
		String[] s= {"123","abc","abc12","234","def"};
		
		List<String> collect = Arrays.stream(s).filter(x->x.matches("[0-9]+")).collect(Collectors.toList());
		System.out.println(collect);
	}

	private static void groupNumbersByRange() {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,10,14,16,20,22,25,26};
		//List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		Map<Integer, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x->x/10*10,LinkedHashMap::new,Collectors.toList()));
	System.out.println(collect);
	}

	private static void removeOneLetterfromString() {
		String  s="prashanth";

		String updated=s.chars().mapToObj(c->(char) c).map(String::valueOf).filter(c -> !c.equals("n")).reduce("",(a,b)->a+b);
		System.out.println(updated);
	}

	private static void findFirstRepeatedCharFromString() {
		String s="Hello World";
		
		Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		Character character = collect.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).findFirst().get();
		System.out.println(character);
		
		
	}

	private static void findFirstNonRepeatedCharFromString() {
		String s="Hello World";
		
		String string = Arrays.stream(s.split("")).filter(x->s.indexOf(x)==s.lastIndexOf(x)).findFirst().get();
		System.out.println(string);
		
		char map = s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).findFirst().get();
		System.out.println(map);
	}

	private static void findSumOfUniqueElements() {
		int[] arr= {1,2,3,4,5,4,5,8,9};
		
		int sum = Arrays.stream(arr).distinct().sum();
		System.out.println(sum);
	}

	private static void printReverseAndPropersortofIntArray() {
		int[] arr= {172,2,3,4,5};
		Arrays.stream(arr).mapToObj(x->x).sorted().forEach(System.out::println);
		Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::println);
		
	}

	private static void findOccurenceOfEachChar() {
		String s="dev prashaaa";
		
		Map<Character, Long> collect = s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}

	private static void devideOddsandEvensFromIntArray() {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List<List<Integer>> collect2 = collect.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList())).entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<List<Integer>> collect3 = collect.stream().collect(Collectors.partitioningBy(x->x%2==0,Collectors.toList())).entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
		System.out.println(collect3);
		
	}

	private static void findWordsWithSpecifiedNumOfVowels() {
		// TODO Auto-generated method stub
		String s="prashnth isa a javea deva prshanthi is a java devu";
		
		Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]", "").length()==2).forEach(System.out::println);
	}

	private static void findTheOccurenceOfEachString() {
		// TODO Auto-generated method stub
		String s="prashanth is a java dev prashanth is a java dev";
		Map<String, Long> collect = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}

	private static void NthHighestLengthIndexFromString() {
		// TODO Auto-generated method stub
		String s="prashanth is a java dev";
		Integer integer = Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(0).findFirst().get();
		System.out.println(integer);
	}

	private static void NthHighestLengthFromString() {
		String s="prashanth is a java dev";
		
		String string = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(string);
	}

	private static void findTheWordThatHasHighestLength() {
		String s="prashanth is a java dev";
		
		String string = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
		System.out.println(string);
		
	}

	private static void removeDuplicatesFromStringAndPrintSameOrder() {
		
		String s="aabcddeefghhiij";
		
		//s.chars().distinct().mapToObj(c->(char)c).forEach(System.out::print);
		
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
		System.out.println();
	}

}
