package com.apepdcl.billdeskrecon.error;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
//        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false),"1","Failed");
//        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<?> globleExcpetionHandler(Exception ex, WebRequest request) {
//        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false),"1","Failed");
//        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
// 
//    @SuppressWarnings({ "unchecked", "rawtypes" })
//	@Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//           HttpHeaders headers, HttpStatus status, WebRequest request) {
//           ErrorDetails errorDetails = new ErrorDetails(new Date(), "Validation Failed",
//               ex.getBindingResult().toString(),"1","Failed");
//           return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
//    } 
}
