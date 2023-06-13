package claimspwahci.service;

import org.springframework.http.HttpHeaders;

import claimspwahci.bean.HciRequest;
import claimspwahci.bean.Response;

public interface ClaimAdjudicationRuleService {
	public Response getHciPartPrice(HciRequest hciRequest, HttpHeaders headers);
}
