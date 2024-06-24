package org.example.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import org.example.service.ServiceIsItTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClientTests {

    @Test
    void testEvaluatePalindromeString() {
        ServiceIsItTrue serviceMock = mock(ServiceIsItTrue.class);
        when(serviceMock.checkPalindromeString("onino")).thenReturn(true);
        when(serviceMock.checkPalindromeString("Txuba")).thenReturn(false);

        assertTrue(serviceMock.checkPalindromeString("onino"));
        assertFalse(serviceMock.checkPalindromeString("Txuba"));
    }
}
