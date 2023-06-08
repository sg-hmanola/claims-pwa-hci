package claimspwahci.serviceImpl;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import claimspwahci.bean.ApplicationConstants;
import claimspwahci.bean.HCIClient;
import claimspwahci.bean.Response;
import claimspwahci.generated.Dspartprice;
import claimspwahci.service.ClaimAdjudicationRuleService;
import java.io.PrintWriter;
import java.io.StringWriter;

@Service
@Slf4j
public class ClaimAdjudicationRuleServiceImpl implements ClaimAdjudicationRuleService {

	@Autowired
	HCIClient hCIClient;

	@Override
	public Response getHciPartPrice(List<String> partNumber, String dealerNumber, String roDate, HttpHeaders headers) {
		Dspartprice partPriceresponse = null;
                String sStackTrace = null;
		try {
			partPriceresponse = hCIClient.getPartPrice(partNumber, dealerNumber, roDate);
			log.info("Response :: {}",partPriceresponse);
		} catch (Exception e) {
			//e.printStackTrace();
			//log.error("Exception occured " + e.getMessage());
                        
                    StringWriter sw = new StringWriter();
                    PrintWriter pw = new PrintWriter(sw);
                    e.printStackTrace(pw);
                    sStackTrace = sw.toString(); // stack trace as a string
                    //System.out.println(sStackTrace);

		}
                String message = (sStackTrace != null) ? sStackTrace : ApplicationConstants.SUCCESS_STATUS_MESSAGE;
                /*
		return new Response(ApplicationConstants.IS_SUCCESS, "CMS", ApplicationConstants.SUCCESS,
				ApplicationConstants.STATUS_STATUS_CODE, ApplicationConstants.SUCCESS_STATUS_MESSAGE,
				partPriceresponse);
                */
		return new Response(
                        ApplicationConstants.IS_SUCCESS, 
                        "CMS", 
                        ApplicationConstants.SUCCESS,
			ApplicationConstants.STATUS_STATUS_CODE, 
                        //ApplicationConstants.SUCCESS_STATUS_MESSAGE,
                        message,
                        partPriceresponse);
	}

}
