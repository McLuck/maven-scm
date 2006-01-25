package org.apache.maven.scm;

/*
 * Copyright 2001-2006 The Apache Software Foundation.
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

import junit.framework.TestCase;

/**
 * @author <a href="mailto:evenisse@apache.org">Emmanuel Venisse </a>
 * @version $Id: ChangeLogFileTest.java,v 1.1.1.1 2004/04/20 19:05:52 jvanzyl
 *          Exp $
 */
public class ChangeFileTest
    extends TestCase
{
    public void testNewFile()
    {
        ChangeFile f = new ChangeFile( "test.java" );
        assertEquals( "test.java", f.getName() );
        assertEquals( null, f.getRevision() );
        assertEquals( "test.java", f.toString() );
    }

    public void testNewRevisionFile()
    {
        ChangeFile f = new ChangeFile( "test.java", "revision1" );
        assertEquals( "test.java", f.getName() );
        assertEquals( "revision1", f.getRevision() );
        assertEquals( "test.java, revision1", f.toString() );
    }
}
