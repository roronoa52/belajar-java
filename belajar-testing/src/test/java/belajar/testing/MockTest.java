package belajar.testing;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {

    @Test
    void Testmock(){
        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("Yp");
        Mockito.when(list.get(1)).thenReturn("Farhan");

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        Mockito.verify(list, Mockito.times(1)).get(0);

    }


}
