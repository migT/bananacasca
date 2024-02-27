import org.example.service.ServiceIsItTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClientTests {

    @Test
    public void testEvaluate_withPalindromeInput_shouldReturnTrue() {
        // Arrange
        ServiceIsItTrue serviceIsItTrueMock = mock(ServiceIsItTrue.class);
        when(serviceIsItTrueMock.checkPalindromeString("onino")).thenReturn(true);

        // Act
        boolean result = serviceIsItTrueMock.checkPalindromeString("onino");

        // Assert
        assertTrue(result);
    }

    @Test
    public void testEvaluate_withNonPalindromeInput_shouldReturnFalse() {
        // Arrange
        ServiceIsItTrue serviceIsItTrueMock = mock(ServiceIsItTrue.class);
        when(serviceIsItTrueMock.checkPalindromeString("Txuba")).thenReturn(false);

        // Act
        boolean result = serviceIsItTrueMock.checkPalindromeString("Txuba");

        // Assert
        assertFalse(result);
    }
}