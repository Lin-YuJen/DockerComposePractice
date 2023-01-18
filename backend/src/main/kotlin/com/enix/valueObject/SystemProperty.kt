package com.enix.valueObject

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "system_property")
class SystemProperty(
    @Id
    @Column(name = "name")
    val name: String,
    @Column(name = "value")
    val value: String
)