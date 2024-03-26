package hei.school.soratra.endpoint.rest.controller;

import hei.school.soratra.service.TaratasyService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/soratra/")
public class TaratasyController {
    private final TaratasyService service;

    @PutMapping(value = "{id}")
    public ResponseEntity<Response> putModifiedText(@PathVariable(name = "id") String id, @RequestBody byte[] file) {
        try {
            return ResponseEntity.ok(service.uploadAndModifyText(id, file));
        } catch (Exception e) {
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Response> getResponse(@PathVariable(name = "id") String id) {
        try {
            return ResponseEntity.ok(service.getResponse(id));
        } catch (Exception e) {
            return ResponseEntity.ok().build();
        }
    }
}