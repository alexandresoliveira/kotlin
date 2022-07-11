package com.example.infra.controllers.v1.users.create

import com.example.domain.core.ApiService
import com.example.domain.core.users.create.UsersCreateInput
import com.example.domain.core.users.create.UsersCreateOutput
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.util.UriComponentsBuilder
import java.util.*
import javax.validation.constraints.Email
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@RestController
@RestControllerAdvice
@RequestMapping("v1/users/create")
class UsersCreateController(
    @Qualifier("UsersCreateService") val service: ApiService<UsersCreateInput, UsersCreateOutput>
) {

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun handle(
        @RequestBody request: UsersCreateRequest,
        uriComponentBuilder: UriComponentsBuilder
    ): ResponseEntity<UsersCreateResponse> {
        var input = UsersCreateInput(request.name, request.email, request.age)
        var output = service.execute(input)
        var response = UsersCreateResponse(
            output.id,
            output.name,
            output.email,
            output.age
        )
        var uri = uriComponentBuilder.path("v1/users/{id}").buildAndExpand(response.id).toUri()
        return ResponseEntity.created(uri).body(response);
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    fun exceptionHandle(exception: MethodArgumentNotValidException) : ResponseEntity<MutableList<Pair<String, String>>> {
        var resultBody = mutableListOf<Pair<String, String>>()

        exception
            .bindingResult
            .fieldErrors
            .forEach { fe -> resultBody.add(Pair(fe.field, fe.defaultMessage!!)) }

        return ResponseEntity.badRequest().body(resultBody)
    }

}

data class UsersCreateRequest(
    @NotNull
    @NotEmpty
    val name: String,

    @NotNull
    @NotEmpty
    @Email
    val email: String,

    @NotNull
    @Min(value = 0)
    val age: Int
)

data class UsersCreateResponse(
    val id: UUID,
    val name: String,
    val email: String,
    val age: Int
)