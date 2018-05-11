/*******************************************************************************
 *
 * Pentaho Big Data
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.runtime.test.i18n.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bryan on 8/27/15.
 */
public class BaseMessagesMessageGetterImplTest {
  private BaseMessagesMessageGetterImpl baseMessagesMessageGetter;

  @Before
  public void setup() {
    baseMessagesMessageGetter = new BaseMessagesMessageGetterImpl( BaseMessagesMessageGetterFactoryImplTest.class );
  }

  @Test
  public void testGetMesssage() {
    String message = "message";
    String expected = "!" + message + "!";
    assertEquals( expected, baseMessagesMessageGetter.getMessage( message ) );
    assertEquals( expected, baseMessagesMessageGetter.getMessage( message, "testParam" ) );
  }
}
