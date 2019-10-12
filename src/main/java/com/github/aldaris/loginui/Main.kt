package com.github.aldaris.loginui

import io.javalin.Javalin

fun main() {
    val app = Javalin.create { config ->

    }.start(7000)
    app.get("/") { it.render("/templates/index.thyme")}

    Runtime.getRuntime().addShutdownHook(Thread(Runnable { app.stop() }))
}
