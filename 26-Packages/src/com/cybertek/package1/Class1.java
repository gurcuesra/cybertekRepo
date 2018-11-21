package com.cybertek.package1;

// 1-
//import com.cybertek.package2.*;

// 2-
//import com.cybertek.package2.Class2;
//import com.cybertek.package2.Class3;

//import com.cybertek.package2.*;
//import com.cybertek.package3.className; //-> you cannot use * again. You have to mention about className.

import com.cybertek.package2.*;

public class Class1 {

	public static void main(String[] args) {
		
		// There are 3 ways to access package from outside the package:
		// 1- import packageName.*;
		// 2- import packageName.className;   // -> second way is not efficient
		// 3- fully qualified name            // -> third way is so long
		
		
		// 3- 
		Class2 cl = new Class2();
		com.cybertek.package2.Class3 cl1 = new com.cybertek.package2.Class3();

	}

}
