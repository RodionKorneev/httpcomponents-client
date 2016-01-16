/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.hc.client5.http.entity.mime;

import java.io.File;

import org.apache.hc.client5.http.entity.mime.content.FileBody;
import org.apache.hc.core5.http.entity.ContentType;
import org.junit.Assert;
import org.junit.Test;

public class FormBodyPartTest {

    @Test
    public void testConstructorCompat() throws Exception {
        final File tmp= File.createTempFile("test", "test");
        tmp.deleteOnExit();
        final FileBody obj = new FileBody(tmp, ContentType.APPLICATION_OCTET_STREAM);
        Assert.assertEquals(tmp.getName(), obj.getFilename());
    }
}