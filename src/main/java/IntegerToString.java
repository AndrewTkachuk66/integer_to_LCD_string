import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerToString {
    static String[][] stringsNumbers = {{" _ ", "| |", "|_|"}, {"   ", "  |", "  |"}, {" _ ", " _|", "|_ "}, {" _ "," _|"," _|"},{"   ","|_|","  |"}, {" _ ","|_ "," _|"},{" _ ","|_ ","|_|"},{" _ ","  |","  |"},{" _ ","|_|","|_|"},{" _ ","|_|","  |"},{}};
    String line = "0123456789565656568741";
    int numberOfFlores = 3;
    static char[] arrayChar = new char[100];
    StringBuilder stringBuilder = new StringBuilder("");

   public void parse() {
        arrayChar = line.toCharArray();
    }

   public void print(char[] arrayChar) {
        for (int i = 0; i < numberOfFlores; i++) {
            for (int n = 0; n < arrayChar.length; n++) {
                char number = arrayChar[n];
                int num = Character.getNumericValue(number);
                stringBuilder.append(stringsNumbers[num][i]).append(" ");
            }
            System.out.print(stringBuilder);
            System.out.println();
            stringBuilder.setLength(0);
        }
    }

    public static void main(String[] args) {
        IntegerToString integerToString = new IntegerToString();
        integerToString.parse();
        integerToString.print(arrayChar);
    }
}

