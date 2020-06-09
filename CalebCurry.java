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

hour 3:57





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