package org.example.client;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

import org.mockito.Mockito;
import org.example.service.ServiceIsItTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Mock
    private ServiceIsItTrue serviceIsItTrue;

    @Test
    public void testCheckPalindromeString_whenPalindrome_thenTrue() {
        when(serviceIsItTrue.checkPalindromeString("onino")).thenReturn(true);
        assertTrue(serviceIsItTrue.checkPalindromeString("onino"));
    }

    @Test
    public void testCheckPalindromeString_whenNotPalindrome_thenFalse() {
        when(serviceIsItTrue.checkPalindromeString(Mockito.anyString())).thenReturn(false);
        assertFalse(serviceIsItTrue.checkPalindromeString("Txuba"));
    }

}