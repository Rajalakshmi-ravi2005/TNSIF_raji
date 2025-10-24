//Define Functional Interface MyCube
package day8_lambdaexpression;

@FunctionalInterface
public interface MyCube {
	int getCube(int no);
	//void show(); not allow more than one abstract method
}
