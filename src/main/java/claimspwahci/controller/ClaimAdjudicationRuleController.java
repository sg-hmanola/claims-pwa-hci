package claimspwahci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import claimspwahci.bean.Response;
import claimspwahci.service.ClaimAdjudicationRuleService;

@RestController
public class ClaimAdjudicationRuleController {
	@Autowired
	private ClaimAdjudicationRuleService claimAdjudicationRuleService;

	@PostMapping(value = "/v1/claims/HciPartPrice", produces = "application/json")
	public ResponseEntity<Response> getPartPrice(@RequestHeader(value = "clientUserId") String clientUserId,
			@RequestHeader(value = "applicationName") String applicationName,
			@RequestHeader(value = "traceId") String traceId,
			@RequestParam(value = "partNumber") List<String> partNumber,
			@RequestParam(value = "dealerNumber") String dealerNumber, @RequestParam(value = "roDate") String roDate,
			@RequestHeader HttpHeaders headers) {

		return new ResponseEntity<>(
				claimAdjudicationRuleService.getHciPartPrice(partNumber, dealerNumber, roDate, headers), HttpStatus.OK);
	}
}
