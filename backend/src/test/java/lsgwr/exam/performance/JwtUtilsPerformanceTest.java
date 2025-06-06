package lsgwr.exam.performance;

import lsgwr.exam.entity.User;
import lsgwr.exam.utils.JwtUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class JwtUtilsPerformanceTest {

    @Test
    public void testTokenGenerationPerformance() {
        User user = new User();
        user.setUserId("1");
        user.setUserUsername("perfuser");
        user.setUserAvatar("avatar.png");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            String token = JwtUtils.genJsonWebToken(user);
            assertNotNull(token);
        }
        long end = System.currentTimeMillis();
        System.out.println("Generate 1000 tokens cost " + (end - start) + " ms");
    }
}
