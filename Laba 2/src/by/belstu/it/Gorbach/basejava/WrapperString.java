package by.belstu.it.Gorbach.basejava;

import java.util.Objects;

public class WrapperString {
    @Override
    public String toString() {
        return "WrapperString{" +
                "string1='" + string1 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(string1, that.string1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string1);
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString1() {
        return string1;
    }

    public WrapperString(String string1) {
        this.string1 = string1;
    }

    /**
     * function replace oldChar with newChar
     * @param oldChar, newChar
     * */

    public void replace(char oldChar, char newChar){
        System.out.printf("[original] Replace a character '%c' with '%c'\n", oldChar, newChar);
        string1 = string1.replaceAll(String.valueOf(oldChar),String.valueOf(newChar));
    }

    private String string1;
}
