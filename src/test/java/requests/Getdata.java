package requests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Getdata {

	@Test
	public void responsedata()
	{
 		
		//RestAssured.baseURI = "https://securegw-stage.paytm.in/theia/api/v2/fetchPaymentOptions?mid={mid}&orderId=ORDERID_98765";
		 
		//RestAssured.baseURI = "https://securegw-stage.paytm.in/v3/order/status";
		
		String api = "https://securegw-stage.paytm.in/order/process?CALLBACK_URL=http%3A%2F%2Flocalhost%3A8080%2Fpgresponse&CHANNEL_ID=WEB&CHECKSUMHASH=BIglug3Ui8m6JpKZVMq1x%2BFK%2FCbBgFlLBMwvZBuriTv31zn8a%2BdBSs3WNSi%2BaJR5tgrB9osrdhlgsGoBeZRcg1ohd4xAtdRznXpvDhgtpz8%3D&CUST_ID=342876&EMAIL=pushkarsingh978%40gmail.com&INDUSTRY_TYPE_ID=Retail&MID=enKbJM62403241118387&MOBILE_NO=8459386705&ORDER_ID=ORDERID_98765&TXN_AMOUNT=2&WEBSITE=WEBSTAGING";
		
		RestAssured.baseURI = api;
		
		
		 RequestSpecification httpRequest = RestAssured.given();
		 
		 
		 Response response = httpRequest.request(Method.GET);
		 
		 
		 String responseBody = response.getBody().asString();
		 System.out.println("Response Body is =>  " + responseBody);
		 
	}
	
	
	@Test
	public void getresponsecode()
	{
		
		String api = "https://securegw-stage.paytm.in/order/process?CALLBACK_URL=http%3A%2F%2Flocalhost%3A8080%2Fpgresponse&CHANNEL_ID=WEB&CHECKSUMHASH=BIglug3Ui8m6JpKZVMq1x%2BFK%2FCbBgFlLBMwvZBuriTv31zn8a%2BdBSs3WNSi%2BaJR5tgrB9osrdhlgsGoBeZRcg1ohd4xAtdRznXpvDhgtpz8%3D&CUST_ID=342876&EMAIL=pushkarsingh978%40gmail.com&INDUSTRY_TYPE_ID=Retail&MID=enKbJM62403241118387&MOBILE_NO=8459386705&ORDER_ID=ORDERID_98765&TXN_AMOUNT=2&WEBSITE=WEBSTAGING";
		
		RestAssured.baseURI = api;
		
		RequestSpecification httpRequest = RestAssured.given();
		 
		 Response response = httpRequest.get();//this will pass
		 //Response response = httpRequest.get("/4222");//this will show error(fail)
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
	}
}
