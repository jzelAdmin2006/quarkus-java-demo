package com.jzel;

import jakarta.ws.rs.QueryParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleResource {
  @GetMapping("/ping")
  public ResponseEntity<PingPongResponse> pingPong() {
    return ResponseEntity.ok(new PingPongResponse("pong"));
  }

  @GetMapping("/plus")
  public ResponseEntity<ResultResponse> plus(@QueryParam("a") int a, @QueryParam("b") int b) {
    return ResponseEntity.ok(new ResultResponse(a + b));
  }
}
