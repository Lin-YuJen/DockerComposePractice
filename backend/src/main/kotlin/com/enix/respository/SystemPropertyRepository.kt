package com.enix.respository

import com.enix.valueObject.SystemProperty
import org.springframework.data.jpa.repository.JpaRepository

interface SystemPropertyRepository : JpaRepository<SystemProperty, String>