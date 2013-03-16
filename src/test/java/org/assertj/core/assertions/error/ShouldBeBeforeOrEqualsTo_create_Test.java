/*
 * Created on Sep 26, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.assertj.core.assertions.error;

import static junit.framework.Assert.assertEquals;

import static org.assertj.core.assertions.error.ShouldBeBeforeOrEqualsTo.shouldBeBeforeOrEqualsTo;
import static org.assertj.core.util.Dates.parse;

import org.assertj.core.assertions.description.Description;
import org.assertj.core.assertions.description.TextDescription;
import org.assertj.core.assertions.error.ErrorMessageFactory;
import org.assertj.core.assertions.error.ShouldBeBeforeOrEqualsTo;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests for <code>{@link ShouldBeBeforeOrEqualsTo#create(Description)}</code>.
 * 
 * @author Joel Costigliola
 */
public class ShouldBeBeforeOrEqualsTo_create_Test {

  private ErrorMessageFactory factory;

  @Before
  public void setUp() {
    factory = shouldBeBeforeOrEqualsTo(parse("2011-01-01"), parse("2012-01-01"));
  }

  @Test
  public void should_create_error_message() {
    String message = factory.create(new TextDescription("Test"));
    assertEquals("[Test] expected:<2011-01-01T00:00:00> to be before or equals to:<2012-01-01T00:00:00>", message);
  }
}