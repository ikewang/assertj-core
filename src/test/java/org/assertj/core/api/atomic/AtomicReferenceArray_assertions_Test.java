/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2016 the original author or authors.
 */
package org.assertj.core.api.atomic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;
import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.util.Arrays.array;

import java.util.concurrent.atomic.AtomicReferenceArray;

import org.junit.Test;

public class AtomicReferenceArray_assertions_Test {

  @Test
  public void should_accept_null_atomicReferenceArray() {
    AtomicReferenceArray<?> actual = null;
    assertThat(actual).isNull();
    then(actual).isNull();
  }

  @Test
  public void should_be_able_to_use_any_reference_array_assertions() {
    AtomicReferenceArray<String> actual = new AtomicReferenceArray<>(array("a", "b", "c", "d"));
    assertThat(actual).startsWith("a", "b")
                      .contains("c", atIndex(2))
                      .endsWith("d");
    then(actual).containsExactly("a", "b", "c", "d");
  }

}