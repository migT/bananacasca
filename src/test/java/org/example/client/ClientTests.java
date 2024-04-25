package org.example.client;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterAll;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @InjectMocks
    private Client client;

    @Test
    public void testCheckPalindromeString_withPalindrome() {
        boolean result = client.serviceIsItTrue.checkPalindromeString("radar");
        assertThat(result).isTrue();
    }

    @Test
    public void testCheckPalindromeString_withNonPalindrome() {
        boolean result = client.serviceIsItTrue.checkPalindromeString("hello");
        assertThat(result).isFalse();
    }

}