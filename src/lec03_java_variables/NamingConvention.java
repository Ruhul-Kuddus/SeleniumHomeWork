package lec03_java_variables;

// Projects names are generally starts with UpperCase
// Camel case example for a project --> January2022CoreJava
// Alternative example of Camel case, for a project --> January_2022_core_java 

// Package names are generally starts with lowerCase
// Camel case example for a package --> lec01JavaBasics
//Alternative example of Camel case, for a package --> lec01_java_basics

// Class names starts with UpperCase 
// Class names are usually nouns or noun phrases.
// Camel case example for a class --> NamingConvention
// Alternative example of Camel case, for a class --> Naming_convention

public class NamingConvention {
	// non-constant field/variable names starts with lowerCase
	// variable names must be specific and meaningful
	// no duplication is accepted inside the same class
	public int houseNumber = 625; // variable initialized
	public int avenueNumber; // variable declared

	// constant names are written with all upper case letters with words separated by underscores
	// We will use it in automation framework
	public String WEDDING_REGISTRY_PAGE_TITLE = "Amazon Wedding";
	public int LONG_WAIT = 10;

	// names like "string1, myarray1, no_1" are not acceptable as variable names
	// because they are are not specific and can cause confusion like the variable below:
	public String string = "String";
		
	public static void main(String[] args) {
		System.out.println("This is about Naming convention");
		

	}

}
