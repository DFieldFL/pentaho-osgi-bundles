/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2016 Pentaho Corporation..  All rights reserved.
 */
package org.pentaho.platform.pdi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by nbaker on 9/8/16.
 */
public class PlatformWebResourceTest {

  PlatformWebResource webResource = new PlatformWebResource( "context", "location" );

  @Test
  public void getContext() throws Exception {
    assertEquals( "context", webResource.getContext() );
  }

  @Test
  public void getLocation() throws Exception {
    assertEquals( "location", webResource.getLocation() );
  }

  @Test
  public void testEquals() throws Exception {
    assertEquals( webResource, new PlatformWebResource( "context", "location" ) );
    assertEquals( webResource, webResource );
  }

  @Test
  public void testNotEquals() throws Exception {
    assertNotEquals( webResource, new PlatformWebResource( "context", "blah" ) );
    assertNotEquals( webResource, null );
  }

}