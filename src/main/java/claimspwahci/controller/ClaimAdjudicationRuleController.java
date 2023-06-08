package claimspwahci.controller;

import java.util.List;
import java.util.logging.Logger;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import claimspwahci.bean.Response;
import claimspwahci.service.ClaimAdjudicationRuleService;

@RestController
@Slf4j
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
		log.info("request received!!");
		System.out.println("request received for getPartPrice!!");
		return new ResponseEntity<>(
				claimAdjudicationRuleService.getHciPartPrice(partNumber, dealerNumber, roDate, headers), HttpStatus.OK);
	}
	@GetMapping("/tests")
	public String test(){
		System.out.println("hello");
		log.info("Hello world!!");
		return "Hello test application!!";
	}
}
