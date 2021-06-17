package com.p5.adoptions.api.controllers;

import com.p5.adoptions.model.CatDTO;
import com.p5.adoptions.model.ListDTO;
import com.p5.adoptions.service.CatService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/v1/cats")
public class CatController
{
    private final CatService catService;

    public CatController(CatService catService)
    {
        this.catService = catService;
    }

    @GetMapping
    @PreAuthorize("principal.username.startsWith('animal') && hasRole('MOD')")
    public ResponseEntity<ListDTO<CatDTO>> getAllCats(Principal principal )
    {
        return ResponseEntity.ok(catService.findAll());
    }

    @PostMapping
    public void addCat(@RequestBody CatDTO catDto)
    {
        catService.addCat(catDto);
    }

    @GetMapping("/{name}")
    public ResponseEntity<CatDTO> getCatByName(@PathVariable("name") String name)
    {
        return ResponseEntity.ok(catService.findCat(name));
    }
}
