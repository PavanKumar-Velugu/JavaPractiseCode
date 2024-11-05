package cr.pricingmodule;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

import cr.pricingmodule.model.TLDPricing;

public class DynamicSetMethod {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {

		System.out.println("Dynamic SetMethod");
		TLDPricing cTLDPricing = new TLDPricing();
		cTLDPricing.setRegY1(new BigDecimal(10.0));
		cTLDPricing.setRenY1(new BigDecimal(8.0));
		cTLDPricing.setTranY1(new BigDecimal(40.0));
		cTLDPricing.setResY1(new BigDecimal(50.0));
		
		for(int orderType=1; orderType<=2; orderType++) {
			for(int years=1; years<=10; years++) {
				if(orderType== 1 && years == 1)
					continue;
				if(orderType == 2 && years == 1)
					continue;
				if(orderType == 1 && years > 1) {
					BigDecimal price = cTLDPricing.getRegY1().add(cTLDPricing.getRenY1().multiply(BigDecimal.valueOf(years-orderType)));
					try {
						calculatePrice(orderType, years, price, cTLDPricing);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				
				if(orderType == 2 && years > 1) {
					BigDecimal price = cTLDPricing.getRenY1().add(cTLDPricing.getRenY1().multiply(BigDecimal.valueOf(years-1)));
					try {
						calculatePrice(orderType, years, price, cTLDPricing);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
					
			}
		}
		
		System.out.println("TLDPricing: "+cTLDPricing.toString());

	}

	private static void calculatePrice(int orderType, int years, BigDecimal price, TLDPricing cTLDPricing) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String methodName = "";
		if(orderType==1)  
			methodName+= "setRegY" + years;
		else if (orderType==2)
			methodName+= "setRenY" + years;
			
		Method setterMethod = TLDPricing.class.getMethod(methodName, BigDecimal.class);

		// Invoke the setter method with the value
		setterMethod.invoke(cTLDPricing, price);
		
	}
}
