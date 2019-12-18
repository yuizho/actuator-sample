package io.github.yuizho.actuatorsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ActuatorSampleApplication

fun main(args: Array<String>) {
    runApplication<ActuatorSampleApplication>(*args)
}
