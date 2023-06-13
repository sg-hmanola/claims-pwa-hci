package claimspwahci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import claimspwahci.bean.HciRequest;
import claimspwahci.bean.Response;
import claimspwahci.service.ClaimAdjudicationRuleService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ClaimAdjudicationRuleController {
	@Autowired
	private ClaimAdjudicationRuleService claimAdjudicationRuleService;

	@PostMapping(value = "/v1/claims/HciPartPrice", produces = "application/json")
	public ResponseEntity<Response> getPartPrice(@RequestHeader(value = "clientUserId") String clientUserId,
			@RequestHeader(value = "applicationName") String applicationName,
			@RequestHeader(value = "traceId") String traceId,
			@RequestBody HciRequest hciRequest,
			@RequestHeader HttpHeaders headers) {
		log.info("request received!!");
		System.out.println("request received for getPartPrice!!");
		return new ResponseEntity<>(
				claimAdjudicationRuleService.getHciPartPrice(hciRequest, headers), HttpStatus.OK);
	}
	@GetMapping("/tests")
	public String test(){
		System.out.println("hello");
		log.info("Hello world!!");
		return "Hello test application!!";
	}
}
