/*
 * Copyright 2002-2016 Jalal Kiswani.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jk.examples.dropwizard.health;

import com.yammer.metrics.core.HealthCheck;

/**
 * HealthCheck implmenetation based on DropWhizard recommandation , howvere ,
 * this implementation is still empty , and to be completed in the future if
 * needed.
 *
 * @author Jalal Kiswani
 */
public class ExampleServiceHealthCheck extends HealthCheck {

	/**
	 * Default Constrcutor.
	 */
	public ExampleServiceHealthCheck() {
		super("Users Health Check");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.yammer.metrics.core.HealthCheck#check()
	 */
	@Override
	protected Result check() throws Exception {
		// TODO : complete the health checks
		return Result.healthy();
	}

}
