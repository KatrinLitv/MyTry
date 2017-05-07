
public class CalculatorExpression {
	/**
	 * 
	 * @param expression - string contains arithmetic expression, e.g. 
	 * "5 + 10*3/2 +5" могут быть пробелы 1). 5+10; 2). *3  3). /2
	 * four arithmetic operations +  / * -) and natural numbers
	 * arithmetic operation preferences are ignored
	 * if the given expression contains disallowed symbols the method should return 0;
	 * in the case of zero division the method should return 0;
	 * @return
	 */
public static int calculate(String expression){
	String strReady = prepareString(expression);
	if (strReady.equals("-1 : Disallowed symbols!")) 
		return 0;
	return strCalculate(strReady);
}

	private static int strCalculate(String strReady) {
		String numbers[]=strReady.split("[-/\\+\\*]+");
		String oper[]=strReady.split("[^-/\\+\\*]+");
		return getResult(numbers, oper);
	}

	private static int getResult(String[] numbers, String[] oper) {
		int res=Integer.parseInt(numbers[0]);
		for (int i=1 ; i<oper.length ; i++){
			int num = Integer.parseInt(numbers[i]);
			String op = oper[i];
			if (op.equals("+")) res += num;
			else if (op.equals("-")) res -= num;
			else if (op.equals("*")) res *= num;
			else if (op.equals("/")) res /= num;
			else if (op.equals("*-")) res *= -num;
			else if (op.equals("/-")) res /= -num;
			else if (op.equals("+-")) res += -num;
			else {
				return 0;
			}			
		}
		return res;
	}

	private static String prepareString(String expression) {
		String mask="[^0-9 -/\\+\\*]";
		String checkWrongSymbols=expression.replaceAll(mask, "");
		String strReady = checkWrongSymbols.replace(" ", "");
		if (!expression.equals(checkWrongSymbols)|| strReady.contains("/-0") || strReady.contains("/0") || strReady.isEmpty()){
			return "-1 : Disallowed symbols!";
		}
		return "0"+strReady;
	}
}
