package chap22_lambda.basiclambda;

public class MulAndDiv {
	
	public void singleMul(int num1, SingleMul singleMul) {
		singleMul.singleMultiply(num1);
		}
	
	public void mul(int a, int b, Mul mul) {
		mul.multiply(a, b);
		}
	
	public void div(int a, int b, Div div) {
		div.div(a, b);
	}
	
}
