package practice01;

public class Prob5 {
	
	
	public static void main(String[] args) {
		//solution1();
		solution2();
	}
	
	public static void solution1() {
		for( int i = 1; i <= 100; i++ ) {
			
			String s = String.valueOf( i );
			int length = s.length();
			int clap = 0;
			
			for( int j = 0; j < length; j++ ) {
				char c = s.charAt( j );
				if( c == '3' || c == '6' || c == '9' ) {
					clap++;
				}
			}
			
			if( clap == 0 ) {
				continue;
			}
			
			System.out.print( s + " " );
			for( int j = 0; j < clap; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.print( "\n" );
		}		
	}
	
	
	public static void solution2() {
		
		for( int i = 1; i <= 100000; i++ ) {
			
			int temp = i;
			int exp = (int)Math.ceil( Math.log10( temp ) );
			int clap = 0;

			for( int j = exp-1; j >= 0; j-- ) {
			
				int base = (int)Math.pow( 10, (double)j );
				int number = temp / base;
				temp -= number * base;
				
				if( number == 3 || number == 6 || number == 9 ) {
					clap++;
				}
			}
			
			if( clap == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			for( int j = 0; j < clap; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.print( "\n" );
		}		
	}
}