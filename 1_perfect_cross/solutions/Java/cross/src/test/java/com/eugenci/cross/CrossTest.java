package com.eugenci.cross;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class CrossTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CrossTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestSuite suite()
    {
        return new TestSuite( CrossTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testCross()
    {
        Cross cross = new Cross(10);
        // 10 lines of 10 characters plus 10 '\n's = 110
        Assert.assertEquals(cross.toStr().length(), 110 );
    }
}
