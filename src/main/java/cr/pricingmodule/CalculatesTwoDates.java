package cr.pricingmodule;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CalculatesTwoDates {

	public static void main(String[] args) {
		
		String offerStartDate = "2024-08-01 10:00:00";
        String offerEndDate = "2024-08-31 23:59:59";
        String reqOffer = "2024-08-01 09:00:00";

        boolean result = isOfferDateInRange(offerStartDate, offerEndDate, reqOffer);
        System.out.println("Is the requested offer date in range? " + result);

	}

	private static boolean isOfferDateInRange(String offerStartDate, String offerEndDate, String reqOffer) {
		
		DateTimeFormatter cDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        boolean isValid = false;

        try {
            // Parse the dates
            LocalDateTime offerDateTime = LocalDateTime.parse(offerStartDate, cDateTimeFormatter);
            LocalDateTime otherDateTime = LocalDateTime.parse(offerEndDate, cDateTimeFormatter);
            LocalDateTime reqOfferDateTime = LocalDateTime.parse(reqOffer, cDateTimeFormatter);

            // Check if reqOffer is between offerStartDate and offerEndDate (inclusive)
            isValid = (reqOfferDateTime.isAfter(offerDateTime) || reqOfferDateTime.isEqual(offerDateTime))
                    &&
                      (reqOfferDateTime.isBefore(otherDateTime) || reqOfferDateTime.isEqual(otherDateTime));
                      
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            return false;
        }

        return isValid;
	}

}
