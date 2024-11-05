package cr.pricingmodule;

import java.lang.reflect.Method;

public class DynamicFetchPrice {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		// Example: object with year-specific fields
		RegistrationData data = new RegistrationData();
		data.setReg2021(100);
        data.setReg2022(200);
        data.setReg2023(300);
        
        
		// Fetch only the fields for a specific year
		int specificYear = 2022;  // Example: Fetch only reg2022

		 String methodName = "getReg" + specificYear;

	        try {
	            // Use reflection to find the getter method
	            Method getterMethod = RegistrationData.class.getMethod(methodName);
	            
	            // Invoke the method to get the value
	            Object value = getterMethod.invoke(data);

	            // Output the value
	            System.out.println("Value for year " + specificYear + ": " + value);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
   
	}

}

class RegistrationData {
    private int reg2021;
    private int reg2022;
    private int reg2023;

    // Getter methods
    public int getReg2021() {
        return reg2021;
    }

    public void setReg2021(int reg2021) {
        this.reg2021 = reg2021;
    }

    public int getReg2022() {
        return reg2022;
    }

    public void setReg2022(int reg2022) {
        this.reg2022 = reg2022;
    }

    public int getReg2023() {
        return reg2023;
    }

    public void setReg2023(int reg2023) {
        this.reg2023 = reg2023;
    }
}

