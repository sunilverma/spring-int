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

package com.cs.cob.appconfigurer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.cs.cob.common.Application;

/**
 * @author Mark Fisher
 * @author Marius Bogoevici
 * @author Tom McCuch
 * @author Gunnar Hillert
 */
public class AppSetupRequest implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Application> applicationList = new ArrayList<Application>();

	/** the order number used for tracking */
	private int number;

	// Default constructor required by Jackson Java JSON-processor
	public AppSetupRequest() {}

	public AppSetupRequest(int number) {
		this.number = number;
	}

	/*public void addItem(DrinkType drinkType, int shots, boolean iced) {
		this.applicationList.add(new Application(this.number, drinkType, shots, iced));
	}*/

	public void addItem(String appName) {
		this.applicationList.add(new Application(this.number, appName));
	}

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Application> getItems() {
		return this.applicationList;
	}

	public void setItems(List<Application> orderItems) {
		this.applicationList = orderItems;
	}
}
