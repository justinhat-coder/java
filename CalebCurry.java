package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(x);
    }
}

package com.company;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String x = scanner.nextLine();
       // System.out.println(x);
       // int y = scanner.nextInt();
        //System.out.println(y);
       // int a = y +10;
       // System.out.println(a);
       // BigDecimal money = scanner.nextBigDecimal();
        //boolean x = scanner.nextBoolean();
        //System.out.println(x);
        //int x = scanner.nextInt(8);
        double x = (int)scanner.nextDouble();
        System.out.println(x);

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        String x = "my oh my chicken pot pie";
        System.out.println(x.charAt(x.length() - 1));
        System.out.println(x.concat("Now with 20% more chicken"));
        String fullAd = x + "Now with 20% more chicken";
        System.out.println(fullAd.contains("chicken"));
        System.out.println(fullAd.indexOf("my", 3));
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch(name)
        {
            case "Justin":
                System.out.println("Welcome my man");
                break;
            case "Bob":
                System.out.println("Go away");
                break;
            default:
                System.out.println("try again later");
                break;
        }
    }
}

package com.company;

import java.util.Scanner;

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String password = "Let me in";
        System.out.println("Guess the password: ");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        System.out.println(password.equals(guess));
        System.out.println(password == guess);
        String a = "hi";
        String b = "hi";
        System.out.println(a == b);
    }
}


package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Justin";
        user.lastName = "Dao";
        System.out.println(user.getFullName());
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String password = "Let me in";
        System.out.println("Guess the password: ");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        System.out.println(password.equals(guess));
        System.out.println(password == guess);
        if (password.equals(guess)) {
            System.out.println("Your guess was correct!");
        } else if ("dont stop believing".equals(guess)) {
            System.out.println("You got the second password");
        }
        else {
            System.out.println("This is false");
        }
    }
}


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How old are you?");

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Cats or Dogs");
        String animal = scanner.nextLine();

        if(age > 12 && animal.equals("dogs16"))
        {
            System.out.println("Welcome!");
        }
    }
}

package com.company;

public class Main {
    boolean additionalLogging = true;
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--){
            System.out.println(i);

            if (i == 5){
                if (additionalLogging == true){
                    System.out.println("We found 5");
                }
            }
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            for (int k = i; k >= 0; k--){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
    }
}

6/8/20

package com.company;

public class Main {

    public static void main(String[] args) {
        int[] grades = new int[10];
        grades[0] = 10;
        System.out.println(grades[0]);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int[] grades = [10, 3,4,5,6,7,8,8];
        System.out.println(grades[0]);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        int[] grades = [10, 3,4,5,6,7,8,8];
        grades[1] = 900;
        System.out.println(grades[0]);
    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] grades ={9, 9, 7, 4, 3, 1, 2, 5, 3};
        System.out.println(Arrays.toString(grades));
        
        for(int i = 0; i < 10; i++){
            grades[i] = 5;
        }
        System.out.println(Arrays.toString(grades));
    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] grades ={9, 9, 7, 4, 3, 1, 2, 5, 3};
        System.out.println(Arrays.toString(grades));
        
        for(int i = 0; i < 10; i++){
            grades[i] = 5;
        }
        System.out.println(Arrays.toString(grades));
    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 72};

        for(int i = 0; i < grades.length; i++){
            if(grades[i] == 72){
                System.out.println("FOUND");
            }
        }
        System.out.println(Arrays.toString(grades));
    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 72};
        Arrays.sort(grades);
        Arrays.parallelSort(grades);
        System.out.println(Arrays.toString(grades));
    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] grades1 = {1, 2, 3, 72};
        int[] grades2 = {1, 2, 3, 72};

        if(grades1 == grades2){
            System.out.println("equal");
        }
        if(grades1.equals(grades2)){
            System.out.println("equal");
        }
    }
}


package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] grades ={
                {1, 5, 3},
                {8, 4, 2},
                {4, 6, 2}
        };
        System.out.println(grades[1][1]);
    }
}


6/9/20

package com.company;

    public class Main {

        public static void main(String[] args) {
            int [][] grades ={
                    {1, 5, 3},
                    {8, 4, 2},
                    {4, 6, 2}
            };
            System.out.println(grades.length);
            System.out.println(grades[1].length);
            for(int i = 0; i < grades.length; i++){
                for (int k = 0; k < grades[i].length; k++){
                    System.out.println(grades[i][k]);
                }
        }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
         List<Integer> grades = new ArrayList<Integer>();
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
         List<Integer> grades = new ArrayList<Integer>();
         grades.add(4);
         grades.add(10);
         grades.add(1, 7);
         
         grades.isEmpty();
         System.out.println(grades.contains(7));
         System.out.println(grades.indexOf(7));
         System.out.println(grades.get(0));
         System.out.println(grades.get(1));
         System.out.println(grades.get(2));
         
         if(grades.contain(7) == true){
             System.out.println("true");
         }
    }
}

package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<Integer> allGrades = Arrays.asList(5, 3, 2, 6, 3);
            int[] grades = new int [allGrades.size()];

            for(int i = 0; i < allGrades.size(); i++);
            {
                grades[i] = allGrades.get(i);
            }
            System.out.println(Arrays.toString(grades));
    }
}

package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

        public static void main(String[] args) {
            List<Integer> allGrades = Arrays.asList(5, 3, 2, 6, 3);
            Collections.sort(allGrades);
            Collections.reverse(allGrades);

            for(int grade : allGrades) {
                System.out.println(allGrades);
            }
    }
}

package com.company;

public class Main {

        public static void main(String[] args) {
           User user = new User();
           user.firstName = "sub";
           user.lastName = "scriber";
            System.out.println(user.firstName);
    }
}

package com.company;

public class Main {

        public static void main(String[] args) {
           User user = new User();
           user.firstName = "sub";
           user.lastName = "scriber";
           user.output(6);
    }
}
package com.company;

public class User {
    public String firstName;
    public String lastName;

    public void output(int times){

        for (int i = 0; i < times; i++){
            System.out.println(firstName + " " + lastName);
        }
    }
}

package com.company;

public class User {
    private String firstName;
    public String lastName;

    public void output(int times){

        for (int i = 0; i < times; i++){
            System.out.println(firstName + " " + lastName);
        }
    }
    public String FirstName(){
        return firstName.toUpperCase();
    }
    public void setFirstName(String fn){
        firstName = fn;
    }
}package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Sub");
        user.lastName = "scriber";
        user.output(6);
    }
}

package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User me = new User();
        me.setFirstName("Justin");
        me.setLastName("Dao");

        User you = new User();
        you.setFirstName("New");
        you.setLastName("Friend");

        List<User> users = new ArrayList<User>();
        users.add(you);
        users.add(me);

        System.out.println(users.get(1).getFullName());
    }
}

package com.company;

public class User {
    private String firstName;
    private String lastName;


    public String output(){
        return"Hi, my name is " + firstName + " " + lastName  + ".";
    }

    public void output(int times){

        for (int i = 0; i < times; i++){
            System.out.println(firstName + " " + lastName);
        }
    }
    public String FirstName(){
        return firstName.toUpperCase();
    }
    public void setFirstName(String fn){
        firstName = fn;
    }
    public String LastName(){
        return firstName.toUpperCase();
    }
    public void setLastName(String fn){
        firstName = fn;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
}



//Comment
// == equality
// != inequality
// ><
//<= >=
// && both are true
// or either are true
// * multiply
// / divide
// + add/
// - subtract
// % modulus
//byte, char ,short, long, int, float, double
//primitive types
//objects - instance of a class ( class is the data type )
//statically typed = variables are given data types up front
//dynamically typed = variables do not have types
//Data type - the type of a the data. how the computer interprets the data
//Variable - stores some value
//expressions - evaluates to a value
//operator - work on operands to produce a value
//operand - the thing operator works on
//class - contains everything - has members
//methods - do something
//statement - telling the computer something
//properties - store something
//access modifier (Public) - Who can use?
//Static - no instance of class is needed
//Explicit: casting operation required; the magnitude of the numeric value may not be preserved
//Implicit: casting operation is not required; the magnitude of the numeric value is always preserved. However, precision may be lost when converting from integer to floating point types
//A primitive type should be set by an appropriate value. The primitive types can be initialized with a literal. Most of the literals are primitive type values, except String Literals, which are instance of the String class.