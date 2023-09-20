package com.majcher.blogbackend;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE)
class ExternalSystemUnavailableException extends RuntimeException {
}
