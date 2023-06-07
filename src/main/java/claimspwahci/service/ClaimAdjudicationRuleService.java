package claimspwahci.service;

import java.util.List;

import org.springframework.http.HttpHeaders;

import claimspwahci.bean.Response;

public interface ClaimAdjudicationRuleService {
	 public Response getHciPartPrice(List<String> partNumber,String dealerNumber,String roDate,HttpHeaders headers);
}
