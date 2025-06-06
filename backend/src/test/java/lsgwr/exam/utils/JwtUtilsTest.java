package lsgwr.exam.utils;

import io.jsonwebtoken.Claims;
import lsgwr.exam.entity.User;
import org.junit.Test;
import static org.junit.Assert.*;

public class JwtUtilsTest {
    @Test
    public void testGenerateAndCheckToken() {
        User user = new User();
        user.setUserId("1");
        user.setUserUsername("testuser");
        user.setUserAvatar("avatar.png");

        String token = JwtUtils.genJsonWebToken(user);
        assertNotNull(token);

        Claims claims = JwtUtils.checkJWT(token);
        assertNotNull(claims);
        assertEquals("1", claims.get("id"));
        assertEquals("testuser", claims.get("username"));
        assertEquals("avatar.png", claims.get("avatar"));
    }
}
