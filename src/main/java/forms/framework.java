/**
 *
 * @author mangostynn
 */
package forms;
import static forms.Database.*;

public class framework {
    
    /**
     * Multiplies the amount of energy consumed by the the electricity rate.
     * @param consumed The energy consumed (kWH).
     * @param type The service type of the consumer.
     * @param month
     * @return The total amount due.
     */
    public static float getAmount(int consumed, String type, String month){
        /**
         * Returns the price to be paid.
         * @param comsumed 
         * @param days The length of days the energy is consumed
         * @return The total amount due
         */
        float[] rates = getRates(month);
        float rate = 0f;
        float additional = 0f;
        switch (type) {
            case "Residential":
                rate = rates[0]; // Base
                if (consumed <= 200){
                    rate +=  rates[1];
                } else if (consumed <= 300){
                    rate += rates[2];
                } else if (consumed <= 400){
                    rate += rates[3];
                } else{
                    rate += rates[4];
                }   if (consumed <= 20){
                    rate *= 1.00f - rates[5];
                } else if (consumed <= 50){
                    rate *= 1.00f - rates[6];
                } else if (consumed <= 70){
                    rate *= 1.00f - rates[7];
                } else if (consumed <= 100){
                    rate *= 1.00f - rates[8];
                }   additional += rates[9];
                break;
            case "General Service":
                rate = rates[10];
                if (consumed <= 200){
                    rate +=  rates[11];
                } else if (consumed <= 300){
                    rate += rates[12];
                } else if (consumed <= 400){
                    rate += rates[13];
                } else{
                    rate += rates[14];
                }   break;
            default:
                rate = rates[15];
                float tempKW = consumed / 720;
                if (tempKW < 200){
                    additional += tempKW * (rates[16]);
                } else if (tempKW < 750){
                    additional += tempKW * (rates[17]);
                } else{
                    additional += tempKW * (rates[18]);
                }   break;
        }
        
        
        float total = consumed * rate + additional;
        System.out.println(rate);
        return (Math.round(total * 100f)/100f);
    }
    
    /**
     * Calculates the rate depending on the usage amount.
     * @param consumed
     * @param type
     * @return The rate per kilowatt-hour.
     */
    public static float getRate(int consumed, char type){
        int subsidies = 656;
        int rate = 66357 + subsidies;
        
        if (type == 'R' && consumed <= 00){
            rate -= subsidies;
            }
        if (type == 'R' || type == 'S'){
            if (consumed <= 200){
                rate += 10012; // TODO: Change to variable
            } else if (consumed <= 300){
                rate += 13016; // TODO: Change to variable
            } else if (consumed <= 400){
                rate += 16019; // TODO: Change to variable
            } else if (consumed > 400){
                rate += 21025; // TODO: Change to variable
            }
        } else{ // General Power
            rate = 54436;
        }
        return rate/10000f;
    }
}
