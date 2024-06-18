package training7_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoinCase
{
    private int  Yen500 = 0;
    private int Yen100 = 0;
    private int Yen50 = 0;
    private int Yen10 = 0;
    private int Yen5 = 0;
    private int Yen1 = 0;
    
    public void AddCoins(int type, int count) {
    	switch(type){
    	case 500:
    		Yen500 += count;
    		break;
    	case 100:
    		Yen100 += count;
    		break;
    	case 50:
    		Yen50 += count;
    		break;
    	case 10:
    		Yen10 += count;
    		break;
    	case 5:
    		Yen5 += count;
    		break;
    	case 1:
    		Yen1 += count;
    		break;
    	}
    }
    
    public int GetCount(int type) {
    	switch(type) {
    	case 500:
    		return Yen500;
    	case 100:
    		return Yen100;
    	case 50:
    		return Yen50;
    	case 10:
    		return Yen10;
    	case 5:
    		return Yen5;
    	case 1:
    		return Yen1;
    	}
    	return 0;
    }
    
    public int GetAmount() {
    	return 500 * Yen500 + 500 * Yen500 + 100 * Yen100 + 50 * Yen50 + 10 * Yen10 + 5 * Yen5 + 1 * Yen1;
    }
    
}

public class Exercise7_5
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        
        CoinCase coinc = new CoinCase();
        
        for(int i = 0; i < 10; i++) {
        	System.out.print("硬貨の種類は？");
        	int type =  Integer.parseInt( br.readLine() );
        	System.out.print("硬貨の枚数は？");
        	int count =  Integer.parseInt( br.readLine() );
        	
        	coinc.AddCoins(type, count);
        }

        System.out.println("500円硬貨の枚数は" + coinc.GetCount(500));
        System.out.println("100円硬貨の枚数は" + coinc.GetCount(100));
        System.out.println("50円硬貨の枚数は" + coinc.GetCount(50));
        System.out.println("10円硬貨の枚数は" + coinc.GetCount(10));
        System.out.println("5円硬貨の枚数は" + coinc.GetCount(50));
        System.out.println("1円硬貨の枚数は" + coinc.GetCount(1));
        System.out.println("総額は" + coinc.GetAmount());
    }
}