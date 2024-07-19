package belajar.testing.repository;

import belajar.testing.data.Person;

public interface PersonRepository {

    Person selectById(String id);

}
