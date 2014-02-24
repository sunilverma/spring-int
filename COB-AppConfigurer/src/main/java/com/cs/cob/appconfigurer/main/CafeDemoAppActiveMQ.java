/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cs.cob.appconfigurer.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cs.cob.appconfigurer.ApplicationConfigurer;
import com.cs.cob.appconfigurer.DrinkType;
import com.cs.cob.appconfigurer.AppSetupRequest;

import java.io.IOException;

/**
 * Main class for sending orders that will be handled in separate, distributed
 * processes. See the README.md file for more information on the order in which
 * to start the processes.
 *
 * @author Christian Posta
 */
public class CafeDemoAppActiveMQ {

	/**
	 * Place some orders.
	 *
	 * @param context spring context
	 * @param count the number of standard orders
	 */
	public static void order(AbstractApplicationContext context, int count){
		ApplicationConfigurer cafe = (ApplicationConfigurer) context.getBean("cafe");
		for (int i = 1; i <= 2; i++) {
			AppSetupRequest order = new AppSetupRequest(i);
			order.addItem(DrinkType.LATTE, 2, false);
			order.addItem(DrinkType.MOCHA, 3, true);
			cafe.placeOrder(order);
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/integration/activemq/cafeDemo-amq-config.xml",
				"/META-INF/spring/integration/activemq/cafeDemo-amq-xml.xml");
		order(context, 25);
		context.close();
	}
}
