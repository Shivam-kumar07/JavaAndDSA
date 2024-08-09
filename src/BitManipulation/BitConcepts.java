package BitManipulation;

public class BitConcepts {

	public static void main(String[] args) {
//		System.out.println(Integer.toBinaryString(20>>1));
		
//		System.out.println(getBit(112,4));
		
//		System.out.println(setBit(7,3));
		
		
	}
	/**
	 * This method is used to set a bit value to 1 of a number at a particular position.
	 * Note: Position is calculated from left of the binary bits and starts from 0.
	 * 
	 * @param n
	 * @param position
	 * @return
	 */
	public static int setBit(int n , int position ) {
		int bitMask = 1<<position;
		return bitMask | n;
	}
	
	/**
	 * This method is used to get a bit value of a number at a particular position.
	 * Note: Position is calculated from left of the binary bits and starts from 0.
	 * 
	 * @param n
	 * @param position
	 * @return
	 */
	public static int getBit(int n , int position) {
		int bitMask = 1<<position;
		if( (bitMask & n )== 0 ) return 0;
		return 1;
	}

}
