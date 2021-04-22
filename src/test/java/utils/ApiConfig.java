package utils;

import java.util.ResourceBundle;

/**
 *
 * This class will return values from respective config files
 */

public class ApiConfig {

    private static ResourceBundle resourceBundle=ResourceBundle.getBundle("configs/"+System.getProperty("envType"));

    public static String getMerchantid(){
        return resourceBundle.getString("merchantId");
    }

    public static String getMerchantkey(){
        return resourceBundle.getString("merchantKey");
    }

   

    

}
