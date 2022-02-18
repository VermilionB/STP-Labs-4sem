/**
 * @author Ilya Gorbach
 * @version 1.1
 * */


package by.belstu.it.Gorbach.basejava;

import java.nio.charset.StandardCharsets;

import static java.lang.Math.*;

public class JavaTest {

    /** Static field
     * @value 0
     * */
    static int sint;

    final int finalInt = 6;
    public final int publicFinalInt = 56;
    public static final int publicStaticFinalInt = 2;


    public static void Ex3b() {
        char charVar = 'b';
        int intVar = 5;
        short shortVar = 7;
        byte byteVar = 2;
        long longVar = 12;
        boolean booleanVarTrue = true;
        boolean booleanVarFalse = false;
        long longVar1 = 9223372036854775807L;
        long longVar2 = 0x7fff_ffff_fffL;
        char unicodeChar = '\u0061';
        char ASCIChar = 97;

        double doubleVar = 34.78;
        String stringVar = new String("string aboba");

        System.out.println("EXERCISE 3b\n//");
        System.out.println("String + int : " + (stringVar + intVar));
        System.out.println("String + char : " + (stringVar + charVar));
        System.out.println("String + double : " + (stringVar + doubleVar));
        System.out.println("byte = byte + int : " + (byteVar + intVar));
        System.out.println("int = double + long : " + (int) (doubleVar + longVar));
        System.out.println("int = double + long : " + ((long) intVar + 2147483647));
        System.out.println("static int sint : " + sint);
        System.out.println("boolean = booleanTrue && booleanFalse : " + (booleanVarTrue && booleanVarFalse));
        System.out.println("boolean = booleanFalse && booleanTrue : " + (booleanVarFalse ^ booleanVarTrue));
        //System.out.println("boolean = booleanFalse + booleanTrue : " + (booleanVarFalse + booleanVarTrue));
        System.out.println("Types for 9223372036854775807 and 0x7fff_ffff_fff : " + (longVar1) + ", " + (longVar2));
        System.out.println("in unicode 0061; 97 : " + (unicodeChar) + ", " + (ASCIChar));
        System.out.println("Result of 3.45 % 2.4: " + (3.45 % 2.4));
        System.out.println("Result of 1.0 % 0.0: " + (1.0 % 0.0));
        System.out.println("Result of log(-345): " + (Math.log(-345)));
        System.out.println("Result of Float.intBitsToFloat(0x7F800000): " + (Float.intBitsToFloat(0x7F800000)));
        System.out.println("Result of Float.intBitsToFloat(0xFF800000): " + (Float.intBitsToFloat(0xFF800000)));
    }

    public static void Ex3d() {
        System.out.println("--------------------------------------------");
        System.out.println("EXERCISE 3d\n//");
        System.out.println("Math.PI : " + (Math.PI));
        System.out.println("Math.E : " + (Math.E));
        System.out.println("Math.PI rounded : " + Math.round(Math.PI));
        System.out.println("Math.E rounded : " + Math.round(Math.E));
        System.out.println("Min [Math.E, Math.PI] : " + (Math.min(E, PI)));
        System.out.println("Random number from [0,1] : " + (Math.random()));
    }

    public static void Ex3e() {
        short shortVar = 7;
        byte byteVar = 2;
        long longVar = 12;
        double doubleVar = 45.38;
        Boolean objBoolean = true;
        Character objCharacter = 'a';
        Integer objInteger = 10;
        Byte objByte = byteVar;
        Short objShort = shortVar;
        Long objLong = longVar;
        Double objDouble = doubleVar;

        System.out.println("--------------------------------------------");
        System.out.println("EXERCISE 3e\n//");
        System.out.println("10 >>> 2 : " + (objInteger >>> 2));
        System.out.println("~2 : " + (~byteVar));
        System.out.println("a + 7 : " + (objCharacter + objShort));
        System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);

        int unboxedInt = objInteger;
        int unboxedByte = objByte;

        System.out.println("Integer.toHexString(v_int): " + Integer.toHexString(objInteger));
        System.out.println("Integer.highestOneBit(33): " + Integer.highestOneBit(33));
        System.out.println("Integer.parseInt(\"54\"): " + Integer.parseInt("54"));
        System.out.println("Integer.parseInt(\"110101\",2): " + Integer.parseInt("110101", 2));
    }

    public static void Ex3f() {
        System.out.println("--------------------------------------------");
        System.out.println("EXERCISE 3f\n//");
        String s34 = "2345";
        int parseStrInt = Integer.parseInt(s34);
        int valueOfStrInt = Integer.valueOf(s34);
        int constructorOfStrInt = new Integer(s34);
        System.out.println("Convert s34 to int w/ constructor : " + constructorOfStrInt);
        System.out.println("Convert s34 to int w/ parseInt : " + parseStrInt);
        System.out.println("Convert s34 to int w/ valueOf : " + valueOfStrInt);

        byte[] strToByteArr = s34.getBytes();
        System.out.print("Transformation s34 into set of bytes: ");
        for (byte i : strToByteArr) {
            System.out.print(i);
        }
        String byteArrToStr = new String(strToByteArr);
        System.out.println("\nReturn s34 into string: " + byteArrToStr);

        System.out.println("(1 way) Convert string to boolean: " + Boolean.valueOf(s34));
        System.out.println("(2 way) Convert string to boolean: " + Boolean.parseBoolean(s34));
        String str1, str2;
        {
            str1 = "Hello World";
            str2 = "Hello World";
        }

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        str2 = null;
        System.out.println("Now str2 value's is null.");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        //System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // Performs a char value comparison
        //Exception because of null exception

        String commonStr = "Lorem ipsum da lehare";
        String[] strArr = commonStr.split("");
        for (var i : strArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("commonStr.contains(\"re\") : " + commonStr.contains("re"));
        System.out.println("commonStr.hashCode() : " + commonStr.hashCode());
        System.out.println("commonStr.indexOf(\"e\") : " + commonStr.indexOf("e"));
        System.out.println("commonStr.length() : " + commonStr.length());
        System.out.println("commonStr.replace(\"e\", \"O\") : " + commonStr.replace("e", "O"));

    }

    public static void Ex3g() {
        System.out.println("--------------------------------------------");
        System.out.println("EXERCISE 3f\n//");
        char[][] c1;
        char[] c2[];
        char c3[][];

        boolean[] emptyArr = new boolean[0];
        //System.out.println(emptyArr[1]);

        c1 = new char[3][];
        c1[0] = new char[0];
        c1[1] = new char[1];
        c1[2] = new char[2];
        System.out.println("Array length: " + c1.length);
        System.out.println("Line length c1[0]: " + c1[0].length);
        System.out.println("Line length c1[1]: " + c1[1].length);
        System.out.println("Line length c1[2]: " + c1[2].length);

        c2 = new char[][]{{'a','b','c'},{'z','x','c'},{'1','2','3'}};
        c3 = new char[][]{{'q','w','e'},{'r','t','y'},{'4','5','6'}};
        char c4[][] = new char[][]{{'a','b','c'},{'z','x','c'},{'1','2','3'}};

        boolean comRez = c2 == c4;
        System.out.println("comRez: " + comRez);
        //not reffers to one area in memory

        c2 = c3;
        System.out.println("c2 == c3: " + (c2 == c3));
        for (char[] i : c4) {
            for (char j : i) {
                System.out.print(j);
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Ex3b();
        Ex3d();
        Ex3e();
        Ex3f();
        Ex3g();

        String strForParm = "Vermilion";
        var wrapperString = new WrapperString(strForParm) {
            @Override
            public void replace(char oldChar, char newChar) {
                System.out.printf("[override] Replace a character '%c' with '%c'\n", oldChar, newChar);
                setString1(getString1().replaceAll(String.valueOf(oldChar), String.valueOf(newChar)));
            }

            public void delete(char newChar) {
                System.out.println("Deleting " + newChar);
                setString1(getString1().replace(newChar, ' '));
            }
        };
        wrapperString.replace('i', 'O');
        System.out.println(wrapperString.getString1());
        wrapperString.delete('r');
        System.out.println(wrapperString.getString1());
    }
}
