package com.robihidayat.simulator.simple.controller

import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong


@RestController
class PataniController{

    var counter = AtomicLong()

    @GetMapping("greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

}