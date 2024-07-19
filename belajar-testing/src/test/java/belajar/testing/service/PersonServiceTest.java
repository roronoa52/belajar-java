package belajar.testing.service;


import belajar.testing.data.Person;
import belajar.testing.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions(
        @ExtendWith(MockitoExtension.class)
)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;
    private PersonService personService;

    @BeforeEach
    void setUp(){
        personService = new PersonService(personRepository);
    }

    @Test
    void TestGetPersonNotFound(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            personService.get("tes");
        });
    }

    @Test
    void TestGetPersonSuccess(){

        Mockito.when(personRepository.selectById("yp")).thenReturn(new Person("yp", "Yp"));

        var person = personService.get("yp");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("yp", person.getId());
        Assertions.assertEquals("Yp", person.getName());

    }

}
