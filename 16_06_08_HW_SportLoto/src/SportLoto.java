/**
 * generate seven random unrepeated numbers in the range [1-49]
 * without array or any collection JavaClass
 * @author Катюша
 *
 */
public class SportLoto {
	static byte min=1;
	static byte max=49;
	
	public static void main(String[] args) {
		long res = set7numbers(min, max);
		System.out.println("Your result is:");
		print7numbers(res);
	}

	static void print7numbers(long res) {		
		for (int i=0; i<7 ; i++){
			byte num = getNumber(res, i);
			System.out.print(num+" ");
		}		
	}
	
	static byte getNumber(long res, int i) {
		long tmp = res >> (8*i);
		return (byte)(tmp & 255) ;
	}


	static long set7numbers(byte min, byte max) {
		long res = 0;	
		boolean flagAdd;
		byte number;
		
		for (byte i=0; i<7;i++){
			
			do{
				number=getRandomNumbers(min,max);
				flagAdd=false;
				for (byte j=0 ; j<i ; j++){
					if (checkRepeat(number,res,j))
						flagAdd=true; 
				}				
			} while (flagAdd==true);		
			res = setNumber(number,i,res);
		}
		return res;
	}
	
	private static boolean checkRepeat(byte number, long res, byte j) {
			if (getNumber(res,j) == number){
				return true;
			}
		return false;
	}

	private static long  setNumber(byte number, byte i, long res) {
		long mask = (long)number << (i*8);
		return (res | mask);
		
	}

	static public byte getRandomNumbers (byte min, byte max){
		return (byte) (min + Math.random()*(max-min+1));
	}

}
