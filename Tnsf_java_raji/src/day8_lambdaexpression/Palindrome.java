//Program to define generic functional interface Palindrome

package day8_lambdaexpression;

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
// if the class is having only one abstract methods then it is functional interface even when there is no add