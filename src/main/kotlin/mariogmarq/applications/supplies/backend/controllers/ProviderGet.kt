package mariogmarq.applications.supplies.backend.controllers

import io.ktor.application.*
import io.ktor.http.*

val ProviderGetController: Controller = {
    call.response.status(HttpStatusCode.OK)
}