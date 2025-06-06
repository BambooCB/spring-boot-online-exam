package lsgwr.exam.service.impl;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExamServiceImplTest {

    @Test
    public void testTrimMiddleLineRemovesTrailingDash() {
        String result = ExamServiceImpl.trimMiddleLine("1-2-3-");
        assertEquals("1-2-3", result);
    }

    @Test
    public void testTrimMiddleLineReturnsOriginalWhenNoTrailingDash() {
        String result = ExamServiceImpl.trimMiddleLine("1-2-3");
        assertEquals("1-2-3", result);
    }
}
