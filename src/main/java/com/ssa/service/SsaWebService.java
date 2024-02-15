package com.ssa.service;

import com.ssa.bindings.SsaWebRequest;
import com.ssa.bindings.SsaWebResponse;

public interface SsaWebService {

	public SsaWebResponse getCitizenInfo(SsaWebRequest request);
	
	
}
