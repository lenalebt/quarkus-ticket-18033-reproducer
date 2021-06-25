package org.acme

import io.quarkus.panache.common.Page
import io.quarkus.panache.common.Sort
import org.acme.PeopleResource
import javax.ws.rs.GET
import org.acme.Person
import javax.inject.Inject
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-resteasy")
class GreetingResource {
    @Inject
    lateinit var resource: PeopleResource
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(): List<Person> {
        return resource.list(Page(5), Sort.by("id"))
    }
}