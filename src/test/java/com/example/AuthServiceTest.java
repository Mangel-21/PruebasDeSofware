package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {

    @Test
    public void testRegisterAndLogin() {
        AuthService authService = new AuthService();

        assertTrue(authService.register("user1", "pass1"));
        assertFalse(authService.register("user1", "pass1"));  // Usuario ya existe

        assertTrue(authService.login("user1", "pass1"));
        assertFalse(authService.login("user1", "wrongpass")); // Contraseña incorrecta
    }
}
