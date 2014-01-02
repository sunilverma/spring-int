package com.cs.cob;

import org.springframework.integration.annotation.Gateway;

public interface ClientOnboarding {
	
	void startOnboarding(OnboardingRequest request);

}
