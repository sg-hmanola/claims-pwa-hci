package claimspwahci.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import claimspwahci.bean.ApplicationConstants;
import claimspwahci.bean.HCIClient;
import claimspwahci.bean.Response;
import claimspwahci.generated.Dspartprice;
import claimspwahci.service.ClaimAdjudicationRuleService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ClaimAdjudicationRuleServiceImpl implements ClaimAdjudicationRuleService {

	@Autowired
	HCIClient hCIClient;

	@Override
	public Response getHciPartPrice(List<String> partNumber, String dealerNumber, String roDate, HttpHeaders headers) {
		log.info("Inside getHciPartPrice method under service Impl");
		System.out.println("getHciPartPrice method under service");
		Dspartprice partPriceresponse = null;
		try {
			partPriceresponse = hCIClient.getPartPrice(partNumber, dealerNumber, roDate);
			System.out.println("Response :: " + partPriceresponse);
		} catch (Exception e) {
			log.error("Exception occured " + e.getMessage());
			System.out.println("Exception occured " + e.getMessage());
			e.printStackTrace();
		}
		return new Response(ApplicationConstants.IS_SUCCESS, "CMS", ApplicationConstants.FAILED,
				ApplicationConstants.INTERNAL_ERROR_STATUS_CODE, ApplicationConstants.INTERNAL_ERROR_STATUS_MESSAGE,
				partPriceresponse);

	}

}
