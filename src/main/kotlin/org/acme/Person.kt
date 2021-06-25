package org.acme

import io.quarkus.hibernate.orm.panache.PanacheEntityBase
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "persons")
class Person : PanacheEntityBase() {
    @Id
    @Column
    var id: Int? = null

    @Column
    var name: String? = null
}