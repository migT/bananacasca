import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class ServiceIsItTrueTests {

    private final org.example.service.ServiceIsItTrue service = new org.example.service.ServiceIsItTrue();

    @Test
    public void testCheckPalindromeString_WhenInputIsPalindrome_ThenReturnTrue() {
        String input = "madam";
        boolean result = service.checkPalindromeString(input);
        assertTrue(result);
    }

    @Test
    public void testCheckPalindromeString_WhenInputIsNotPalindrome_ThenReturnFalse() {
        String input = "hello";
        boolean result = service.checkPalindromeString(input);
        assertFalse(result);
    }
}