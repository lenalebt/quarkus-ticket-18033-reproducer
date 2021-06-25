package org.acme

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource
import org.acme.Person

interface PeopleResource : PanacheEntityResource<Person, Long>