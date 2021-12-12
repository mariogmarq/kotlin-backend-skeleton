package mariogmarq.applications.supplies.backend.controllers

import io.ktor.application.*
import io.ktor.util.pipeline.*

typealias Controller = suspend PipelineContext<Unit, ApplicationCall>.(Unit) -> Unit