package com.ssa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.bindings.SsaWebRequest;
import com.ssa.bindings.SsaWebResponse;
import com.ssa.service.SsaWebService;

@RestController
public class SsaWebRestController {

	@Autowired
	private SsaWebService service;
	
	@PostMapping("/ssa")
	public SsaWebResponse getCitizenInfo(@RequestBody SsaWebRequest req) {
		return service.getCitizenInfo(req);
		
	}
}
