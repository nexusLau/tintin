package cn.com.tintin.vo;

public class PriceVo {
	
	
	static {
		System.out.println("123456");
	}
	
	
	{
		System.out.println("abcdefg");
	}

	public static PriceVo INSTANCR_PRICEVO=new PriceVo(2.8);
	
	double initPrice;
	
	
	double currenPrice;
	
	public PriceVo(){}
	
	public PriceVo( double disCount){
		currenPrice=initPrice-disCount;
	}
	public static void main(String[] args) {
		
	}
}
