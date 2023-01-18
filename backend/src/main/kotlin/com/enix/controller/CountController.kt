package com.enix.controller

import com.enix.respository.SystemPropertyRepository
import com.enix.valueObject.SystemProperty
import com.google.gson.JsonObject
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/count")
class CountController(
    val systemPropertyRepository: SystemPropertyRepository
) {

    @GetMapping("/get")
    @ResponseBody
    fun count(): JsonObject {
        val count = systemPropertyRepository.findById("count").get().value.toInt()
        systemPropertyRepository.save(SystemProperty("count", (count + 1).toString()))
        return JsonObject().apply {
            addProperty("count", count)
        }
    }
}