package org.example.client;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import org.example.service.ServiceIsItTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientTests {

    @Test
    void testEvaluatePalindrome() {
        ServiceIsItTrue serviceIsItTrue = new ServiceIsItTrue();
        assertTrue(serviceIsItTrue.checkPalindromeString("onino"));
    }

    @Test
    void testEvaluateNonPalindrome() {
        ServiceIsItTrue serviceIsItTrue = new ServiceIsItTrue();
        assertFalse(serviceIsItTrue.checkPalindromeString("Txuba"));
    }

}
