package com.example.demo2;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/items")
public class Demo2Controller {

    @Autowired
    private final List<Demo2Dto> demo2DtoList;

    @GetMapping
    public ResponseEntity<Demo2Dto> getDto(@RequestParam("name") String naeme) {
        var dto = demo2DtoList.stream().filter(item -> item.getName().equals(naeme)).findFirst();
        return dto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<Demo2Dto>> getAllDto() {
        return ResponseEntity.ok(demo2DtoList);
    }
}
